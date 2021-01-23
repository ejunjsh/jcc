package com.sky.antlr.gen;// Generated from /Users/zhouff/code/jcc/jcc.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link jccParser}.
 */
public interface jccListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link jccParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(jccParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link jccParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(jccParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link jccParser#main_class}.
	 * @param ctx the parse tree
	 */
	void enterMain_class(jccParser.Main_classContext ctx);
	/**
	 * Exit a parse tree produced by {@link jccParser#main_class}.
	 * @param ctx the parse tree
	 */
	void exitMain_class(jccParser.Main_classContext ctx);
	/**
	 * Enter a parse tree produced by {@link jccParser#main_method}.
	 * @param ctx the parse tree
	 */
	void enterMain_method(jccParser.Main_methodContext ctx);
	/**
	 * Exit a parse tree produced by {@link jccParser#main_method}.
	 * @param ctx the parse tree
	 */
	void exitMain_method(jccParser.Main_methodContext ctx);
	/**
	 * Enter a parse tree produced by {@link jccParser#class_declaration}.
	 * @param ctx the parse tree
	 */
	void enterClass_declaration(jccParser.Class_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link jccParser#class_declaration}.
	 * @param ctx the parse tree
	 */
	void exitClass_declaration(jccParser.Class_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link jccParser#class_inner_body}.
	 * @param ctx the parse tree
	 */
	void enterClass_inner_body(jccParser.Class_inner_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link jccParser#class_inner_body}.
	 * @param ctx the parse tree
	 */
	void exitClass_inner_body(jccParser.Class_inner_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link jccParser#field_declaration}.
	 * @param ctx the parse tree
	 */
	void enterField_declaration(jccParser.Field_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link jccParser#field_declaration}.
	 * @param ctx the parse tree
	 */
	void exitField_declaration(jccParser.Field_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link jccParser#method_declaration}.
	 * @param ctx the parse tree
	 */
	void enterMethod_declaration(jccParser.Method_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link jccParser#method_declaration}.
	 * @param ctx the parse tree
	 */
	void exitMethod_declaration(jccParser.Method_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link jccParser#method_inner_body}.
	 * @param ctx the parse tree
	 */
	void enterMethod_inner_body(jccParser.Method_inner_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link jccParser#method_inner_body}.
	 * @param ctx the parse tree
	 */
	void exitMethod_inner_body(jccParser.Method_inner_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link jccParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(jccParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link jccParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(jccParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link jccParser#return_statement}.
	 * @param ctx the parse tree
	 */
	void enterReturn_statement(jccParser.Return_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link jccParser#return_statement}.
	 * @param ctx the parse tree
	 */
	void exitReturn_statement(jccParser.Return_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link jccParser#parameter_list}.
	 * @param ctx the parse tree
	 */
	void enterParameter_list(jccParser.Parameter_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link jccParser#parameter_list}.
	 * @param ctx the parse tree
	 */
	void exitParameter_list(jccParser.Parameter_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link jccParser#parameters}.
	 * @param ctx the parse tree
	 */
	void enterParameters(jccParser.ParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link jccParser#parameters}.
	 * @param ctx the parse tree
	 */
	void exitParameters(jccParser.ParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link jccParser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterParameter(jccParser.ParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link jccParser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitParameter(jccParser.ParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link jccParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(jccParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link jccParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(jccParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link jccParser#call_a_method}.
	 * @param ctx the parse tree
	 */
	void enterCall_a_method(jccParser.Call_a_methodContext ctx);
	/**
	 * Exit a parse tree produced by {@link jccParser#call_a_method}.
	 * @param ctx the parse tree
	 */
	void exitCall_a_method(jccParser.Call_a_methodContext ctx);
	/**
	 * Enter a parse tree produced by {@link jccParser#type_of_variable}.
	 * @param ctx the parse tree
	 */
	void enterType_of_variable(jccParser.Type_of_variableContext ctx);
	/**
	 * Exit a parse tree produced by {@link jccParser#type_of_variable}.
	 * @param ctx the parse tree
	 */
	void exitType_of_variable(jccParser.Type_of_variableContext ctx);
	/**
	 * Enter a parse tree produced by {@link jccParser#intentifier_type}.
	 * @param ctx the parse tree
	 */
	void enterIntentifier_type(jccParser.Intentifier_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link jccParser#intentifier_type}.
	 * @param ctx the parse tree
	 */
	void exitIntentifier_type(jccParser.Intentifier_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link jccParser#int_type}.
	 * @param ctx the parse tree
	 */
	void enterInt_type(jccParser.Int_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link jccParser#int_type}.
	 * @param ctx the parse tree
	 */
	void exitInt_type(jccParser.Int_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link jccParser#int_array_type}.
	 * @param ctx the parse tree
	 */
	void enterInt_array_type(jccParser.Int_array_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link jccParser#int_array_type}.
	 * @param ctx the parse tree
	 */
	void exitInt_array_type(jccParser.Int_array_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link jccParser#char_type}.
	 * @param ctx the parse tree
	 */
	void enterChar_type(jccParser.Char_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link jccParser#char_type}.
	 * @param ctx the parse tree
	 */
	void exitChar_type(jccParser.Char_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link jccParser#boolean_type}.
	 * @param ctx the parse tree
	 */
	void enterBoolean_type(jccParser.Boolean_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link jccParser#boolean_type}.
	 * @param ctx the parse tree
	 */
	void exitBoolean_type(jccParser.Boolean_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link jccParser#string_type}.
	 * @param ctx the parse tree
	 */
	void enterString_type(jccParser.String_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link jccParser#string_type}.
	 * @param ctx the parse tree
	 */
	void exitString_type(jccParser.String_typeContext ctx);
}