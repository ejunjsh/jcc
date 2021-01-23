package com.sky.jcc;


import com.sky.jcc.antlr.gen.jccBaseListener;
import com.sky.jcc.antlr.gen.jccParser;
import com.sky.jcc.misc.Utils;
import com.sky.jcc.symTable.ClassRecord;
import com.sky.jcc.symTable.MethodRecord;
import com.sky.jcc.symTable.SymbolTable;
import com.sky.jcc.symTable.VarRecord;

public class SymbolListener extends jccBaseListener {

	SymbolTable symbolTable;
	ClassRecord currentClass;
	MethodRecord currentMethod;
	
	boolean debug = false;

	private enum ScopeTypes {
		PROGRAM("program"),
		CLASS("class"), 
		METHOD("method");

		private final String text;

		private ScopeTypes(final String text) {
			this.text = text;
		}

		@Override
		public String toString() {
			return text;
		}
	}

	public SymbolListener(SymbolTable symbolTable) {
		this.symbolTable = symbolTable;
	}

	/* Program */
	
	@Override
	public void enterProg(jccParser.ProgContext ctx) {
		if(debug)System.out.println("\n1- Program entered");
		//symbolTable.enterScope();	
		symbolTable.setCurrentScopeNameAndType("prog", ScopeTypes.PROGRAM.toString());
		if(debug)System.out.println("\tEntered the SCOPE: " + symbolTable.getCurrentScopeName()+ " || "+symbolTable.getCurrentScopeType()+" \n");
	}

	/* Class - Program SCOPE */
	
	@Override
	public void enterMain_class(jccParser.Main_classContext ctx) {
		if(debug)System.out.println("2-Main class entered: "+ctx.getChild(1).getChild(0).toString());
		
		String id,type;
		type = ctx.getChild(0).toString(); 
		id = ctx.getChild(1).getChild(0).toString(); // IDENTIFIER
		// create record
		currentClass = new ClassRecord(id, type);		
		// add class to PROGRAM SCOPE
		if(debug)System.out.println("\t++MAIN CLASS added to: "+symbolTable.getCurrentClassName()+" || "+symbolTable.getCurrentScopeType());
		symbolTable.put(id, currentClass);
		
		// enter CLASS SCOPE
		symbolTable.enterScope();
		// set scope name & type
		symbolTable.setCurrentScopeNameAndType(id, ScopeTypes.CLASS.toString());
		// update the class
		symbolTable.setCurrentScopeClass(currentClass);
		if(debug)System.out.println("\tEntered the SCOPE: " + symbolTable.getCurrentScopeName() + " || "+symbolTable.getCurrentScopeType()+" \n");
	}
	
	@Override
	public void exitMain_class(jccParser.Main_classContext ctx) {
		if(debug)System.out.println("Exit MAIN_CLASS declaration: "+ currentClass.getId());
		if(debug)System.out.println("\t\tLeaving the scope: "+symbolTable.getCurrentScopeName()+ " || "+symbolTable.getCurrentScopeType());
		symbolTable.exitScope();
		if(debug)System.out.println("\t\tNew scope: "+symbolTable.getCurrentScopeName()+ " || "+symbolTable.getCurrentScopeType()+" \n");	
	}

	@Override
	public void enterClass_declaration(jccParser.Class_declarationContext ctx) {
		if(debug)System.out.println("Class declaration entered: " + ctx.getChild(1).toString());

		String type, id;
		type = ctx.getChild(0).toString(); // get type
		id = ctx.getChild(1).toString(); // get ID
		// create record
		currentClass = new ClassRecord(id, type);		
		if(symbolTable.lookup(id) != null){
			Utils.errorMessage(ctx, "Duplicated class name [ "+ id +" ]");
		}
		// add class to PROGRAM SCOPE
		if(debug)System.out.println("\t++CLASS DECLARATION added to: "+symbolTable.getCurrentClassName()+" || "+symbolTable.getCurrentScopeType());
		symbolTable.put(id, currentClass);		
		//enter class SCOPE
		symbolTable.enterScope();
		// set scope name & type
		symbolTable.setCurrentScopeNameAndType(id, ScopeTypes.CLASS.toString());
		symbolTable.setCurrentScopeClass(currentClass);
		if(debug)System.out.println("\tEntered the SCOPE: " + symbolTable.getCurrentScopeName() + " || "+symbolTable.getCurrentScopeType()+" \n");
	
	}
	
	@Override
	public void exitClass_declaration(jccParser.Class_declarationContext ctx) {
		// insert record into scope	
		if(debug)System.out.println("Exit CLASS declaration: "+ currentClass.getId());
		if(debug)System.out.println("\tLeaving the scope: "+symbolTable.getCurrentScopeName()+ " || "+symbolTable.getCurrentScopeType());
		symbolTable.exitScope();
		if(debug)System.out.println("\tNew scope: "+symbolTable.getCurrentScopeName()+ " || "+symbolTable.getCurrentScopeType()+" \n");
	}

	/* Method - Class SCOPE */
	
	@Override
	public void enterMain_method(jccParser.Main_methodContext ctx) {
		if(debug)System.out.println("Main Method declaration entered: " + ctx.getChild(3).toString());		

		String type, id;
		type = ctx.getChild(0).toString(); // get type
		id = ctx.getChild(3).toString(); // get ID
		
		MethodRecord method = new MethodRecord(id,type);
		if(debug)System.out.println("\t++MAIN METHOD added to: "+symbolTable.getCurrentClassName()+" || "+symbolTable.getCurrentScopeType());
		symbolTable.put(id, method);
		
		// enter METHOD SCOPE
		symbolTable.enterScope();
		// set scope name
		symbolTable.setCurrentScopeNameAndType(id, ScopeTypes.METHOD.toString());
		// add method to currentClass
		currentClass.addMethod(id, method);
		//inherit current class from parent scope
		symbolTable.setCurrentScopeClass(currentClass);	
		if(debug)System.out.println("\tEntered the SCOPE: " + symbolTable.getCurrentScopeName() + " || "+symbolTable.getCurrentScopeType()+" \n");
	}
	
	@Override
	public void exitMain_method(jccParser.Main_methodContext ctx) {
		if(debug)System.out.println("Exit MAIN METHOD declaration: "+ ctx.getChild(1).toString());
		if(debug)System.out.println("\tLeaving the scope: "+symbolTable.getCurrentScopeName()+ " || "+symbolTable.getCurrentScopeType());
		symbolTable.exitScope();
		if(debug)System.out.println("\tNew scope: "+symbolTable.getCurrentScopeName()+ " || "+symbolTable.getCurrentScopeType()+" \n");
	}
	
	@Override
	public void enterMethod_declaration(jccParser.Method_declarationContext ctx) {
		if(debug)System.out.println("Method declaration entered: " + ctx.getChild(1).getChild(0).toString());		

		String type, id;
		type = ctx.getChild(0).getChild(0).getChild(0).toString(); // get type
		id = ctx.getChild(1).getChild(0).toString(); // get ID
		// metod exists on class
		if(currentClass.getMethod(id) != null){
			Utils.errorMessage(ctx, "Method [ "+id+" ] duplicated on class [ "+currentClass.getId()+" ]");
		}
		
		currentMethod = new MethodRecord(id,type);		
		if(debug)System.out.println("\t++METHOD DECLARATION added to: "+symbolTable.getCurrentClassName()+" || "+symbolTable.getCurrentScopeType());
		symbolTable.put(id, currentMethod);
		
		// enter METHOD SCOPE
		symbolTable.enterScope();
		// set scope name
		symbolTable.setCurrentScopeNameAndType(id, ScopeTypes.METHOD.toString());	
		// add method to currentClass
		currentClass.addMethod(id, currentMethod);
		//inherit current class from parent scope
		symbolTable.setCurrentScopeClass(currentClass);		
		if(debug)System.out.println("\tEntered the SCOPE: " + symbolTable.getCurrentScopeName() + " || "+symbolTable.getCurrentScopeType()+" \n");
	}

	@Override
	public void exitMethod_declaration(jccParser.Method_declarationContext ctx) {
		if(debug)System.out.println("Exit METHOD declaration: "+ ctx.getChild(1).getChild(0).toString());
		if(debug)System.out.println("\tLeaving the scope: "+symbolTable.getCurrentScopeName()+ " || "+symbolTable.getCurrentScopeType());
		symbolTable.exitScope();
		if(debug)System.out.println("\tNew scope: "+symbolTable.getCurrentScopeName()+ " || "+symbolTable.getCurrentScopeType()+" \n");
	}
	
	/* Expression - Method SCOPE */
	
	@Override
	public void enterParameter(jccParser.ParameterContext ctx) {
		if(debug)System.out.println("Parameter declaration entered: " + ctx.getChild(1).getChild(0).toString());

		String type, id;
		type = ctx.getChild(0).getChild(0).getChild(0).toString(); // get type
		id = ctx.getChild(1).getChild(0).toString(); // get ID
		// create record
		VarRecord parameter = new VarRecord(id, type);
		// add parameter to method
		currentMethod.addParameter(parameter);
		// insert record into scope
		if(debug)System.out.println("\t++PARAMETER added to: "+symbolTable.getCurrentClassName()+" || "+symbolTable.getCurrentScopeType()+" \n");
		symbolTable.put(id, parameter);
	}
	
	@Override
	public void enterField_declaration(jccParser.Field_declarationContext ctx) {
		if(debug)System.out.println("Field declaration entered: " + ctx.getChild(1).getChild(0).toString());
		if(debug)System.out.println("\tSCOPE: " + symbolTable.getCurrentScopeName() + " || "+symbolTable.getCurrentScopeType());
		String type, id;
		type = ctx.getChild(0).getChild(0).getChild(0).toString(); // get type
		// exception to handle int arrays
		if(ctx.getChild(0).getChild(0).getChild(1) != null){
			type = "int_array";
		}
		id = ctx.getChild(1).getChild(0).toString(); // get ID
		if(symbolTable.lookupInMethod(id) != null) // TODO
			Utils.errorMessage(ctx, "Duplicated identifier [ "+id+" ]");
		// create record
		VarRecord newField = new VarRecord(id, type);
		// insert record into scope
		currentClass.addField(id,newField);
		symbolTable.setCurrentScopeClass(currentClass);	
		if(debug)System.out.println("\t++FIELD DECLARATION added to: "+symbolTable.getCurrentClassName()+" || "+symbolTable.getCurrentScopeType()+" \n");
		symbolTable.put(id, newField);					
	}
	
	
}
