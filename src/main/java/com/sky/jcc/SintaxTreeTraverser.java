package com.sky.jcc;

import java.io.IOException;

import com.sky.jcc.antlr.gen.jccLexer;
import com.sky.jcc.antlr.gen.jccParser;
import com.sky.jcc.symTable.SymbolTable;
import com.sky.jcc.symTable.TypeCheckVisitor;
import org.antlr.v4.gui.Trees;
import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.BufferedTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;


public class SintaxTreeTraverser {

	public static void traverseSintaxTree(){
		
		//file containing the program
		String myPath = "test_program.java";
		System.out.println("Reading program from: " + myPath);

		// parse the imput program
		jccLexer lexer = null;
		try {
			lexer = new jccLexer(new ANTLRFileStream(myPath));
		} catch (IOException e) {
			e.printStackTrace();
		}
		jccParser parser = new jccParser(new BufferedTokenStream(lexer));
		jccParser.ProgContext tree = parser.prog();
	
		// display the generated tree
		Trees.inspect(tree, parser);
		
		SymbolTable symbolTable = new SymbolTable();
		
		// symbol table construction		
		ParseTreeWalker walker = new ParseTreeWalker();
		SymbolListener symbolListener= new SymbolListener(symbolTable);
		walker.walk(symbolListener, tree);
	
		// print the symbol table
		symbolTable.printTable();
				
		// debug the scope tree V2
		//symbolTable.printScopeTree();
		
		// DEBUG THE SCOPE TREE		
		//symbolTable.debugScopeTree();
		
		//type checking visitor				
		TypeCheckVisitor typeChecker = new TypeCheckVisitor();
		symbolTable.resetTable();
		typeChecker.setSymbolTable(symbolTable);
		typeChecker.visit(tree);
		
		
	}
	
}
