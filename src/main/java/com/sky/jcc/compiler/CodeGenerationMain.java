package com.sky.jcc.compiler;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

import com.sky.jcc.SymbolListener;
import com.sky.jcc.antlr.gen.jccLexer;
import com.sky.jcc.antlr.gen.jccParser;
import com.sky.jcc.misc.FileUtils;
import com.sky.jcc.symTable.SymbolTable;
import com.sky.jcc.symTable.TypeCheckVisitor;
import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.BufferedTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;



/*
 * Helper class that execute the type analysis and
* the file to compile is passed as args[]
 */

public class CodeGenerationMain {

	static String fullFileName = ""; // ex. Main.java
	static String fileName = ""; // ex. Main
	static boolean error = false;

	public static void main(String[] args) {

		// presentation
		System.out.println("\n*** CC1 - PA3 - ap222ze ***");
		System.out.println(
				"\nThe following program does: \n\t ->Syntax Tree build \n\t ->Symbol Table construction \n\t ->Type checking \n\t ->Code Generation ");

		// get file name
		try {
			fullFileName = args[0];
		} catch (Exception e) {
			System.out.println("\nIntroduce the file name as args[0]");
			System.exit(0);
		}

		// test .java file
		if (!validJavaFile(fullFileName)) {
			System.out.println("\nOnly generate .java files valid");
			System.exit(0);
		}

		fileName = fullFileName.substring(0, fullFileName.indexOf("."));
		
		System.out.println("\nProcessing file: " + fullFileName);
		
		Path filePath = Paths.get(fullFileName);
		codeGeneration(filePath);

		if (error)
			System.err.println("ERROR ON FILE");
		
		System.exit(0);
	}

	private static void codeGeneration(Path filePath) {
		String filePathString = filePath.toString();

		// Parse input program
		jccLexer lexer = null;
		try {
			lexer = new jccLexer(new ANTLRFileStream(filePathString));
		} catch (IOException e) {
			System.out.println("File '"+filePath.getFileName()+"' not found");
			return;
		}
		jccParser parser = new jccParser(new BufferedTokenStream(lexer));
		jccParser.ProgContext tree = parser.prog();

		SymbolTable symbolTable = new SymbolTable();

		// symbol table construction
		ParseTreeWalker walker = new ParseTreeWalker();
		SymbolListener symbolListener = new SymbolListener(symbolTable);
		walker.walk(symbolListener, tree);

		// print the symbol table
		symbolTable.printTable();

		// type checking visitor
		TypeCheckVisitor typeCheckerVisitor = new TypeCheckVisitor();
		symbolTable.resetTable();
		typeCheckerVisitor.setSymbolTable(symbolTable);
		typeCheckerVisitor.visit(tree);
		
		// code generation + hdd storing
		symbolTable.resetTable();
		System.out.println("\nGenerated code");
		System.out.println("==============");
		CodeGenerationVisitor codeGenerationVisitor = new CodeGenerationVisitor(symbolTable);
		codeGenerationVisitor.visit(tree);		
		// store the generated code to disk
		codeGenerationVisitor.getClassfile().print();
		FileUtils.objectToFile(codeGenerationVisitor.getClassfile(), fileName+".jcc");
	}
	
	private static boolean validJavaFile(String fileName) {
		return fileName.toLowerCase().endsWith(".java");
	}

}
