package at.tugraz.ist.cc.typechecking;

import at.tugraz.ist.cc.TypeCheckErrorListener;

import at.tugraz.ist.cc.antlr.gen.JovaBaseVisitor;
import at.tugraz.ist.cc.antlr.gen.JovaParser.*;
import at.tugraz.ist.cc.io.DebugGenerator;
import org.antlr.v4.runtime.Token;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

public class TypeCheckTreeVisitor extends JovaBaseVisitor<String> {

    public TypeCheckErrorListener errors = new TypeCheckErrorListener("type errors");
    public TypeCheckErrorListener warnings = new TypeCheckErrorListener("type warnings");
    public final TypeTable typeTable = new TypeTable(errors, warnings);
    public final SymbolTable buildInSymbols = new SymbolTable(errors, warnings);

    public static HashMap<Integer, String> argsMap = new LinkedHashMap<>();

    @Override
    public String visitClass_decl(Class_declContext classCtx) {
        final Token t = classCtx.class_head().CLASS_TYPE().getSymbol();
        final String className = classCtx.class_head().CLASS_TYPE().getText();

        if (typeTable.addClass(className, ()-> errors.add(t, "Double definition of class '" + className + "'"))) {
            final Type currentType = typeTable.get(className);

            return new JovaBaseVisitor<String>() {

                @Override // +fields
                public String visitMember_decl(Member_declContext mdeclCtx) {
                    final Token t = mdeclCtx.declaration().type().getStart();
                    final String typeStr = mdeclCtx.declaration().type().getText();
                    final boolean isPrivate = mdeclCtx.AMOD().getText().equals("private");
                    return new DeclarationVisitor(
                            typeTable,
                            (it, id, type) -> currentType.addMember(
                                    id,
                                    new MemberType(isPrivate, type),
                                    () -> DebugGenerator.getInstance().addVariableTCDebug(id, typeStr, className, "", null, t.getLine()),
                                    () -> errors.add(it, "Double definition of member '" + typeStr + " " + id + "' class '" + className + "'"),
                                    () -> errors.add(it, "Cannot add member to class Main")),
                            (ega) -> errors.add(t, "Usage of undefined Type '" + typeStr + "'"),
                            () -> errors.add(t, "Cannot instantiate type Main")
                    ).visit(mdeclCtx.declaration());
                }

                @Override
                public String visitMethod_decl(Method_declContext methodCtx) {
                    final Token t = methodCtx.getStart();
                    final String methodName = methodCtx.method_head().ID().getText();
                    final String methodParams = new JovaMethodNameVisitor().visit(methodCtx.method_head());
                    final List<String> methodParamList = new JovaMethodParamVisitor().visit(methodCtx.method_head());
                    final String methodId = methodName + methodParams;
                    final String methodScope = className + "." + methodName + methodParams;
                    final String methodType = methodCtx.method_head().type().getText();

                    final String fullMethodSig = methodType + " " + methodId;
                    final boolean isPrivate = methodCtx.method_head().AMOD().getText().equals("private");

                    final SymbolTable symbolTable = new SymbolTable(buildInSymbols, currentType);

                    typeTable.lookup(methodType,
                            (rt) -> currentType.addMember(
                                    methodName + methodParams,
                                    new MemberType(isPrivate, new CallableType(methodParams, methodType, symbolTable)),
                                    () -> new BasicJovaVisitor(typeTable) {

                                        @Override // ..(.. <Type> id1 ..)
                                        public String visitParam(ParamContext paramCtx) {
                                            final Token t = paramCtx.getStart();
                                            final String id = paramCtx.ID().getText();
                                            final String typeStr = paramCtx.type().getText();

                                            if (typeStr.equals("Main")){
                                                errors.add(t, "Cannot instantiate type Main");
                                                return "Unres";
                                            }

                                            return typeTable.lookup(
                                                    typeStr,
                                                    type -> symbolTable.addSymbol(
                                                            id,
                                                            type,
                                                            methodScope,
                                                            () -> DebugGenerator.getInstance().addVariableTCDebug(id, typeStr, className, methodName, methodParamList, t.getLine()),
                                                            () -> errors.add(t, "Double definition of variable '" + typeStr + " " + id + "' in method '" + methodId + "'")),
                                                    () -> errors.add(t, "Usage of undefined Type '" + paramCtx.type().getText() + "'"));

                                        }

                                        @Override // <Type> id1, id2;
                                        public String visitDeclaration(DeclarationContext declCtx) {
                                            final Token t = declCtx.getStart();
                                            final String typeStr = declCtx.type().getText();
                                            return new DeclarationVisitor(
                                                    typeTable,
                                                    (it, id, type) -> symbolTable.addSymbol(
                                                            id,
                                                            type,
                                                            methodScope,
                                                            () -> DebugGenerator.getInstance().addVariableTCDebug(id, typeStr, className, methodName, methodParamList, it.getLine()),
                                                            () -> errors.add(it, "Double definition of variable '" + typeStr + " " + id + "' in method '" + methodId + "'")),
                                                    (ega) -> typeTable.errors.add(t, "Usage of undefined Type '" + typeStr + "'"),
                                                    ()-> errors.add(t, "Cannot instantiate type Main")
                                            ).visit(declCtx);
                                        }

                                        // symboltable abgeschlosen :D

                                        @Override // new <Type>;
                                        public String visitObject_alloc(Object_allocContext ctx) {
                                            final Token t = ctx.CLASS_TYPE().getSymbol();
                                            final String typeStr = ctx.CLASS_TYPE().getText();

                                            if (typeStr.equals("Main")){
                                                errors.add(t, "Cannot instantiate type Main");
                                                return "Unres";
                                            }

                                            return typeTable.lookup(
                                                    typeStr,
                                                    type -> {
                                                    },
                                                    () -> errors.add(t, "Usage of undefined Type '" + typeStr + "'"));
                                        }

                                        @Override // id_operand : member_access '(' arg_list ')'
                                        public String visitIdOperandCallable(IdOperandCallableContext idOpCtx) {
                                            final String argsStr = "(" + visit(idOpCtx.arg_list()) + ")"; // !!!
                                            return new MemberAccessVisitorSymbol(
                                                    symbolTable,
                                                    argsStr,
                                                    "(" +idOpCtx.arg_list().getText() + ")",
                                                    (t, id) -> errors.add(t, "Call to undefined method '" + id + "'"),
                                                    (t, id, type) -> errors.add(t, "Cannot invoke method '" + id + "' on type '" + type + "'"),
                                                    (t, id, type) -> errors.add(t, "Method '" + id + "' from type '" + type.returnType + "' not visible")
                                            ).visit(idOpCtx.member_access());
                                        }

                                        @Override // id_operand : member_access
                                        public String visitIdOperandVariable(IdOperandVariableContext idOpCtx) {
                                            return new MemberAccessVisitorSymbol(
                                                    symbolTable,
                                                    "",
                                                    "",
                                                    (t, id) -> errors.add(t, "Usage of undefined identifier '" + id + "'"),
                                                    (t, id, type) -> errors.add(t, type + " does not have field '" + id + "'"),
                                                    (t, id, type) -> errors.add(t, "Field '" + id + "' from type '" + type.returnType + "' not visible")
                                            ).visit(idOpCtx.member_access());
                                        }

                                        // operatoren =, MUL, ....

                                        @Override // member_access ASSIGN expr
                                        public String visitAssignment(AssignmentContext ctx) {
                                            String returnType = "Unres";
                                            String rhs = "Unres";
                                            String text = ctx.getText();

                                            if (ctx.object_alloc() != null) {
                                                rhs = visit(ctx.object_alloc());
                                                text = ctx.member_access().getText() + "=new " + ctx.object_alloc().CLASS_TYPE();
                                            } else if (ctx.expr() != null) {
                                                rhs = visit(ctx.expr());
                                            }

                                            String lhs = new MemberAccessVisitorSymbol(
                                                    symbolTable,
                                                    "",
                                                    "",
                                                    (t, id) -> errors.add(t, "Usage of undefined identifier '" + id + "'"),
                                                    (t, id, type) -> errors.add(t, type + " does not have field '" + id + "'"),
                                                    (t, id, type) -> errors.add(t, "Field '" + id + "' from type '" + type.returnType + "' not visible")
                                            ).visit(ctx.member_access());

                                            if (lhs.equals(rhs) || (!isPrimitiveOrString(lhs) && rhs.equals("nix"))) { //valid
                                                returnType = lhs;
                                            }
                                            else if (lhs.equals("int") && rhs.equals("bool") ||
                                                    lhs.equals("bool") && rhs.equals("int")) { //coerced
                                                warnings.add(ctx.getStart(), rhs + " coerced to " + lhs);
                                                returnType = lhs;
                                            } else /*if (lhs.equals("int") && rhs.equals("String") ||
                                            lhs.equals("bool") && rhs.equals("String") ||
                                            lhs.equals("String") && rhs.equals("int") ||
                                            lhs.equals("String") && rhs.equals("bool")) */{ //rejected
                                                if (!rhs.equals("Unres") && !lhs.equals("Unres"))
                                                    errors.add(ctx.getStart(), "Incompatible type '" + rhs + "' for assignment");
                                            }

                                            DebugGenerator.getInstance().addOperatorTCDebug(ctx.ASSIGN().getText(), lhs, rhs, returnType, ctx.start.getLine(), text);
                                            return returnType;
                                        }

                                        private boolean isPrimitive(String t)
                                        {
                                            return t.equals("bool") || t.equals("int");
                                        }

                                        private boolean isPrimitiveOrString(String t)
                                        {
                                            return t.equals("bool") || t.equals("int") || t.equals("String");
                                        }

                                        private boolean isObject(String t)
                                        {
                                            return !isPrimitiveOrString(t);
                                        }

                                        @Override // KEY_RETURN expr ';'
                                        public String visitRet_stmt(Ret_stmtContext ctx) {
                                            String returnType = "Unres";
                                            String lhs = methodType;
                                            String rhs = visit(ctx.expr());

                                            if (lhs.equals(rhs) || (!isPrimitiveOrString(lhs) && rhs.equals("nix"))) { //valid
                                                returnType = lhs;
                                            }
                                            else if (lhs.equals("int") && rhs.equals("bool") ||
                                                    lhs.equals("bool") && rhs.equals("int")) { //coerced
                                                warnings.add(ctx.getStart(), rhs + " coerced to " + lhs);
                                                returnType = lhs;
                                            }
                                            else { //rejected
                                                errors.add(ctx.getStart(), "Incompatible type '" + rhs + "' for return");
                                            }

                                            DebugGenerator.getInstance().addOperatorTCDebug(ctx.KEY_RETURN().getText(), lhs, rhs, returnType, ctx.start.getLine(),
                                                    ctx.KEY_RETURN().getText() + " " + ctx.expr().getText());
                                            return returnType;
                                        }

                                        @Override
                                        public String visitExpOpMul(ExpOpMulContext ctx) {
                                            String returnType = "Unres";
                                            String lhs = visit(ctx.lhs);
                                            String rhs = visit(ctx.rhs);

                                            if (lhs.equals("int") && rhs.equals("int")) //valid
                                                returnType = "int";
                                            if (lhs.equals("bool")) { //coerced
                                                warnings.add(ctx.getStart(), "bool coerced to int");
                                                returnType = "int";
                                            }
                                            if (rhs.equals("bool")) {
                                                warnings.add(ctx.getStart(), "bool coerced to int");
                                                returnType = "int";
                                            }

                                            if (!isPrimitive(lhs)) {  //rejected
                                                errors.add(ctx.getStart(), "Invalid operand of type '" + lhs + "' to binary operator '" + ctx.MULOP() + "'");
                                                returnType = "Unres";
                                            }
                                            if (!isPrimitive(rhs)) {
                                                errors.add(ctx.getStart(), "Invalid operand of type '" + rhs + "' to binary operator '" + ctx.MULOP() + "'");
                                                returnType = "Unres";
                                            }

                                            DebugGenerator.getInstance().addOperatorTCDebug(ctx.MULOP().getText(), lhs, rhs, returnType, ctx.start.getLine(), ctx.getText());
                                            return returnType;
                                        }

                                        @Override // expr RELOP expr
                                        public String visitExpOpRel(ExpOpRelContext ctx) {
                                            String returnType = "Unres";
                                            String lhs = visit(ctx.lhs);
                                            String rhs = visit(ctx.rhs);

                                            if (lhs.equals("int") && rhs.equals("int")) {
                                                returnType = "bool";
                                            }
                                            if (lhs.equals("bool")) {
                                                warnings.add(ctx.getStart(), "bool coerced to int");
                                                returnType = "bool";
                                            }
                                            if (rhs.equals("bool")) {
                                                warnings.add(ctx.getStart(), "bool coerced to int");
                                                returnType = "bool";
                                            }

                                            if (ctx.RELOP().getText().equals("==") || ctx.RELOP().getText().equals("!="))
                                            {
                                                returnType = "bool";

                                                // beide seiten ungleich &&
                                                // !(nix und !promitive) &&
                                                // !(!primitive und nix) +
                                                //     -> error
                                                if (!lhs.equals(rhs) &&
                                                        !(lhs.equals("nix") && !isPrimitiveOrString(rhs)) &&
                                                        !(rhs.equals("nix") && !isPrimitiveOrString(lhs)) &&
                                                        !(rhs.equals("int") && lhs.equals("bool")) &&
                                                        !(rhs.equals("bool") && lhs.equals("int")))
                                                {
                                                    errors.add(ctx.getStart(), "Invalid operand of type '" + rhs + "' to binary operator '" + ctx.RELOP().getText() + "'");
                                                    returnType = "Unres";
                                                }
                                            }
                                            if ((ctx.RELOP().getText().equals("==") || ctx.RELOP().getText().equals("!=")) && (
                                                    (isObject(rhs)     && isObject(lhs))     ||
                                                            (isObject(rhs)     && lhs.equals("nix")) ||
                                                            (rhs.equals("nix") && isObject(lhs))     ||
                                                            (isObject(rhs)     && lhs.equals("nix"))))
                                            {
                                                returnType = "bool";
                                            }
                                            else
                                            {
                                                if (!isPrimitive(lhs)) {  //rejected
                                                    errors.add(ctx.getStart(), "Invalid operand of type '" + lhs + "' to binary operator '" + ctx.RELOP().getText() + "'");
                                                    returnType = "Unres";
                                                }

                                                if (!isPrimitive(rhs)) {
                                                    errors.add(ctx.getStart(), "Invalid operand of type '" + rhs + "' to binary operator '" + ctx.RELOP().getText() + "'");
                                                    returnType = "Unres";
                                                }
                                            }

                                            DebugGenerator.getInstance().addOperatorTCDebug(ctx.RELOP().getText(), lhs, rhs, returnType, ctx.start.getLine(), ctx.getText());
                                            return returnType;
                                        }

                                        @Override
                                        public String visitOpSign(OpSignContext ctx) {
                                            String returnType = "Unres";
                                            String rhs = visit(ctx.operand());

                                            if (rhs.equals("int")) { //valid
                                                returnType = "int";
                                            } else if (rhs.equals("bool")) { //coerced
                                                warnings.add(ctx.getStart(), rhs + " coerced to int");
                                                returnType = "int";
                                            } else { //rejected
                                                errors.add(ctx.getStart(), "Invalid operand of type '" + rhs + "' to unary operator '" + ctx.SIGN() + "'");
                                            }

                                            DebugGenerator.getInstance().addOperatorTCDebug(ctx.SIGN().getText(), null, rhs, returnType, ctx.start.getLine(), ctx.getText());
                                            return returnType;
                                        }


                                        @Override
                                        public String visitExpOpSign(ExpOpSignContext ctx) {
                                            String returnType = "int";
                                            String lhs = visit(ctx.lhs);
                                            String rhs = visit(ctx.rhs);

                                            if (lhs.equals("bool")) //coerced
                                                warnings.add(ctx.getStart(), "bool coerced to int");

                                            if (rhs.equals("bool"))
                                                warnings.add(ctx.getStart(), "bool coerced to int");

                                            if (!isPrimitive(lhs)) {  //rejected
                                                errors.add(ctx.getStart(), "Invalid operand of type '" + lhs + "' to binary operator '" + ctx.SIGN() + "'");
                                                returnType = "Unres";
                                            }

                                            if (!isPrimitive(rhs)) {
                                                errors.add(ctx.getStart(), "Invalid operand of type '" + rhs + "' to binary operator '" + ctx.SIGN() + "'");
                                                returnType = "Unres";
                                            }

                                            DebugGenerator.getInstance().addOperatorTCDebug(ctx.SIGN().getText(), lhs, rhs, returnType, ctx.start.getLine(), ctx.getText());
                                            return returnType;
                                        }

                                        @Override // expr Or expr ';'
                                        public String visitExpOpOr(ExpOpOrContext ctx) {
                                            String returnType = "bool";
                                            String lhs = visit(ctx.lhs);
                                            String rhs = visit(ctx.rhs);

                                            if (lhs.equals("int")) //coerced
                                                warnings.add(ctx.getStart(), "int coerced to bool");
                                            if (rhs.equals("int"))
                                                warnings.add(ctx.getStart(), "int coerced to bool");

                                            if (!isPrimitive(lhs)) {  //rejected
                                                errors.add(ctx.getStart(), "Invalid operand of type '" + lhs + "' to binary operator '||'");
                                                returnType = "Unres";
                                            }

                                            if (!isPrimitive(rhs)) {
                                                errors.add(ctx.getStart(), "Invalid operand of type '" + rhs + "' to binary operator '||'");
                                                returnType = "Unres";
                                            }

                                            DebugGenerator.getInstance().addOperatorTCDebug(ctx.OR().getText(), lhs, rhs, returnType, ctx.start.getLine(), ctx.getText());
                                            return returnType;
                                        }

                                        @Override // expr AND expr ';'
                                        public String visitExpOpAnd(ExpOpAndContext ctx) {
                                            String returnType = "bool";
                                            String lhs = visit(ctx.lhs);
                                            String rhs = visit(ctx.rhs);

                                            if (lhs.equals("int")) //coerced
                                                warnings.add(ctx.getStart(), "int coerced to bool");
                                            if (rhs.equals("int"))
                                                warnings.add(ctx.getStart(), "int coerced to bool");

                                            if (!isPrimitive(lhs)) {  //rejected
                                                errors.add(ctx.getStart(), "Invalid operand of type '" + lhs + "' to binary operator '&&'");
                                                returnType = "Unres";
                                            }

                                            if (!isPrimitive(rhs)) {
                                                errors.add(ctx.getStart(), "Invalid operand of type '" + rhs + "' to binary operator '&&'");
                                                returnType = "Unres";
                                            }

                                            DebugGenerator.getInstance().addOperatorTCDebug(ctx.AND().getText(), lhs, rhs, returnType, ctx.start.getLine(), ctx.getText());
                                            return returnType;
                                        }

                                        /*
                                         * visitOpNot typechecking:
                                         * bool is valid
                                         * int is coerced
                                         * string and else is not valid
                                         */
                                        @Override
                                        public String visitOpNot(OpNotContext ctx) {
                                            String returnType = "Unres";
                                            String rhs = visit(ctx.operand());

                                            if (rhs.equals("bool")) {
                                                returnType = "bool";
                                            } else if (rhs.equals("int")) {
                                                warnings.add(ctx.getStart(), rhs + " coerced to " + "bool");
                                                returnType = "bool";
                                            } else {
                                                errors.add(ctx.getStart(), "Invalid operand of type '" + rhs + "' to unary operator '!'");
                                            }

                                            //else System.out.println("Error: '*' calld with Invalid operand");
                                            DebugGenerator.getInstance().addOperatorTCDebug(ctx.NOT().getText(), "", rhs, returnType, ctx.start.getLine(), ctx.getText());
                                            return returnType;
                                        }

                                        @Override
                                        public String visitIf_stmt(If_stmtContext ctx) {
                                            String returnType = "Unres";
                                            String cond = visit(ctx.expr());

                                            if (cond.equals("bool")) {
                                                returnType = cond;
                                            } else if (cond.equals("int")) {
                                                warnings.add(ctx.getStart(), cond + " coerced to bool");
                                                returnType = cond;
                                            } else {
                                                errors.add(ctx.getStart(), "Incompatible type '" + cond + "' for condition");
                                                returnType = cond;
                                            }

                                            DebugGenerator.getInstance().addOperatorTCDebug("cond", "", cond, returnType, ctx.start.getLine(), ctx.expr().getText());

                                            visit(ctx.ifBlock);
                                            if (ctx.elseBlock != null)
                                                visit(ctx.elseBlock);
                                            return returnType;
                                        }

                                        @Override
                                        public String visitWhile_stmt(While_stmtContext ctx) {
                                            String returnType = "Unres";
                                            String cond = visit(ctx.expr());

                                            if (cond.equals("bool")) {
                                                returnType = cond;
                                            } else if (cond.equals("int")) {
                                                warnings.add(ctx.getStart(), cond + " coerced to bool");
                                                returnType = cond;
                                            } else {
                                                errors.add(ctx.getStart(), "Incompatible type '" + cond + "' for condition");
                                                returnType = cond;
                                            }

                                            DebugGenerator.getInstance().addOperatorTCDebug("cond", "", cond, returnType, ctx.start.getLine(), ctx.expr().getText());
                                            visit(ctx.wBlock);
                                            return returnType;
                                        }

                                        @Override
                                        public String visitArgs(ArgsContext ctx) {
                                            if (ctx.args() == null)
                                                return visit(ctx.expr());
                                            else
                                                return visit(ctx.args()) + " " + visit(ctx.expr());
                                        }

                                        @Override
                                        public String visitArg_list(Arg_listContext ctx) {

                                            if (ctx.args() != null) {
                                                String args = visit(ctx.args());
                                                argsMap.put(ctx.getStart().getLine(), args);
                                                return args;
                                            }
                                            else {
                                                return "";
                                            }
                                        }

                                    }.visit(methodCtx),
                                    () -> errors.add(t, "Double definition of method '" + methodId + "' class '" + className + "'"),
                                    () -> errors.add(t, "Cannot add member to class Main")),
                            () -> errors.add(t, "Usage of undefined Type '" + methodType + "'")
                    );
                    return null;
                }
            }.visit(classCtx);
        }
        return "Unref";

    }
}