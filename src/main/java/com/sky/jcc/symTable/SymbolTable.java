package com.sky.jcc.symTable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class SymbolTable{

	private Scope root ; // the root scope
	private Scope current; // current scope
	
	boolean debug = false;	
	
	public SymbolTable() {
		this.root = new Scope(null);
		this.current = root;
	}
	
	public String getCurrentClassName(){
		return this.current.getContainingClass().getId();
	}
	
	public String getCurrentScopeName(){
		return this.current.getScopeName();
	}
	
	public Scope getCurrentScope(){
		return current;
	}
	
	public String getCurrentScopeType(){
		return this.current.getScopeType();
	}
	
	public void setCurrentScopeNameAndType(String scopeName, String scopeType){
		this.current.setScopeNameAndType(scopeName, scopeType);
	}

	// create a new scope if necessary
	public void enterScope() {
		current = current.nextChild();
	}

	public void setCurrentScopeClass(ClassRecord containingClass) {
		this.current.setContainingClass(containingClass);
	}	

	public void exitScope() {
		current = current.getParent();
	}

	public void put(String key, Record item) {
		current.put(key, item);
	}

	public Record lookup(String key) {
		if(debug)System.out.println("\t Current SCOPE: "+current.getScopeName()+" | "+current.getScopeType());
		return current.lookup(key);
	}
	
	public Record lookupInMethod(String key) {
		if(debug)System.out.println("\t Current SCOPE: "+current.getScopeName()+" | "+current.getScopeType());
		return current.lookupInMethod(key);
	}	
	
	
	// diagnostics
	public void printTable() {
		System.out.println("\n\tSymbol Table:\n");
		System.out.printf("%s %n", "+-------------------------------------------------------------------------------------------+");
		System.out.printf("%" + 18 + "s %" + 32 + "s %" + 32 + "s %n", "ID", "RECORD", "SCOPE");
		System.out.printf("%s %n", "+-------------------------------------------------------------------------------------------+");
		root.printScope();
		System.out.printf("%s %n", "+-------------------------------------------------------------------------------------------+");
	}

	private void printLine(String id, String record, String scope) {
		System.out.printf("%" + 20 + "s %" + 32 + "s %" + 35 + "s %n", id, record, scope);
	}

	// called before each traversal
	public void resetTable() {
		root.resetScope();
	}

	// iterate the tree and print the RECORDS
	public void debugScopeTree(){
		root.debugScope();			
	}
	
	// iterate the scope tree and print everything
	public void printScopeTree(){
		System.out.println("\n\n");
		root.printScopeDebug();
	}
	
	
	private class Scope {
		private int next = 0; // next child to visit
		private Scope parent; // parent scope
		// children scopes
		private ArrayList<Scope> children = new ArrayList<Scope>();
		// symbol to record map
		private Map<String, Record> records = new HashMap<String, Record>();
		ClassRecord containingClass = new ClassRecord("prog", "program");
		// for visual identification
		String scopeName = "";  
		String scopeType = "";
		
		public Scope(Scope parent) {
			this.parent = parent;
		}
		
		public void setScopeNameAndType(String scopeName, String scopeType) {
			this.scopeName = scopeName;
			this.scopeType = scopeType;
		}
		
		public String getScopeName(){
			return this.scopeName;
		}
		 		
		public String getScopeType(){
			return scopeType;
		}
		
		public ClassRecord getContainingClass() {
			return containingClass;
		}

		public void setContainingClass(ClassRecord containingClass) {
			this.containingClass = containingClass;
		}

		public Record getMethod(String methodName){
			return this.containingClass.getMethod(methodName);
		}
		
		public void printScope() {
			// print all the containing records
			Iterator it = records.entrySet().iterator();
			while (it.hasNext()) {
				Map.Entry pair = (Map.Entry) it.next();
				Record temp = (Record) pair.getValue();
				printLine(pair.getKey().toString(), temp.getId() + " - " + temp.getType(), scopeName+" [ "+scopeType+" ]");
			}
			// print children
			for (Scope scopeIt : children) {
				scopeIt.printScope();
			}
		}

		public void printScopeDebug(){			
			System.out.println("SCOPE: "+scopeName+" | "+scopeType+" \tCLASS: "+containingClass.getId());
			System.out.println(" RECORDS: ");
			Iterator it = records.entrySet().iterator();
			while (it.hasNext()) {
				Map.Entry pair = (Map.Entry) it.next();
				Record temp = (Record) pair.getValue();
				if(temp instanceof ClassRecord){
					System.out.println("\t CLASS RECORD");
				}else if(temp instanceof MethodRecord){
					System.out.println("\t METHOD RECORD");
				}else{
					System.out.println("\t VAR RECORD");
				}
				printLine(pair.getKey().toString(), temp.getId() + " - " + temp.getType(), scopeName+" [ "+scopeType+" ]");							
			}
			System.out.println("-");
			for (Scope scopeIt : children) {
				System.out.println(scopeName+" | "+scopeType+" -> CHILDREN: "+scopeIt.getScopeName()+" | "+scopeIt.getScopeType());
				scopeIt.printScopeDebug();
			}
			
		}
		
		// add a new record to the current scope
		public void put(String key, Record item) {
			records.put(key, item);
		}

		public Scope nextChild() {
			Scope nextChild;
			if (next >= children.size()) {
				nextChild = new Scope(this); // create a new Scope passing the parent scope
				children.add(nextChild);
			} else {
				// child exists
				nextChild = (Scope) children.get(next); // visited the next
														// child (Scope)
			}
			next++;
			return nextChild;
		}

		public Record lookup(String key) {
			if(key.equals("this")){ // 'this' case
				return containingClass;
			}
			if (records.containsKey(key)) { // is the key in current scope?
				Record rec = (Record) records.get(key);
				if(debug)System.out.println("\tRecord found on: "+scopeName+" [ "+scopeType+" ]");
				return rec;
			} else {
				// move the scope to parent scope
				if (parent == null) {
					return null; // identifier is not contained
				} else {
					return parent.lookup(key); // send the req to parent
				}
			}
		}
		
		public Record lookupInMethod(String key){
			if(key.equals("this")){ // 'this' case
				return containingClass;
			}
			if (records.containsKey(key)) { // is the key in current scope?
				Record rec = (Record) records.get(key);
				if(debug)System.out.println("\tRecord found on: "+scopeName+" [ "+scopeType+" ]");
				return rec;
			} else {			
				return null; // identifier is not contained
			}
		}

		public void resetScope() {
			next = 0; // first child to visit next
			for (int i = 0; i < children.size(); i++) {
				((Scope) children.get(i)).resetScope();
			}
		}

		public Scope getParent() {
			return this.parent;
		}
	
		public void debugScope(){
			// print the records of the scopes			
			Iterator it = records.entrySet().iterator();
			while (it.hasNext()) {
				Map.Entry pair = (Map.Entry) it.next();
				Record temp = (Record) pair.getValue();				
				if(temp instanceof ClassRecord){
					System.out.println("\n\nCLASS RECORD FOUND : "+temp.id);
					ClassRecord instance = (ClassRecord)temp;
					instance.printMethods();
					instance.printFieldDeclarations();
				}				
			}
			// print children
			for (Scope scopeIt : children) {
				scopeIt.debugScope();
			}
		}
	}
}
