package at.tugraz.ist.cc.typechecking;

import at.tugraz.ist.cc.TypeCheckErrorListener;
import at.tugraz.ist.cc.io.OurLogger;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.function.Function;

class Symbol
{
    String id;
    String line;
    String scope;
    Type type;
    public int nr;

    public Symbol(String scope, Type type, String id)
    {
        this.scope = scope;
        this.type = type;
        this.id = id;
    }
}

public class SymbolTable
{
    TypeCheckErrorListener errors;
    TypeCheckErrorListener warnings;

    // key ist immer das was im jova src verwendet wird.
    // bsp: <local>, <mebmer> (klassen brauchen wir nicht als symbol oder?, und no hide)
    public final HashMap<String, Symbol> symbols = new LinkedHashMap<>();

    int counter = 1;

    public SymbolTable(TypeCheckErrorListener errors, TypeCheckErrorListener warnings) {
        this.errors = errors;
        this.warnings = warnings;
        OurLogger.getInstance().print("-------------------------------- adding build in symbols --------------------------------\n");
        this.add(new Symbol("", new CallableType("(int)",   "int", null), "print(int)"));
        this.add(new Symbol("", new CallableType("(String)","int", null), "print(String)"));
        this.add(new Symbol("", new CallableType("(bool)",  "int", null), "print(bool)"));
    }

    public SymbolTable(SymbolTable src, Type t) {
        this.errors = src.errors;
        this.warnings = src.warnings;
        symbols.putAll(src.symbols);
        t.forEach((k, v)-> symbols.put(k, v.inst(t.returnType, k)));
    }

    public int getNr(String name)
    {
        return symbols.get(name).nr;
    }

    public String lookup(String name, Function<Symbol, String> onOk, Runnable onErr)
    {
        OurLogger.getInstance().print(String.format("    ⌕   %-41s", name));
        Symbol s = symbols.get(name);

        if (s != null){
            OurLogger.getInstance().print(String.format("%s ✓\n", s.type));
            return onOk.apply(s);
        }
        else{
            OurLogger.getInstance().print(String.format("%35s #%d ✖\n", "", errors.size()+1));
            onErr.run();
            return "Unres";
        }
    }

    private void add(Symbol s)
    {
        s.nr = counter++;
        symbols.put(s.id, s);
        OurLogger.getInstance().print(String.format("  ﹢     %-40s %s\n", s.id, s.type));
    }

    void addSymbol(String id, Type type, String scope, Runnable onOk, Runnable onErr) {
        if (symbols.containsKey(id))
            onErr.run();
        else{
            this.add(new Symbol(scope, type, id));
            onOk.run();
        }
    }
}
