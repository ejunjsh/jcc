package com.sky.jcc.interpreter;


/*
 * Main for code execution
 * */

public class TJInterpreter {
	
	public static void main(String[] args){
		String programName = null;		
		
		// presentation
				System.out.println("\n*** CC1 - PA3 - ap222ze ***");
				System.out.println(
						"\nThe following program does: \n\t ->Code interpretation ");

		
		// read program name from args
		try {
			programName = args[0];
		} catch (Exception e) {
			System.out.println("\nIntroduce the file name as args[0]");
			System.exit(0);
		}
		// test the .java file
		if (!validTjcFile(programName)) {
			System.out.println("\nOnly .tjc files valid");
			System.exit(0);
		}		
		
		System.out.println("\nInterpreting file: " + programName+"\n");
		
		// create and fire the stackMachine
		StackMachine stackMachine = new StackMachine(programName);		
		stackMachine.startExecution();		
	}
	
	private static boolean validTjcFile(String fileName) {
		return fileName.toLowerCase().endsWith(".tjc");
	}

}
