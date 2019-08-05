// Generated from Jova.g4 by ANTLR 4.5

	package at.tugraz.ist.cc.antlr.gen;
    import java.util.*;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link JovaParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface JovaVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link JovaParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(JovaParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link JovaParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(JovaParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link JovaParser#class_decls}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass_decls(JovaParser.Class_declsContext ctx);
	/**
	 * Visit a parse tree produced by {@link JovaParser#class_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass_decl(JovaParser.Class_declContext ctx);
	/**
	 * Visit a parse tree produced by {@link JovaParser#class_head}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass_head(JovaParser.Class_headContext ctx);
	/**
	 * Visit a parse tree produced by {@link JovaParser#class_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass_body(JovaParser.Class_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link JovaParser#member_decls}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMember_decls(JovaParser.Member_declsContext ctx);
	/**
	 * Visit a parse tree produced by {@link JovaParser#member_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMember_decl(JovaParser.Member_declContext ctx);
	/**
	 * Visit a parse tree produced by {@link JovaParser#method_decls}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethod_decls(JovaParser.Method_declsContext ctx);
	/**
	 * Visit a parse tree produced by {@link JovaParser#method_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethod_decl(JovaParser.Method_declContext ctx);
	/**
	 * Visit a parse tree produced by {@link JovaParser#method_head}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethod_head(JovaParser.Method_headContext ctx);
	/**
	 * Visit a parse tree produced by {@link JovaParser#method_params}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethod_params(JovaParser.Method_paramsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code param_list_element}
	 * labeled alternative in {@link JovaParser#param_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam_list_element(JovaParser.Param_list_elementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code param_list_element_first}
	 * labeled alternative in {@link JovaParser#param_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam_list_element_first(JovaParser.Param_list_element_firstContext ctx);
	/**
	 * Visit a parse tree produced by {@link JovaParser#param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam(JovaParser.ParamContext ctx);
	/**
	 * Visit a parse tree produced by {@link JovaParser#method_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethod_body(JovaParser.Method_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link JovaParser#declarations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarations(JovaParser.DeclarationsContext ctx);
	/**
	 * Visit a parse tree produced by {@link JovaParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(JovaParser.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JovaParser#id_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId_list(JovaParser.Id_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link JovaParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt(JovaParser.StmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link JovaParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(JovaParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link JovaParser#ret_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRet_stmt(JovaParser.Ret_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link JovaParser#if_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_stmt(JovaParser.If_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link JovaParser#while_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_stmt(JovaParser.While_stmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MemberAccessElement}
	 * labeled alternative in {@link JovaParser#member_access}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMemberAccessElement(JovaParser.MemberAccessElementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MemberAccessLast}
	 * labeled alternative in {@link JovaParser#member_access}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMemberAccessLast(JovaParser.MemberAccessLastContext ctx);
	/**
	 * Visit a parse tree produced by {@link JovaParser#object_alloc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObject_alloc(JovaParser.Object_allocContext ctx);
	/**
	 * Visit a parse tree produced by {@link JovaParser#compound_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompound_stmt(JovaParser.Compound_stmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExpOpAnd}
	 * labeled alternative in {@link JovaParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpOpAnd(JovaParser.ExpOpAndContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExpOpSign}
	 * labeled alternative in {@link JovaParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpOpSign(JovaParser.ExpOpSignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExpOpRel}
	 * labeled alternative in {@link JovaParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpOpRel(JovaParser.ExpOpRelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExpOpOr}
	 * labeled alternative in {@link JovaParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpOpOr(JovaParser.ExpOpOrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExpOperand}
	 * labeled alternative in {@link JovaParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpOperand(JovaParser.ExpOperandContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExpOpMul}
	 * labeled alternative in {@link JovaParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpOpMul(JovaParser.ExpOpMulContext ctx);
	/**
	 * Visit a parse tree produced by the {@code OpInt}
	 * labeled alternative in {@link JovaParser#operand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpInt(JovaParser.OpIntContext ctx);
	/**
	 * Visit a parse tree produced by the {@code OpBool}
	 * labeled alternative in {@link JovaParser#operand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpBool(JovaParser.OpBoolContext ctx);
	/**
	 * Visit a parse tree produced by the {@code OpLiteral}
	 * labeled alternative in {@link JovaParser#operand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpLiteral(JovaParser.OpLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code OpNix}
	 * labeled alternative in {@link JovaParser#operand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpNix(JovaParser.OpNixContext ctx);
	/**
	 * Visit a parse tree produced by the {@code OpNot}
	 * labeled alternative in {@link JovaParser#operand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpNot(JovaParser.OpNotContext ctx);
	/**
	 * Visit a parse tree produced by the {@code OpSign}
	 * labeled alternative in {@link JovaParser#operand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpSign(JovaParser.OpSignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code OpId}
	 * labeled alternative in {@link JovaParser#operand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpId(JovaParser.OpIdContext ctx);
	/**
	 * Visit a parse tree produced by the {@code OpExp}
	 * labeled alternative in {@link JovaParser#operand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpExp(JovaParser.OpExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IdOperandCallable}
	 * labeled alternative in {@link JovaParser#id_operand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdOperandCallable(JovaParser.IdOperandCallableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IdOperandVariable}
	 * labeled alternative in {@link JovaParser#id_operand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdOperandVariable(JovaParser.IdOperandVariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link JovaParser#arg_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArg_list(JovaParser.Arg_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link JovaParser#args}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgs(JovaParser.ArgsContext ctx);
}