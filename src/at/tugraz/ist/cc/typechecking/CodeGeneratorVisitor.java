package at.tugraz.ist.cc.typechecking;

import at.tugraz.ist.cc.CodeGenerator;
import at.tugraz.ist.cc.antlr.gen.JovaBaseVisitor;
import at.tugraz.ist.cc.antlr.gen.JovaParser.*;

import javax.xml.stream.events.EndDocument;
import java.io.File;
import java.io.IOException;
import java.util.List;

class CodeGeneratorClassVisitor extends JovaBaseVisitor<String> {
    String srcFile = null;
    String className = null;
    TypeTable typeTable = null;
    Type thistype = null;
    CodeGenerator jasminWriter = null;
    SymbolTable thisMethodSymbolTable = null;
    int labelCounter;

    public CodeGeneratorClassVisitor(String srcFile, String className, TypeTable typeTable) throws IOException {
        this.srcFile = srcFile;
        this.className = className;
        this.typeTable = typeTable;
        this.labelCounter = 0;

        this.typeTable.lookup(className,
                (t)-> { thistype = t; },
                ()-> {});

        File in = new File(srcFile);
        File testInputByteCodeTest = new File(in.getParent());
        String testName = testInputByteCodeTest.getName();

        File testInputByteCode = new File(testInputByteCodeTest.getParent());
        File testInput = new File(testInputByteCode.getParent());
        File test = new File(testInput.getParent());

        File testOuputByteCode = new File(test, "output/bytecode");
        if (!testOuputByteCode.exists()){ testOuputByteCode.mkdir(); }

        File testOuputByteCodeTest = new File(testOuputByteCode, testName);
        if (!testOuputByteCodeTest.exists()){ testOuputByteCodeTest.mkdir(); }

        File jasminFile = new File(testOuputByteCodeTest, className + ".j");
        jasminWriter = new CodeGenerator(jasminFile);
    }

    //------------------------------------------------------------------------------------------------------------------

    @Override
    public String visitClass_decl(Class_declContext classCtx) {
        jasminWriter.generateClass(srcFile, className);
        jasminWriter.generateConstructor(className);
        return visit(classCtx.class_body());
    }

    @Override
    public String visitParam(ParamContext paramCtx) {

        String jovaParamType = paramCtx.type().getText();
        String jasminParamType = jasminWriter.jovaTypeToJasminTypeHeader(jovaParamType);
        jasminWriter.writeWithoutExcept(jasminParamType);

        return null;
    }

    @Override
    public String visitMethod_decl(Method_declContext methodCtx) {

        final String methodName = methodCtx.method_head().ID().getText();
        final String methodParams = new JovaMethodNameVisitor().visit(methodCtx.method_head());
        final List<String> methodParamList = new JovaMethodParamVisitor().visit(methodCtx.method_head());
        final String methodId = methodName + methodParams;

        String jovaMethodAMOD = methodCtx.method_head().AMOD().getText();
        String jovaMethodName = methodCtx.method_head().ID().getText();
        String jovaReturnType = methodCtx.method_head().type().getText();

        thisMethodSymbolTable = thistype.members.get(methodId).symbolTable;

        if(jovaMethodName.equals("main")){
            jasminWriter.writeWithoutExcept(".method " + jovaMethodAMOD + " static " + jovaMethodName + "([Ljava/lang/String;)V\n");
        }
        else {
            jasminWriter.writeWithoutExcept(".method " + jovaMethodAMOD + " " + jovaMethodName + "(");
            visit(methodCtx.method_head());
            jasminWriter.writeWithoutExcept(")" + jasminWriter.jovaTypeToJasminTypeHeader(jovaReturnType) + "\n");
        }

        jasminWriter.writeWithoutExcept(".limit stack 50\n.limit locals 50\n");
        visit(methodCtx.method_body());

        if(jovaMethodName.toLowerCase().equals("main"))
            jasminWriter.writeWithoutExcept("return\n");
        else
            jasminWriter.writeWithoutExcept(jasminWriter.jovaTypeToJasminTypeReturn(jovaReturnType) + "return\n");

        jasminWriter.generateMethodEnd(jovaMethodName, jovaReturnType);
        return null;
    }

    //------------------------------------------------------------------------------------------------------------------

    @Override public String visitOpInt(OpIntContext ctx)
    {
        jasminWriter.writeWithoutExcept("ldc " + ctx.getText() + "\n\n");
        return null;
    }

    @Override public String visitOpBool(OpBoolContext ctx)
    {
        jasminWriter.writeWithoutExcept("ldc " + ctx.getText() + "\n\n");
        return null;
    }

    @Override public String visitOpLiteral(OpLiteralContext ctx)
    {
        jasminWriter.writeWithoutExcept("ldc " + ctx.getText() + "\n\n");
        return null;
    }

    @Override public String visitOpNix(OpNixContext ctx)
    {
        jasminWriter.writeWithoutExcept("ldc anull\n\n");
        return null;
    }

    //------------------------------------------------------------------------------------------------------------------

    @Override
    public String visitObject_alloc(Object_allocContext object_allocCtx) {
        String type = object_allocCtx.CLASS_TYPE().getText();
        jasminWriter.writeWithoutExcept("new " + type + "\n");
        jasminWriter.writeWithoutExcept("dup\n");
        jasminWriter.writeWithoutExcept("invokespecial " + type + "/<init>()V\n\n");
        return null;
    }

    @Override
    public String visitAssignment(AssignmentContext assignmentCtx) {

        if (assignmentCtx.expr() != null) {
            visit(assignmentCtx.expr());
        }
        else {
            visit(assignmentCtx.object_alloc());
        }

        String lhsVarnName = assignmentCtx.member_access().getText();
        Symbol  lhs = thisMethodSymbolTable.symbols.get(lhsVarnName);


        jasminWriter.writeWithoutExcept(jasminWriter.jovaTypeToJasminTypeReturn(lhs.type.returnType) + "store " + lhs.nr + "\n");
        return null;
    }

    String lastMemberAccessText = null;
    Symbol verylastSymbol = null;
    @Override
    public String visitMemberAccessLast(MemberAccessLastContext memberAccessLastCtx) {
        // (type + member) -> methodname
        lastMemberAccessText = memberAccessLastCtx.ID().getText();
        // todo: wenn lastSymbol.type vorhanden ansonsten thisMethodSymbolTable
        verylastSymbol = thisMethodSymbolTable.symbols.get(lastMemberAccessText);
        return null;
    }

    Symbol lastSymbol = null;
    @Override
    public String visitMemberAccessElement(MemberAccessElementContext memberAccessElementCtx) {

        lastMemberAccessText = memberAccessElementCtx.ID().getText();
        String m = memberAccessElementCtx.ID().getText();
        lastSymbol = thisMethodSymbolTable.symbols.get(m);

        //System.out.println("## accessselement query " + m + " -> " +  lastSymbol);
        visit(memberAccessElementCtx.member_access());
        return null;
    }

    @Override
    public String visitIdOperandVariable(IdOperandVariableContext idOperandVariableCtx) {

        visit(idOperandVariableCtx.member_access());

        String t = jasminWriter.jovaTypeToJasminTypeReturn(verylastSymbol.type.returnType);
        jasminWriter.writeWithoutExcept(t+"load " + verylastSymbol.nr + "\n");
        lastSymbol = null;
        return null;
    }

    @Override
    public String visitIdOperandCallable(IdOperandCallableContext idOperandCallableCtx) {

        visit(idOperandCallableCtx.member_access());
        String argTypes = TypeCheckTreeVisitor.argsMap.get(idOperandCallableCtx.getStart().getLine());
        String fullMethodId = lastMemberAccessText + "(" + (argTypes != null?argTypes:"") + ")";

        if (lastMemberAccessText != null && lastMemberAccessText.startsWith("print")) {

            jasminWriter.writeWithoutExcept("getstatic java/lang/System/out Ljava/io/PrintStream;\n");

            if (idOperandCallableCtx.arg_list() != null)
                visit(idOperandCallableCtx.arg_list());      //  push args (visit args)

            String jat = jasminWriter.jovaArglistToJasminArgList(argTypes);
            jasminWriter.writeWithoutExcept("invokevirtual java/io/PrintStream/print("+jat+")V\n");
            jasminWriter.writeWithoutExcept("ldc 0\n\n");
        }
        else {
            Type lastSymboltype = thistype;
            if (lastSymbol != null)
                lastSymboltype = lastSymbol.type;

            if (lastSymbol!=null)
                jasminWriter.writeWithoutExcept("aload " + lastSymbol.nr + "\n");
            else
                jasminWriter.writeWithoutExcept("aload_0\n");

            Type callableType = lastSymboltype.members.get(fullMethodId);
            if (callableType == null)
                System.out.println("\n###ct "+ lastSymboltype.returnType + "members.get(" + fullMethodId + ")" + lastSymbol.type.returnType);

            if (idOperandCallableCtx.arg_list() != null)
                visit(idOperandCallableCtx.arg_list());      //  push args (visit args)

            jasminWriter.writeWithoutExcept("invokevirtual " + lastSymboltype.returnType + "/" + lastMemberAccessText + "(");
            jasminWriter.writeWithoutExcept(jasminWriter.jovaArglistToJasminArgList(argTypes));
            jasminWriter.writeWithoutExcept(")" + jasminWriter.jovaTypeToJasminTypeHeader(callableType.returnType) + "\n\n");
        }
        lastSymbol = null;
        return null;
    }

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

    @Override
    public String visitExpOpMul(ExpOpMulContext ctx){

        visit(ctx.lhs);
        visit(ctx.rhs);
        switch(ctx.MULOP().getSymbol().getText()) {
            case "*": jasminWriter.writeWithoutExcept("imul\n");
                break;
            case "/": jasminWriter.writeWithoutExcept("idiv\n");
                break;
            case "%": jasminWriter.writeWithoutExcept("irem\n");
                break;
        }
        return null;
    }

    @Override
    public String visitExpOpSign(ExpOpSignContext ctx){
        visit(ctx.lhs);
        visit(ctx.rhs);
        if(ctx.SIGN().getSymbol().getText().equals("+")) {
            jasminWriter.writeWithoutExcept("iadd\n");
        } else {
            jasminWriter.writeWithoutExcept("isub\n");
        }
        return null;
    }

    @Override
    public String visitOpSign(OpSignContext ctx){
        visit(ctx.operand());
        jasminWriter.writeWithoutExcept("ineg\n");
        return null;
    }

    @Override
    public String visitIf_stmt(If_stmtContext ctx){
        int labelNr = labelCounter++;

        String labelName = visit(ctx.expr()); //decides for comparison
        //push true
        jasminWriter.writeWithoutExcept("ldc 1\n");
        jasminWriter.writeWithoutExcept("ifeq if_blk_" + labelNr +"\n");


        if (ctx.KEY_ELSE() != null) {
            jasminWriter.writeWithoutExcept("goto else_blk_" + labelNr + "\n");
        } else {
            jasminWriter.writeWithoutExcept("goto end_" + labelNr + "\n");
        }

        jasminWriter.writeWithoutExcept("if_blk_" + labelNr + ":\n");
        visit(ctx.ifBlock);
        jasminWriter.writeWithoutExcept("goto end_" + labelNr + "\n");

        if(ctx.KEY_ELSE() != null){
            jasminWriter.writeWithoutExcept("else_blk_" + labelNr + ":\n");
            visit(ctx.elseBlock);
            jasminWriter.writeWithoutExcept("goto end_" + labelNr + "\n");
        }
        jasminWriter.writeWithoutExcept("end_"+labelNr + ":\n");

        return null;
    }

    @Override
    public String visitExpOpRel(ExpOpRelContext ctx){
        String labelName = "label_"+ labelCounter++;
        visit(ctx.lhs);
        visit(ctx.rhs);

        switch(ctx.RELOP().getSymbol().getText()){
            case "<=": jasminWriter.writeWithoutExcept("if_icmple " + labelName + "\n");
                break;
            case "<": jasminWriter.writeWithoutExcept("if_icmplt " + labelName + "\n");
                break;
            case ">=": jasminWriter.writeWithoutExcept("if_icmpge " + labelName + "\n");
                break;
            case ">": jasminWriter.writeWithoutExcept("if_icmpgt " + labelName + "\n");
                break;
            case "==": jasminWriter.writeWithoutExcept("if_icmpeq " + labelName + "\n");
                break;
            case "!=": jasminWriter.writeWithoutExcept("if_icmpne " + labelName + "\n");
                break;
        }


        return labelName;
    }


    public void close() throws IOException {
        jasminWriter.close();
    }

}

public class CodeGeneratorVisitor extends JovaBaseVisitor<String> {

    String srcFile = null;
    public TypeTable typeTable = null;
    public SymbolTable buildInSymbols = null;

    public CodeGeneratorVisitor(String srcFile, TypeTable typeTable) {
        this.srcFile = srcFile;
        this.typeTable = typeTable;
    }

    @Override
    public String visitClass_decl(Class_declContext classCtx) {
        String className = classCtx.class_head().CLASS_TYPE().getText();

        try
        {
            CodeGeneratorClassVisitor jasminFileVisitor = new CodeGeneratorClassVisitor(srcFile, className, typeTable);
            jasminFileVisitor.visit(classCtx);
            jasminFileVisitor.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        return null;
    }
}
