package com.sky.jcc.antlr.gen;// Generated from /Users/zhouff/code/jcc/jcc.g4 by ANTLR 4.9.1
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
	 * Enter a parse tree produced by {@link jccParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(jccParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link jccParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(jccParser.IdentifierContext ctx);
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
	 * Enter a parse tree produced by the {@code blockStatement}
	 * labeled alternative in {@link jccParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterBlockStatement(jccParser.BlockStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code blockStatement}
	 * labeled alternative in {@link jccParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitBlockStatement(jccParser.BlockStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code doWhileStatement}
	 * labeled alternative in {@link jccParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterDoWhileStatement(jccParser.DoWhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code doWhileStatement}
	 * labeled alternative in {@link jccParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitDoWhileStatement(jccParser.DoWhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code whileStatement}
	 * labeled alternative in {@link jccParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(jccParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code whileStatement}
	 * labeled alternative in {@link jccParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(jccParser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ifStatement}
	 * labeled alternative in {@link jccParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(jccParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ifStatement}
	 * labeled alternative in {@link jccParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(jccParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assignStatement}
	 * labeled alternative in {@link jccParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterAssignStatement(jccParser.AssignStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assignStatement}
	 * labeled alternative in {@link jccParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitAssignStatement(jccParser.AssignStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assignArrayStatement}
	 * labeled alternative in {@link jccParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterAssignArrayStatement(jccParser.AssignArrayStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assignArrayStatement}
	 * labeled alternative in {@link jccParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitAssignArrayStatement(jccParser.AssignArrayStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code printStatement}
	 * labeled alternative in {@link jccParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterPrintStatement(jccParser.PrintStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code printStatement}
	 * labeled alternative in {@link jccParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitPrintStatement(jccParser.PrintStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code breakStatement}
	 * labeled alternative in {@link jccParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterBreakStatement(jccParser.BreakStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code breakStatement}
	 * labeled alternative in {@link jccParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitBreakStatement(jccParser.BreakStatementContext ctx);
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
	 * Enter a parse tree produced by the {@code newCallExpression}
	 * labeled alternative in {@link jccParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNewCallExpression(jccParser.NewCallExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code newCallExpression}
	 * labeled alternative in {@link jccParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNewCallExpression(jccParser.NewCallExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code minusExpression}
	 * labeled alternative in {@link jccParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMinusExpression(jccParser.MinusExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code minusExpression}
	 * labeled alternative in {@link jccParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMinusExpression(jccParser.MinusExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code boolExpression}
	 * labeled alternative in {@link jccParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterBoolExpression(jccParser.BoolExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code boolExpression}
	 * labeled alternative in {@link jccParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitBoolExpression(jccParser.BoolExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arrayCreateExpression}
	 * labeled alternative in {@link jccParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterArrayCreateExpression(jccParser.ArrayCreateExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arrayCreateExpression}
	 * labeled alternative in {@link jccParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitArrayCreateExpression(jccParser.ArrayCreateExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code identifierExpression}
	 * labeled alternative in {@link jccParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierExpression(jccParser.IdentifierExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code identifierExpression}
	 * labeled alternative in {@link jccParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierExpression(jccParser.IdentifierExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code methodCallExpression}
	 * labeled alternative in {@link jccParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMethodCallExpression(jccParser.MethodCallExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code methodCallExpression}
	 * labeled alternative in {@link jccParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMethodCallExpression(jccParser.MethodCallExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code notExpression}
	 * labeled alternative in {@link jccParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNotExpression(jccParser.NotExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code notExpression}
	 * labeled alternative in {@link jccParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNotExpression(jccParser.NotExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code multiplicationExpression}
	 * labeled alternative in {@link jccParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicationExpression(jccParser.MultiplicationExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code multiplicationExpression}
	 * labeled alternative in {@link jccParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicationExpression(jccParser.MultiplicationExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code comparisonExpression}
	 * labeled alternative in {@link jccParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterComparisonExpression(jccParser.ComparisonExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code comparisonExpression}
	 * labeled alternative in {@link jccParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitComparisonExpression(jccParser.ComparisonExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code braquetedExpression}
	 * labeled alternative in {@link jccParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterBraquetedExpression(jccParser.BraquetedExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code braquetedExpression}
	 * labeled alternative in {@link jccParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitBraquetedExpression(jccParser.BraquetedExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stringCharAtExpression}
	 * labeled alternative in {@link jccParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterStringCharAtExpression(jccParser.StringCharAtExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stringCharAtExpression}
	 * labeled alternative in {@link jccParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitStringCharAtExpression(jccParser.StringCharAtExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code integerExpression}
	 * labeled alternative in {@link jccParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterIntegerExpression(jccParser.IntegerExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code integerExpression}
	 * labeled alternative in {@link jccParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitIntegerExpression(jccParser.IntegerExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code substractionExpression}
	 * labeled alternative in {@link jccParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterSubstractionExpression(jccParser.SubstractionExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code substractionExpression}
	 * labeled alternative in {@link jccParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitSubstractionExpression(jccParser.SubstractionExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code variableCallExpression}
	 * labeled alternative in {@link jccParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterVariableCallExpression(jccParser.VariableCallExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code variableCallExpression}
	 * labeled alternative in {@link jccParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitVariableCallExpression(jccParser.VariableCallExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stringExpression}
	 * labeled alternative in {@link jccParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterStringExpression(jccParser.StringExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stringExpression}
	 * labeled alternative in {@link jccParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitStringExpression(jccParser.StringExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code thisExpression}
	 * labeled alternative in {@link jccParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterThisExpression(jccParser.ThisExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code thisExpression}
	 * labeled alternative in {@link jccParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitThisExpression(jccParser.ThisExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code lessThanExpression}
	 * labeled alternative in {@link jccParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterLessThanExpression(jccParser.LessThanExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code lessThanExpression}
	 * labeled alternative in {@link jccParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitLessThanExpression(jccParser.LessThanExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code sumExpression}
	 * labeled alternative in {@link jccParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterSumExpression(jccParser.SumExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code sumExpression}
	 * labeled alternative in {@link jccParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitSumExpression(jccParser.SumExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arrayLengthExpression}
	 * labeled alternative in {@link jccParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterArrayLengthExpression(jccParser.ArrayLengthExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arrayLengthExpression}
	 * labeled alternative in {@link jccParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitArrayLengthExpression(jccParser.ArrayLengthExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code charExpression}
	 * labeled alternative in {@link jccParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterCharExpression(jccParser.CharExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code charExpression}
	 * labeled alternative in {@link jccParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitCharExpression(jccParser.CharExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stringLengthExpression}
	 * labeled alternative in {@link jccParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterStringLengthExpression(jccParser.StringLengthExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stringLengthExpression}
	 * labeled alternative in {@link jccParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitStringLengthExpression(jccParser.StringLengthExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arraySelectExpression}
	 * labeled alternative in {@link jccParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterArraySelectExpression(jccParser.ArraySelectExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arraySelectExpression}
	 * labeled alternative in {@link jccParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitArraySelectExpression(jccParser.ArraySelectExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code equalExpression}
	 * labeled alternative in {@link jccParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterEqualExpression(jccParser.EqualExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code equalExpression}
	 * labeled alternative in {@link jccParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitEqualExpression(jccParser.EqualExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code divisionExpression}
	 * labeled alternative in {@link jccParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterDivisionExpression(jccParser.DivisionExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code divisionExpression}
	 * labeled alternative in {@link jccParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitDivisionExpression(jccParser.DivisionExpressionContext ctx);
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
	 * Enter a parse tree produced by {@link jccParser#integer}.
	 * @param ctx the parse tree
	 */
	void enterInteger(jccParser.IntegerContext ctx);
	/**
	 * Exit a parse tree produced by {@link jccParser#integer}.
	 * @param ctx the parse tree
	 */
	void exitInteger(jccParser.IntegerContext ctx);
	/**
	 * Enter a parse tree produced by {@link jccParser#bool}.
	 * @param ctx the parse tree
	 */
	void enterBool(jccParser.BoolContext ctx);
	/**
	 * Exit a parse tree produced by {@link jccParser#bool}.
	 * @param ctx the parse tree
	 */
	void exitBool(jccParser.BoolContext ctx);
	/**
	 * Enter a parse tree produced by {@link jccParser#cha}.
	 * @param ctx the parse tree
	 */
	void enterCha(jccParser.ChaContext ctx);
	/**
	 * Exit a parse tree produced by {@link jccParser#cha}.
	 * @param ctx the parse tree
	 */
	void exitCha(jccParser.ChaContext ctx);
	/**
	 * Enter a parse tree produced by {@link jccParser#string}.
	 * @param ctx the parse tree
	 */
	void enterString(jccParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by {@link jccParser#string}.
	 * @param ctx the parse tree
	 */
	void exitString(jccParser.StringContext ctx);
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