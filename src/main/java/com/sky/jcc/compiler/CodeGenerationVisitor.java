package com.sky.jcc.compiler;


import com.sky.jcc.antlr.gen.jccBaseVisitor;
import com.sky.jcc.antlr.gen.jccParser;
import com.sky.jcc.misc.Utils;
import com.sky.jcc.symTable.MethodRecord;
import com.sky.jcc.symTable.Record;
import com.sky.jcc.symTable.SymbolTable;

public class CodeGenerationVisitor  extends jccBaseVisitor<Record> implements ICodes{

	private SymbolTable symbolTable; // from prev iteration
	private Method currentMethod;
	private String currentClass;
	private ClassFile classfile; // to be saved on disk 
	
	private boolean fieldDeclaration = false;
	
	public CodeGenerationVisitor(SymbolTable symbolTable) {
		this.symbolTable = symbolTable;
	}
	
	@Override
	public Record visitMain_class(jccParser.Main_classContext ctx) {
		currentClass = ctx.getChild(1).getText();
		classfile = new ClassFile();
		//System.out.println("\nClass: "+currentClass);	
		symbolTable.enterScope();
		visit(ctx.getChild(3));		
		symbolTable.exitScope();	
		currentMethod.addInstruction(new Instruction(STOP, null));
		return null;
	}

	@Override
	public Record visitClass_declaration(jccParser.Class_declarationContext ctx) {
		currentClass = ctx.getChild(1).getText();
		//System.out.println("\nClass: "+currentClass);	
		symbolTable.enterScope();
		visit(ctx.getChild(3));
		symbolTable.exitScope();
		return null;		
	}

	@Override
	public Record visitMain_method(jccParser.Main_methodContext ctx) {
 		String methodName = ctx.getChild(3).getText();
		//System.out.println("\nMethod: "+methodName+"\n");
		MethodRecord methodRecord = (MethodRecord) symbolTable.lookup(methodName);
		if(methodRecord == null)
			Utils.errorMessage(ctx, "Error on method "+methodName);
		// create new method
		currentMethod = new Method();		
		// populate currentMethod (not parameters in main)
		symbolTable.enterScope();
		visit(ctx.getChild(11));
		symbolTable.exitScope();
		// add to classFile
		classfile.addMethod(currentClass+"."+methodName,currentMethod ); // add the method to classFile
		return null;
	}
	
	@Override
	public Record visitMethod_declaration(jccParser.Method_declarationContext ctx) {
		String methodName = ctx.getChild(1).getText(); // method name	
		//System.out.println("\nMethod: "+methodName+"\n");
		MethodRecord methodRecord = (MethodRecord) symbolTable.lookup(methodName);
		if(methodRecord == null)
			Utils.errorMessage(ctx, "Error on method "+methodName);
		// create new method
		currentMethod = new Method();
		// add method parameter-variables					
		currentMethod.setVariables(methodRecord.getLocals()); 	
		// enter scope
		symbolTable.enterScope();
		//param declaration
		visit(ctx.getChild(3));
		// method body
		visit(ctx.getChild(6));
		// exit scope
		symbolTable.exitScope();
		// add to classFile
		classfile.addMethod(currentClass+"."+methodName,currentMethod ); // add the method to classFile
		return null;
	}
	
	@Override
	public Record visitField_declaration(jccParser.Field_declarationContext ctx) {
		fieldDeclaration = true;
		visit(ctx.getChild(0));
		fieldDeclaration = false;
		return null;
	}
	
	@Override
	public Record visitAssignStatement(jccParser.AssignStatementContext ctx) {
		String lhs = ctx.getChild(0).getText(); // LHS name
		visit(ctx.getChild(2)); // generate RHS code
		int index = currentMethod.getIndexOf(lhs); 
		currentMethod.addInstruction(new Instruction(ISTORE, index));
		return null;
	}
	
	@Override
	public Record visitIfStatement(jccParser.IfStatementContext ctx) {
		visit(ctx.getChild(2)); // generate condition		
		int iflabel = currentMethod.getIndex();
		currentMethod.addInstruction(new Instruction(IF_FALSE, null));
		visit(ctx.getChild(4)); // generate if body
		Instruction instr = currentMethod.getInstruction(iflabel);
		instr.setArgument(currentMethod.getIndex()+1); // update if_false
		
		int gotolabel = currentMethod.getIndex(); // save goto
		currentMethod.addInstruction(new Instruction(GOTO, null));
		if(ctx.getChild(6) != null){
			visit(ctx.getChild(6)); // generate if else body
			instr = currentMethod.getInstruction(gotolabel);
			instr.setArgument(currentMethod.getIndex());
		}
		return null;
	}
	
	@Override
	public Record visitWhileStatement(jccParser.WhileStatementContext ctx) {
		int whilelabel = currentMethod.getIndex();
		visit(ctx.getChild(2)); // generate condition	
		int iffalse = currentMethod.getIndex();
		currentMethod.addInstruction(new Instruction(IF_FALSE, null));
		visit(ctx.getChild(4)); // generate while body				
		Instruction instr = currentMethod.getInstruction(iffalse);
		instr.setArgument(currentMethod.getIndex()+1); // update if_false
		
		int gotolabel = currentMethod.getIndex();
		currentMethod.addInstruction(new Instruction(GOTO, null));
		instr = currentMethod.getInstruction(gotolabel);
		instr.setArgument(whilelabel);
		return null;
	}
	
	/* -- OPERATIONS -- */
	
	/* ILOAD */
	@Override
	public Record visitIdentifier(jccParser.IdentifierContext ctx) {
		int index = currentMethod.getIndexOf(ctx.getText());
		//System.out.println("ID VISITED: "+ctx.getText()+" : "+index);
		currentMethod.addInstruction(new Instruction(ILOAD, index));
		return null;
	}
	
	/* ICONST */
	@Override
	public Record visitInteger(jccParser.IntegerContext ctx) {
		if(!fieldDeclaration){
		int value = Integer.parseInt(ctx.getChild(0).toString());
		currentMethod.addInstruction(new Instruction(ICONST, value));
		}
		return null;
	}
	
	@Override
	public Record visitParameters(jccParser.ParametersContext ctx) {
		// reverse them
		int params = ctx.getChildCount();
		for(int i = params-1; i >= 0; i -= 2){
			visit(ctx.getChild(i));
		}
		return null;
	}
	
	/* ISTORE */
	@Override
	public Record visitParameter(jccParser.ParameterContext ctx) {
		// add them in reverse
		int numChildren = ctx.getChildCount();
		String varName = ctx.getChild(1).getChild(0).toString();
		//System.out.println("Param decl: "+varName);
		int index = currentMethod.getIndexOf(varName);
		currentMethod.addInstruction(new Instruction(ISTORE, index));
		return null;
	}
	
	/* IADD */
	@Override
	public Record visitSumExpression(jccParser.SumExpressionContext ctx) {
		int numChildren = ctx.getChildCount();
		visit(ctx.getChild(0)); // first factor code
		for(int i= 2; i < numChildren; i+=2){
			visit(ctx.getChild(i));
			currentMethod.addInstruction(new Instruction(IADD, null));
		}
		return null;
	}
	
	/* ISUB */
	@Override
	public Record visitSubstractionExpression(jccParser.SubstractionExpressionContext ctx) {
		int numChildren = ctx.getChildCount();
		visit(ctx.getChild(0)); // first factor code
		for(int i= 2; i < numChildren; i+=2){
			visit(ctx.getChild(i));
			currentMethod.addInstruction(new Instruction(ISUB, null));
		}
		return null;
	}
	
	/* IMUL */
	@Override
	public Record visitMultiplicationExpression(jccParser.MultiplicationExpressionContext ctx) {
		int numChildren = ctx.getChildCount();
		visit(ctx.getChild(0)); // first factor code
		for(int i= 2; i < numChildren; i+=2){
			visit(ctx.getChild(i));
			currentMethod.addInstruction(new Instruction(IMUL, null));
		}
		return null;
	}
	
	/* IDIV */
	@Override
	public Record visitDivisionExpression(jccParser.DivisionExpressionContext ctx) {
		int numChildren = ctx.getChildCount();
		visit(ctx.getChild(0)); // first factor code
		for(int i= 2; i < numChildren; i+=2){
			visit(ctx.getChild(i));
			currentMethod.addInstruction(new Instruction(IDIV, null));
		}
		return null;
	}
	
	/* ILT */
	@Override
	public Record visitLessThanExpression(jccParser.LessThanExpressionContext ctx) {
		int numChildren = ctx.getChildCount();
		visit(ctx.getChild(0)); // first factor code
		for(int i= 2; i < numChildren; i+=2){
			visit(ctx.getChild(i));
			currentMethod.addInstruction(new Instruction(ILT, null));
		}		
		return null;
	}

	/* IEQ */
	@Override
	public Record visitEqualExpression(jccParser.EqualExpressionContext ctx) {
		int numChildren = ctx.getChildCount();
		visit(ctx.getChild(0)); // first factor code
		for(int i= 2; i < numChildren; i+=2){
			visit(ctx.getChild(i));
			currentMethod.addInstruction(new Instruction(IEQ, null));
		}		
		return null;
	}
	
	/*  IAND + IOR */
	@Override
	public Record visitComparisonExpression(jccParser.ComparisonExpressionContext ctx) {
		int numChildren = ctx.getChildCount();
		visit(ctx.getChild(0)); // first factor code
		for(int i= 2; i < numChildren; i+=2){
			visit(ctx.getChild(i));
			if(ctx.getChild(i-1).toString().equals("&&")){
				currentMethod.addInstruction(new Instruction(IAND, null));
			}else if(ctx.getChild(i-1).toString().equals("||")){
				currentMethod.addInstruction(new Instruction(IOR, null));
			}else{
				System.out.println("ERROR ERROR ERROR");
			}
		}		
		return null;
	}	
	
	/* INOT */
	@Override
	public Record visitNotExpression(jccParser.NotExpressionContext ctx) {
		visit(ctx.getChild(1));
		currentMethod.addInstruction(new Instruction(INOT, null));
		return null;
	}
	
	/* GOTO + IFFALSE  [ UP ] */
	
	/* INVOKEVIRTUAL */
	@Override
	public Record visitMethodCallExpression(jccParser.MethodCallExpressionContext ctx) {
		// TODO
		int numChildren = ctx.getChildCount();
		String invClassName; // target class ID
		if(ctx.getChild(0).getChild(0).toString().equals("this")){
			invClassName = currentClass; // this.
		}else{
			invClassName = ctx.getChild(0).getChild(1).getChild(0).toString(); // new X.
		}
		// push parameters
		int parameterNumber = ctx.getChild(numChildren-1).getChildCount() - 3; // id, ( , )
		for(int i = 0; i < parameterNumber ; i += 2){
			visit(ctx.getChild(numChildren-1).getChild(2+i)); // add each parameter
		}
	
		String invMethodName = ctx.getChild(2).getChild(0).getChild(0).toString(); // target method ID
		currentMethod.addInstruction(new Instruction(INVOKEVIRTUAL, invClassName+"."+invMethodName));
		return null;
	}	
	
	/* IRETURN */
	@Override
 	public Record visitReturn_statement(jccParser.Return_statementContext ctx) {
		visit(ctx.getChild(1));
		currentMethod.addInstruction(new Instruction(IRETURN, null));
		return null;
	}
	
	/* PRINT */
	@Override
	public Record visitPrintStatement(jccParser.PrintStatementContext ctx) {
		visit(ctx.getChild(2)); // visit inside print
		currentMethod.addInstruction(new Instruction(PRINT,null));
		return null;
	}
	
	/* STOP */
	@Override
	public Record visitProg(jccParser.ProgContext ctx) {
		for(int i = 0; i < ctx.getChildCount() ; i++){
			visit(ctx.getChild(i));
		}		
		// print all
		//classfile.print();				
		return null;		
	}

	public ClassFile getClassfile() {
		return classfile;
	}
	
}
