package com.sky.jcc.compiler;

import java.io.Serializable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class ClassFile implements Serializable{

	private static final long serialVersionUID = 1L;
	private Map<String, Method> methods = new LinkedHashMap<>(); // linked hash map for predictable iteration
	
	public void print(){
		Iterator it = methods.entrySet().iterator();
	    while (it.hasNext()) {
	        Map.Entry pair = (Map.Entry)it.next();
	        System.out.println("\nMethod: "+pair.getKey());
	        Method method = (Method) pair.getValue();
	        method.print();
	    }
	}
	
	public void addMethod(String methodName, Method method){
		this.methods.put(methodName, method);
	}
	
	public Method getMethod(String name){
		if(name.equals("main"))
			return (Method) methods.entrySet().iterator().next().getValue(); // first method -> main
		Method temp = methods.get(name);
		//temp.restart();
		return temp;
	}
	
	public boolean containsMethod(String methodName){
		return methods.containsKey(methodName);
	}
}
