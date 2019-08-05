// Generated from Jova.g4 by ANTLR 4.5

	package at.tugraz.ist.cc.antlr.gen;
    import java.util.*;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link JovaParser}.
 */
public interface JovaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link JovaParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(JovaParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link JovaParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(JovaParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link JovaParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(JovaParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JovaParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(JovaParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JovaParser#class_decls}.
	 * @param ctx the parse tree
	 */
	void enterClass_decls(JovaParser.Class_declsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JovaParser#class_decls}.
	 * @param ctx the parse tree
	 */
	void exitClass_decls(JovaParser.Class_declsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JovaParser#class_decl}.
	 * @param ctx the parse tree
	 */
	void enterClass_decl(JovaParser.Class_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link JovaParser#class_decl}.
	 * @param ctx the parse tree
	 */
	void exitClass_decl(JovaParser.Class_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link JovaParser#class_head}.
	 * @param ctx the parse tree
	 */
	void enterClass_head(JovaParser.Class_headContext ctx);
	/**
	 * Exit a parse tree produced by {@link JovaParser#class_head}.
	 * @param ctx the parse tree
	 */
	void exitClass_head(JovaParser.Class_headContext ctx);
	/**
	 * Enter a parse tree produced by {@link JovaParser#class_body}.
	 * @param ctx the parse tree
	 */
	void enterClass_body(JovaParser.Class_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link JovaParser#class_body}.
	 * @param ctx the parse tree
	 */
	void exitClass_body(JovaParser.Class_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link JovaParser#member_decls}.
	 * @param ctx the parse tree
	 */
	void enterMember_decls(JovaParser.Member_declsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JovaParser#member_decls}.
	 * @param ctx the parse tree
	 */
	void exitMember_decls(JovaParser.Member_declsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JovaParser#member_decl}.
	 * @param ctx the parse tree
	 */
	void enterMember_decl(JovaParser.Member_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link JovaParser#member_decl}.
	 * @param ctx the parse tree
	 */
	void exitMember_decl(JovaParser.Member_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link JovaParser#method_decls}.
	 * @param ctx the parse tree
	 */
	void enterMethod_decls(JovaParser.Method_declsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JovaParser#method_decls}.
	 * @param ctx the parse tree
	 */
	void exitMethod_decls(JovaParser.Method_declsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JovaParser#method_decl}.
	 * @param ctx the parse tree
	 */
	void enterMethod_decl(JovaParser.Method_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link JovaParser#method_decl}.
	 * @param ctx the parse tree
	 */
	void exitMethod_decl(JovaParser.Method_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link JovaParser#method_head}.
	 * @param ctx the parse tree
	 */
	void enterMethod_head(JovaParser.Method_headContext ctx);
	/**
	 * Exit a parse tree produced by {@link JovaParser#method_head}.
	 * @param ctx the parse tree
	 */
	void exitMethod_head(JovaParser.Method_headContext ctx);
	/**
	 * Enter a parse tree produced by {@link JovaParser#method_params}.
	 * @param ctx the parse tree
	 */
	void enterMethod_params(JovaParser.Method_paramsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JovaParser#method_params}.
	 * @param ctx the parse tree
	 */
	void exitMethod_params(JovaParser.Method_paramsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code param_list_element}
	 * labeled alternative in {@link JovaParser#param_list}.
	 * @param ctx the parse tree
	 */
	void enterParam_list_element(JovaParser.Param_list_elementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code param_list_element}
	 * labeled alternative in {@link JovaParser#param_list}.
	 * @param ctx the parse tree
	 */
	void exitParam_list_element(JovaParser.Param_list_elementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code param_list_element_first}
	 * labeled alternative in {@link JovaParser#param_list}.
	 * @param ctx the parse tree
	 */
	void enterParam_list_element_first(JovaParser.Param_list_element_firstContext ctx);
	/**
	 * Exit a parse tree produced by the {@code param_list_element_first}
	 * labeled alternative in {@link JovaParser#param_list}.
	 * @param ctx the parse tree
	 */
	void exitParam_list_element_first(JovaParser.Param_list_element_firstContext ctx);
	/**
	 * Enter a parse tree produced by {@link JovaParser#param}.
	 * @param ctx the parse tree
	 */
	void enterParam(JovaParser.ParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link JovaParser#param}.
	 * @param ctx the parse tree
	 */
	void exitParam(JovaParser.ParamContext ctx);
	/**
	 * Enter a parse tree produced by {@link JovaParser#method_body}.
	 * @param ctx the parse tree
	 */
	void enterMethod_body(JovaParser.Method_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link JovaParser#method_body}.
	 * @param ctx the parse tree
	 */
	void exitMethod_body(JovaParser.Method_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link JovaParser#declarations}.
	 * @param ctx the parse tree
	 */
	void enterDeclarations(JovaParser.DeclarationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JovaParser#declarations}.
	 * @param ctx the parse tree
	 */
	void exitDeclarations(JovaParser.DeclarationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JovaParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(JovaParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JovaParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(JovaParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JovaParser#id_list}.
	 * @param ctx the parse tree
	 */
	void enterId_list(JovaParser.Id_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link JovaParser#id_list}.
	 * @param ctx the parse tree
	 */
	void exitId_list(JovaParser.Id_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link JovaParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmt(JovaParser.StmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link JovaParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmt(JovaParser.StmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link JovaParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(JovaParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link JovaParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(JovaParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link JovaParser#ret_stmt}.
	 * @param ctx the parse tree
	 */
	void enterRet_stmt(JovaParser.Ret_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link JovaParser#ret_stmt}.
	 * @param ctx the parse tree
	 */
	void exitRet_stmt(JovaParser.Ret_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link JovaParser#if_stmt}.
	 * @param ctx the parse tree
	 */
	void enterIf_stmt(JovaParser.If_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link JovaParser#if_stmt}.
	 * @param ctx the parse tree
	 */
	void exitIf_stmt(JovaParser.If_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link JovaParser#while_stmt}.
	 * @param ctx the parse tree
	 */
	void enterWhile_stmt(JovaParser.While_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link JovaParser#while_stmt}.
	 * @param ctx the parse tree
	 */
	void exitWhile_stmt(JovaParser.While_stmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MemberAccessElement}
	 * labeled alternative in {@link JovaParser#member_access}.
	 * @param ctx the parse tree
	 */
	void enterMemberAccessElement(JovaParser.MemberAccessElementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MemberAccessElement}
	 * labeled alternative in {@link JovaParser#member_access}.
	 * @param ctx the parse tree
	 */
	void exitMemberAccessElement(JovaParser.MemberAccessElementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MemberAccessLast}
	 * labeled alternative in {@link JovaParser#member_access}.
	 * @param ctx the parse tree
	 */
	void enterMemberAccessLast(JovaParser.MemberAccessLastContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MemberAccessLast}
	 * labeled alternative in {@link JovaParser#member_access}.
	 * @param ctx the parse tree
	 */
	void exitMemberAccessLast(JovaParser.MemberAccessLastContext ctx);
	/**
	 * Enter a parse tree produced by {@link JovaParser#object_alloc}.
	 * @param ctx the parse tree
	 */
	void enterObject_alloc(JovaParser.Object_allocContext ctx);
	/**
	 * Exit a parse tree produced by {@link JovaParser#object_alloc}.
	 * @param ctx the parse tree
	 */
	void exitObject_alloc(JovaParser.Object_allocContext ctx);
	/**
	 * Enter a parse tree produced by {@link JovaParser#compound_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCompound_stmt(JovaParser.Compound_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link JovaParser#compound_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCompound_stmt(JovaParser.Compound_stmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExpOpAnd}
	 * labeled alternative in {@link JovaParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpOpAnd(JovaParser.ExpOpAndContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExpOpAnd}
	 * labeled alternative in {@link JovaParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpOpAnd(JovaParser.ExpOpAndContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExpOpSign}
	 * labeled alternative in {@link JovaParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpOpSign(JovaParser.ExpOpSignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExpOpSign}
	 * labeled alternative in {@link JovaParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpOpSign(JovaParser.ExpOpSignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExpOpRel}
	 * labeled alternative in {@link JovaParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpOpRel(JovaParser.ExpOpRelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExpOpRel}
	 * labeled alternative in {@link JovaParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpOpRel(JovaParser.ExpOpRelContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExpOpOr}
	 * labeled alternative in {@link JovaParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpOpOr(JovaParser.ExpOpOrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExpOpOr}
	 * labeled alternative in {@link JovaParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpOpOr(JovaParser.ExpOpOrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExpOperand}
	 * labeled alternative in {@link JovaParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpOperand(JovaParser.ExpOperandContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExpOperand}
	 * labeled alternative in {@link JovaParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpOperand(JovaParser.ExpOperandContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExpOpMul}
	 * labeled alternative in {@link JovaParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpOpMul(JovaParser.ExpOpMulContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExpOpMul}
	 * labeled alternative in {@link JovaParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpOpMul(JovaParser.ExpOpMulContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OpInt}
	 * labeled alternative in {@link JovaParser#operand}.
	 * @param ctx the parse tree
	 */
	void enterOpInt(JovaParser.OpIntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OpInt}
	 * labeled alternative in {@link JovaParser#operand}.
	 * @param ctx the parse tree
	 */
	void exitOpInt(JovaParser.OpIntContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OpBool}
	 * labeled alternative in {@link JovaParser#operand}.
	 * @param ctx the parse tree
	 */
	void enterOpBool(JovaParser.OpBoolContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OpBool}
	 * labeled alternative in {@link JovaParser#operand}.
	 * @param ctx the parse tree
	 */
	void exitOpBool(JovaParser.OpBoolContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OpLiteral}
	 * labeled alternative in {@link JovaParser#operand}.
	 * @param ctx the parse tree
	 */
	void enterOpLiteral(JovaParser.OpLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OpLiteral}
	 * labeled alternative in {@link JovaParser#operand}.
	 * @param ctx the parse tree
	 */
	void exitOpLiteral(JovaParser.OpLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OpNix}
	 * labeled alternative in {@link JovaParser#operand}.
	 * @param ctx the parse tree
	 */
	void enterOpNix(JovaParser.OpNixContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OpNix}
	 * labeled alternative in {@link JovaParser#operand}.
	 * @param ctx the parse tree
	 */
	void exitOpNix(JovaParser.OpNixContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OpNot}
	 * labeled alternative in {@link JovaParser#operand}.
	 * @param ctx the parse tree
	 */
	void enterOpNot(JovaParser.OpNotContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OpNot}
	 * labeled alternative in {@link JovaParser#operand}.
	 * @param ctx the parse tree
	 */
	void exitOpNot(JovaParser.OpNotContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OpSign}
	 * labeled alternative in {@link JovaParser#operand}.
	 * @param ctx the parse tree
	 */
	void enterOpSign(JovaParser.OpSignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OpSign}
	 * labeled alternative in {@link JovaParser#operand}.
	 * @param ctx the parse tree
	 */
	void exitOpSign(JovaParser.OpSignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OpId}
	 * labeled alternative in {@link JovaParser#operand}.
	 * @param ctx the parse tree
	 */
	void enterOpId(JovaParser.OpIdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OpId}
	 * labeled alternative in {@link JovaParser#operand}.
	 * @param ctx the parse tree
	 */
	void exitOpId(JovaParser.OpIdContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OpExp}
	 * labeled alternative in {@link JovaParser#operand}.
	 * @param ctx the parse tree
	 */
	void enterOpExp(JovaParser.OpExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OpExp}
	 * labeled alternative in {@link JovaParser#operand}.
	 * @param ctx the parse tree
	 */
	void exitOpExp(JovaParser.OpExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IdOperandCallable}
	 * labeled alternative in {@link JovaParser#id_operand}.
	 * @param ctx the parse tree
	 */
	void enterIdOperandCallable(JovaParser.IdOperandCallableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IdOperandCallable}
	 * labeled alternative in {@link JovaParser#id_operand}.
	 * @param ctx the parse tree
	 */
	void exitIdOperandCallable(JovaParser.IdOperandCallableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IdOperandVariable}
	 * labeled alternative in {@link JovaParser#id_operand}.
	 * @param ctx the parse tree
	 */
	void enterIdOperandVariable(JovaParser.IdOperandVariableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IdOperandVariable}
	 * labeled alternative in {@link JovaParser#id_operand}.
	 * @param ctx the parse tree
	 */
	void exitIdOperandVariable(JovaParser.IdOperandVariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link JovaParser#arg_list}.
	 * @param ctx the parse tree
	 */
	void enterArg_list(JovaParser.Arg_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link JovaParser#arg_list}.
	 * @param ctx the parse tree
	 */
	void exitArg_list(JovaParser.Arg_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link JovaParser#args}.
	 * @param ctx the parse tree
	 */
	void enterArgs(JovaParser.ArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JovaParser#args}.
	 * @param ctx the parse tree
	 */
	void exitArgs(JovaParser.ArgsContext ctx);
}