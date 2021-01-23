package com.sky.jcc.compiler;

import java.io.Serializable;

public class Instruction implements Serializable{

	private int code;
	private Object argument;
	
	public Instruction(){}
	
	public Instruction(int code, Object argument){
		this.code = code;
		this.argument = argument;	
	}
	
	public String getICodeString(int code) {	
		switch (code){
			case 1:
				return "ILOAD";
			case 2:
				return "ICONST";
			case 3:
				return "ISTORE";
			case 4:
				return "IADD";
			case 5:
				return "ISUB";
			case 6:
				return "IMUL";
			case 7:
				return "IDIV";
			case 8:
				return "ILT";
			case 9:
				return "IEQ";
			case 10:
				return "IAND";
			case 11:
				return "IOR";
			case 12:
				return "INOT";
			case 13:
				return "GOTO";
			case 14:
				return "IF_FALSE";
			case 15:
				return "INVOKEVIRTUAL";
			case 16:
				return "IRETURN";
			case 17:
				return "PRINT";
			case 18:
				return "STOP";
			default:
				return null;
		}
	}
	
	public void print(){
		System.out.print(String.format("%-18s" , getICodeString(code)));
		if(argument != null){			
			if(getICodeString(code).equals("ISTORE") || getICodeString(code).equals("ILOAD")){
				System.out.print(String.format("%-3s" , "#"+argument));
			}else{
				System.out.print(String.format("%-3s" , argument));
			}
		}
		System.out.print("\n");
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public Object getArgument() {
		return argument;
	}

	public void setArgument(Object argument) {
		this.argument = argument;
		//System.out.println("Instruction updated: "+getICodeString(this.code)+" "+this.argument);
	}
	
}
