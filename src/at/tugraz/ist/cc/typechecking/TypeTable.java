package at.tugraz.ist.cc.typechecking;

import at.tugraz.ist.cc.TypeCheckErrorListener;
import at.tugraz.ist.cc.io.OurLogger;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;

/*

Type
    String params;
    String returnType;
    boolean isPrivate;
    Map<String, Type> members

UnrefType : Type
UnaccessType : Type

IntType : Type
BoolType : Type
StringType : Type
NixType : Type
CallableType : Type

MemberType : Type
    bool isPrivate
ClassType : Type


*/

class Type
{
    public SymbolTable symbolTable = null;

    String params;
    String returnType;
    boolean isPrivate;
    public HashMap<String, MemberType> members = new LinkedHashMap<>();

    Type(String params, String returnType){
        this.params = params;
        this.returnType = returnType;
    }

    public Symbol inst(String scope, String name){
        return new Symbol(scope, this, name);
    }

    public void forEach(BiConsumer<String, MemberType> f) {
        members.forEach(f);
    }

    public String lookupMember(String id, Function<MemberType, String> onOk, Runnable onErr) {
        OurLogger.getInstance().print(String.format("    ↷   %-40s ", this.returnType + " ⌕ " + id));
        MemberType m = members.get(id);

        if (m != null) {
            OurLogger.getInstance().print(String.format("%20s ✓\n", m.toString()));
            return onOk.apply(m);
        }
        else {
            OurLogger.getInstance().print(String.format("%39s✖\n", ""));
            onErr.run();
            return "Unres";
        }
    }

    public void addMember(String name, MemberType type, Runnable onOk, Runnable onErr, Runnable onAddMemberToMain){
        if (returnType.equals("Main") && !name.equals("main()"))
            onAddMemberToMain.run();

        else if (members.containsKey(name) ||
            name.equals("print(int)") ||
            name.equals("print(String)")  ||
            name.equals("print(bool)"))
            onErr.run();

        else{
            this.members.put(name, type);
            OurLogger.getInstance().print(String.format("  ﹢     %-40s %s\n", name, type.toString()));
            onOk.run();
        }
    }

    @Override
    public String toString(){
        return String.format("%20s → %-15s", params, returnType);
    }
}

class UnrefType  extends Type { public UnrefType()  { super("", "Unres");  } }
class BoolType   extends Type { public BoolType()   { super("", "bool");   } }
class IntType    extends Type { public IntType()    { super("", "int");    } }
class StringType extends Type { public StringType() { super("", "String"); } }
class NixType extends Type { public NixType() { super("", "nix"); } }

class ClassType extends Type
{
    public ClassType(String returnType) { super("", returnType); }
}

class CallableType extends Type
{
    public CallableType(String params, String returnType, SymbolTable symbolTable)
    {
        super(params, returnType);
        this.symbolTable = symbolTable;
    }
}

class UnaccType extends Type
{
    UnaccType() { super("", "Unres"); }
}

class MemberType extends Type
{

    MemberType(boolean isPrivate, Type src) {
        super(src.params, src.returnType);
        this.isPrivate = isPrivate;
        this.symbolTable = src.symbolTable;
        this.params = src.params;
        this.returnType = src.returnType;
        src.forEach((k, v)-> members.put(k, v));
    }

    @Override
    public String toString(){
        return String.format("%20s → %-14s%s",
                params,
                returnType,
                isPrivate == true?"-":"+");
    }
}

public class TypeTable
{
    TypeCheckErrorListener errors;
    TypeCheckErrorListener warnings;
    private final HashMap<String, Type> types = new LinkedHashMap<>();

    TypeTable(TypeCheckErrorListener errors, TypeCheckErrorListener warnings){
        this.errors = errors;
        this.warnings = warnings;
        OurLogger.getInstance().print("----------------------------------- adding primitives -----------------------------------\n");
        add(new BoolType());
        add(new StringType());
        add(new IntType());
        add(new NixType());
    }

    public String lookup(String name, Consumer<Type> onOk, Runnable onErr){
        Type type = types.get(name);
        if (type != null){
            onOk.accept(type);
            return name;
        }
        else{
            OurLogger.getInstance().print(String.format("★       %-75s ", name));
            OurLogger.getInstance().print(String.format(" #%d ✖\n", errors.size() + 1));
            onErr.run();
            return "Unres";
        }
    }

    boolean addClass(String className, Runnable onErr){
        if (types.containsKey(className)) {
            onErr.run();
            return false;
        }
        else {
            add(new ClassType(className));
            return true;
        }
    }

    private void add(Type type){
        this.types.put(type.returnType, type);
        OurLogger.getInstance().print(String.format("★       %-59s() → %s\n", type.returnType,  type.returnType));
    }

    public Type get(String name){
        return types.get(name);
    }
}