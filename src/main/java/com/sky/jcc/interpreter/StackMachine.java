package com.sky.jcc.interpreter;

import com.sky.jcc.compiler.ICodes;
import com.sky.jcc.compiler.Instruction;
import com.sky.jcc.compiler.Method;

import java.util.Stack;



/*
 * Huge switch case
 */

public class StackMachine implements ICodes {

	// data stack
	private Stack<Integer> dataStack = new Stack<>();
	// activation stack
	private Stack<Method> activationStack = new Stack<>();
	private Method currentActivation;

	private ClassRepository classRepository;

	private int code;
	private Instruction instruction;

	private boolean debug = false;
	
	int activation = 0;
	
	public StackMachine(String programName) {
		classRepository = new ClassRepository(programName);
	}

	public void startExecution() {
		// TODO PRETTY TEXT
		int v1, v2;

		currentActivation = classRepository.getMethod("main");
		while (code != STOP) {
			if(debug)
				System.out.println("PC: "+currentActivation.getPC());			
			instruction = currentActivation.nextInstruction();
			
			code = instruction.getCode();
			if (debug) {
				System.out.println(dataStack);
				instruction.print();
				System.out.println("--");
			}			
			Object arg = instruction.getArgument();
			switch (code) {
			case ILOAD:
				v1 = currentActivation.getVariableValue((int) arg);
				dataStack.push(v1);
				break;
			case ICONST:
				dataStack.push((Integer) arg);
				break;
			case ISTORE:
				v1 = dataStack.pop();
				currentActivation.storeVariable((int) arg, v1);
				break;
			case IADD:
				v1 = dataStack.pop();
				v2 = dataStack.pop();
				dataStack.push(v2 + v1);
				break;
			case ISUB:
				v1 = dataStack.pop();
				v2 = dataStack.pop();
				dataStack.push(v2 - v1);
				break;
			case IMUL:
				v1 = dataStack.pop();
				v2 = dataStack.pop();
				dataStack.push(v2 * v1);
				break;
			case IDIV:
				v1 = dataStack.pop();
				v2 = dataStack.pop();
				dataStack.push(v2 / v1);
				break;
			case ILT:
				v1 = dataStack.pop();
				v2 = dataStack.pop();
				if (v2 < v1) {
					dataStack.push(1);
				} else {
					dataStack.push(0);
				}
				break;
			case IEQ:
				v1 = dataStack.pop();
				v2 = dataStack.pop();
				if (v2 == v1) {
					dataStack.push(1);
				} else {
					dataStack.push(0);
				}
				break;
			case IAND:
				v1 = dataStack.pop();
				v2 = dataStack.pop();
				if (v2 * v1 == 0) {
					dataStack.push(0);
				} else {
					dataStack.push(1);
				}
				break;
			case IOR:
				v1 = dataStack.pop();
				v2 = dataStack.pop();
				if (v2 + v1 == 0) {
					dataStack.push(0);
				} else {
					dataStack.push(1);
				}
				break;
			case INOT:
				v1 = dataStack.pop();
				if (v1 == 0) {
					dataStack.push(1);
				} else {
					dataStack.push(0);
				}
				break;
			case GOTO:
				int inst = (int) arg;
				currentActivation.jumpInstruction(inst);
				break;
			case IF_FALSE:
				v1 = dataStack.pop();
				if (v1 == 0) {
					currentActivation.jumpInstruction((int) arg);
				}
				break;
			case INVOKEVIRTUAL:
				activation++;
				//System.out.println("--ACTIVATION : "+activation);
				activationStack.push(currentActivation);
				// switch to new method
				currentActivation = classRepository.getMethod((String) arg);
				break;
			case IRETURN:				
				//System.out.println("--DE ACTIVATION : "+activation);
				activation--;
				currentActivation = activationStack.pop();
				break;
			case PRINT:
				System.out.println(dataStack.pop());
				break;
			case STOP:
				//System.out.println("\nExecution finished");
				break;
			default:
				return;
			}
		}

	}
}
