package com.sky.jcc.antlr.gen;// Generated from /Users/zhouff/code/jcc/jcc.g4 by ANTLR 4.9.1
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
	 * Visit a parse tree produced by {@link jccParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(jccParser.IdentifierContext ctx);
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
	 * Visit a parse tree produced by the {@code blockStatement}
	 * labeled alternative in {@link jccParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockStatement(jccParser.BlockStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code doWhileStatement}
	 * labeled alternative in {@link jccParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoWhileStatement(jccParser.DoWhileStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code whileStatement}
	 * labeled alternative in {@link jccParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStatement(jccParser.WhileStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ifStatement}
	 * labeled alternative in {@link jccParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(jccParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assignStatement}
	 * labeled alternative in {@link jccParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignStatement(jccParser.AssignStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assignArrayStatement}
	 * labeled alternative in {@link jccParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignArrayStatement(jccParser.AssignArrayStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code printStatement}
	 * labeled alternative in {@link jccParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintStatement(jccParser.PrintStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code breakStatement}
	 * labeled alternative in {@link jccParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreakStatement(jccParser.BreakStatementContext ctx);
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
	 * Visit a parse tree produced by the {@code newCallExpression}
	 * labeled alternative in {@link jccParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNewCallExpression(jccParser.NewCallExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code minusExpression}
	 * labeled alternative in {@link jccParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMinusExpression(jccParser.MinusExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code boolExpression}
	 * labeled alternative in {@link jccParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolExpression(jccParser.BoolExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arrayCreateExpression}
	 * labeled alternative in {@link jccParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayCreateExpression(jccParser.ArrayCreateExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code identifierExpression}
	 * labeled alternative in {@link jccParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierExpression(jccParser.IdentifierExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code methodCallExpression}
	 * labeled alternative in {@link jccParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodCallExpression(jccParser.MethodCallExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code notExpression}
	 * labeled alternative in {@link jccParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotExpression(jccParser.NotExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code multiplicationExpression}
	 * labeled alternative in {@link jccParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicationExpression(jccParser.MultiplicationExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code comparisonExpression}
	 * labeled alternative in {@link jccParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparisonExpression(jccParser.ComparisonExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code braquetedExpression}
	 * labeled alternative in {@link jccParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBraquetedExpression(jccParser.BraquetedExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stringCharAtExpression}
	 * labeled alternative in {@link jccParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringCharAtExpression(jccParser.StringCharAtExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code integerExpression}
	 * labeled alternative in {@link jccParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntegerExpression(jccParser.IntegerExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code substractionExpression}
	 * labeled alternative in {@link jccParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubstractionExpression(jccParser.SubstractionExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code variableCallExpression}
	 * labeled alternative in {@link jccParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableCallExpression(jccParser.VariableCallExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stringExpression}
	 * labeled alternative in {@link jccParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringExpression(jccParser.StringExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code thisExpression}
	 * labeled alternative in {@link jccParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThisExpression(jccParser.ThisExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code lessThanExpression}
	 * labeled alternative in {@link jccParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLessThanExpression(jccParser.LessThanExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code sumExpression}
	 * labeled alternative in {@link jccParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSumExpression(jccParser.SumExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arrayLengthExpression}
	 * labeled alternative in {@link jccParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayLengthExpression(jccParser.ArrayLengthExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code charExpression}
	 * labeled alternative in {@link jccParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharExpression(jccParser.CharExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stringLengthExpression}
	 * labeled alternative in {@link jccParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringLengthExpression(jccParser.StringLengthExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arraySelectExpression}
	 * labeled alternative in {@link jccParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArraySelectExpression(jccParser.ArraySelectExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code equalExpression}
	 * labeled alternative in {@link jccParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualExpression(jccParser.EqualExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code divisionExpression}
	 * labeled alternative in {@link jccParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDivisionExpression(jccParser.DivisionExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link jccParser#call_a_method}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCall_a_method(jccParser.Call_a_methodContext ctx);
	/**
	 * Visit a parse tree produced by {@link jccParser#integer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInteger(jccParser.IntegerContext ctx);
	/**
	 * Visit a parse tree produced by {@link jccParser#bool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool(jccParser.BoolContext ctx);
	/**
	 * Visit a parse tree produced by {@link jccParser#cha}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCha(jccParser.ChaContext ctx);
	/**
	 * Visit a parse tree produced by {@link jccParser#string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString(jccParser.StringContext ctx);
	/**
	 * Visit a parse tree produced by {@link jccParser#type_of_variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_of_variable(jccParser.Type_of_variableContext ctx);
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