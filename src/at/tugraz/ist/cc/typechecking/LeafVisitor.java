package at.tugraz.ist.cc.typechecking;


import at.tugraz.ist.cc.antlr.gen.JovaBaseVisitor;
import at.tugraz.ist.cc.antlr.gen.JovaParser.*;

import at.tugraz.ist.cc.io.DebugGenerator;
import org.antlr.v4.runtime.Token;

import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

@FunctionalInterface
interface TriConsumer<T, U, V> {
    public void accept(T t, U u, V v);

    public default TriConsumer<T, U, V> andThen(TriConsumer<? super T, ? super U, ? super V> after) {
        Objects.requireNonNull(after);
        return (a, b, c) -> {
            accept(a, b, c);
            after.accept(a, b, c);
        };
    }
}

class BasicJovaVisitor extends JovaBaseVisitor<String>
{
    TypeTable typeTable;
    BasicJovaVisitor(TypeTable typeTable) { this.typeTable = typeTable; }

    //***************** Eindeutige   (scheint antlr zu machen)
    //@Override public String visitExpOperand(ExpOperandContext ctx) { return visit(ctx.operand()); }

    //***************** fixe verzweigungen

    @Override
    public String visitOpExp(OpExpContext ctx) {
        return visit(ctx.expr());
    }

    //***************** ? default (wert von x? falls nicht vorhanden)

    @Override
    public String visitArg_list(Arg_listContext ctx) {
        if (ctx.args() != null)
            return visit(ctx.args());
        else
            return "";
    }

    //***************** Rekursionen

    @Override
    public String visitArgs(ArgsContext ctx) {
        if (ctx.args() == null)
            return visit(ctx.expr());
        else
            return visit(ctx.args()) + " " + visit(ctx.expr());
    }

    //***************** LEAFS

    @Override public String visitOpInt(OpIntContext ctx)         { return typeTable.lookup("int",    t->{}, ()->{}); }
    @Override public String visitOpBool(OpBoolContext ctx)       { return typeTable.lookup("bool",   t->{}, ()->{}); }
    @Override public String visitOpLiteral(OpLiteralContext ctx) { return typeTable.lookup("String", t->{}, ()->{}); }
    @Override public String visitOpNix(OpNixContext ctx)         { return typeTable.lookup("nix",    t->{}, ()->{}); }
}

class JovaMethodNameVisitor extends JovaBaseVisitor<String>
{
    @Override
    public String visitMethod_head(Method_headContext mheadCtx) {
        return "(" + visit(mheadCtx.method_params()) + ")";
    }

    @Override
    public String visitMethod_params(Method_paramsContext mparamsCtx) {
        if (mparamsCtx.param_list() == null)
            return "";
        else
            return visit(mparamsCtx.param_list());
    }

    @Override
    public String visitParam_list_element(Param_list_elementContext paramListCtx) {
        return visit(paramListCtx.param_list())  + " " + paramListCtx.param().type().getText();
    }

    @Override
    public String visitParam(ParamContext paramCtx) {
        return paramCtx.type().getText();
    }
}

class JovaMethodParamVisitor extends JovaBaseVisitor<List<String>>
{
    @Override
    public List<String> visitMethod_params(Method_paramsContext mparamsCtx) {
        if (mparamsCtx.param_list() == null)
            return null;
        else
            return visit(mparamsCtx.param_list());
    }

    @Override
    public List<String> visitParam_list_element(Param_list_elementContext paramListCtx) {
        List<String> result = visit(paramListCtx.param_list());
        result.add(paramListCtx.param().type().getText());
        return result;
    }

    @Override
    public List<String> visitParam(ParamContext paramCtx) {
        LinkedList<String> result = new LinkedList<String>();
        result.add(paramCtx.type().getText());
        return result;
    }
}

class DeclarationVisitor extends JovaBaseVisitor<String>
{
    TypeTable typeTable;
    TriConsumer<Token, String, Type> onValidDecl;
    Consumer<DeclarationContext> onErr;
    Runnable onMainInst;

    public DeclarationVisitor(TypeTable typeTable,
                              TriConsumer<Token, String, Type> onValidDecl,
                              Consumer<DeclarationContext> onErr,
                              Runnable onMainInst) {
        this.typeTable = typeTable;
        this.onValidDecl = onValidDecl;
        this.onErr = onErr;
        this.onMainInst = onMainInst;
    }

    @Override // <Type> id1, id2;
    public String visitDeclaration(DeclarationContext declCtx) {
        String typeStr = declCtx.type().getText();

        if (typeStr.equals("Main")){
            onMainInst.run();
            return "Unres";
        }
        else return typeTable.lookup(
                typeStr,
                type-> new JovaBaseVisitor(){

                    @Override
                    public Object visitId_list(Id_listContext idCtx) {
                        Token t = idCtx.ID().getSymbol();
                        String id = idCtx.ID().getText();

                        if (idCtx.id_list() != null)
                            visit(idCtx.id_list());

                        onValidDecl.accept(t, id, type);
                        return null;
                    }
                    // for each id1, id2, id3 in context of type,
                }.visit(declCtx.id_list()),
                ()-> onErr.accept(declCtx)
        );
    }
}

class MemberAccessVisitorDefref extends JovaBaseVisitor<String>
{
    Type type;
    String prefix;
    String args;
    String argsText;
    TriConsumer<Token, String, String> onDerefFail;
    TriConsumer<Token, String, Type> onAmodFail;

    public MemberAccessVisitorDefref(Type type,
                                     String prefix,
                                     String args,
                                     String argsText,
                                     TriConsumer<Token, String, String> onDerefFail,
                                     TriConsumer<Token, String, Type> onAmodFail)
    {
        this.type = type;
        this.prefix = prefix + ".";
        this.args = args;
        this.argsText = argsText;
        this.onDerefFail = onDerefFail;
        this.onAmodFail = onAmodFail;
    }

    @Override
    public String visitMemberAccessElement(MemberAccessElementContext dotAccessCtx) {
        Token t = dotAccessCtx.ID().getSymbol();
        String id = dotAccessCtx.ID().getText();
        return type.lookupMember(
                id,
                newType -> {

                    if (newType.isPrivate)
                        onAmodFail.accept(t, id, type);

                    DebugGenerator.getInstance().addOperatorTCDebug(".",
                            type.returnType,
                            newType.returnType,
                            newType.returnType,
                            t.getLine(), prefix + t.getText());

                    prefix += (id + ".");

                    type = newType;
                    return visit(dotAccessCtx.member_access());
                },
                () -> onDerefFail.accept(t, id, type.returnType)
        );
    }

    @Override
    public String visitMemberAccessLast(MemberAccessLastContext idDotCtx) {
        Token t = idDotCtx.ID().getSymbol();
        String id = idDotCtx.ID().getText() + args;
        return type.lookupMember(
                id,
                newType -> {
                    if (newType.isPrivate)
                        onAmodFail.accept(t, id, type);

                    DebugGenerator.getInstance().addOperatorTCDebug(".",
                            type.returnType,
                            newType.returnType,
                            newType.returnType,
                            t.getLine(), prefix + t.getText() + argsText);

                    type = newType;
                    return type.returnType;
                },
                () -> onDerefFail.accept(t, id, type.returnType)
        );
    }
}

class MemberAccessVisitorSymbol extends JovaBaseVisitor<String>
{
    SymbolTable symbolTable;
    String args;
    String argsText;
    BiConsumer<Token, String> onSymFail;
    TriConsumer<Token, String, String> onDerefFail;
    TriConsumer<Token, String, Type> onAmodFail;

    MemberAccessVisitorSymbol(SymbolTable symbolTable,
                              String args,
                              String argsText,
                              BiConsumer<Token, String> onSymFail,
                              TriConsumer<Token, String, String> onDerefFail,
                              TriConsumer<Token, String, Type> onAmodFail)
    {
        this.symbolTable = symbolTable;
        this.args = args;
        this.argsText = argsText;
        this.onSymFail = onSymFail;
        this.onDerefFail = onDerefFail;
        this.onAmodFail = onAmodFail;
    }

    @Override
    public String visitMemberAccessElement(MemberAccessElementContext idDotCtx) {
        Token t = idDotCtx.ID().getSymbol();
        String id = idDotCtx.ID().getText();
        return symbolTable.lookup(
                id,
                first-> new MemberAccessVisitorDefref(
                        first.type,
                        id,
                        args,
                        argsText,
                        onDerefFail,
                        onAmodFail
                ).visit(idDotCtx.member_access()),
                ()-> onSymFail.accept(t, id)
        );
    }

    @Override
    public String visitMemberAccessLast(MemberAccessLastContext idCtx) {
        Token t = idCtx.ID().getSymbol();
        String id = idCtx.ID().getText() + args;
        return symbolTable.lookup(
                id,
                first-> first.type.returnType,
                ()-> onSymFail.accept(t, id)
        );
    }
}