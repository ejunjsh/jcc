package com.sky.antlr.gen;// Generated from /Users/zhouff/code/jcc/jcc.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link jccParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface jccVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link jccParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(jccParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link jccParser#main_class}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMain_class(jccParser.Main_classContext ctx);
	/**
	 * Visit a parse tree produced by {@link jccParser#main_method}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMain_method(jccParser.Main_methodContext ctx);
	/**
	 * Visit a parse tree produced by {@link jccParser#class_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass_declaration(jccParser.Class_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link jccParser#class_inner_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass_inner_body(jccParser.Class_inner_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link jccParser#field_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitField_declaration(jccParser.Field_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link jccParser#method_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethod_declaration(jccParser.Method_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link jccParser#method_inner_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethod_inner_body(jccParser.Method_inner_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link jccParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(jccParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link jccParser#return_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn_statement(jccParser.Return_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link jccParser#parameter_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter_list(jccParser.Parameter_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link jccParser#parameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameters(jccParser.ParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link jccParser#parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter(jccParser.ParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link jccParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(jccParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link jccParser#call_a_method}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCall_a_method(jccParser.Call_a_methodContext ctx);
	/**
	 * Visit a parse tree produced by {@link jccParser#type_of_variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_of_variable(jccParser.Type_of_variableContext ctx);
	/**
	 * Visit a parse tree produced by {@link jccParser#intentifier_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntentifier_type(jccParser.Intentifier_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link jccParser#int_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInt_type(jccParser.Int_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link jccParser#int_array_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInt_array_type(jccParser.Int_array_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link jccParser#char_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChar_type(jccParser.Char_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link jccParser#boolean_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolean_type(jccParser.Boolean_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link jccParser#string_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString_type(jccParser.String_typeContext ctx);
}