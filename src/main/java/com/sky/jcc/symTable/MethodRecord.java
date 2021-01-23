package com.sky.jcc.symTable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class MethodRecord extends Record {

	private HashMap<Integer, VarRecord> parameters = new HashMap<>();
	int paramNumber = 0;

	public MethodRecord(String id, String type) {
		super(id, type);
	}

	public void addParameter(VarRecord parameter) {
		// this.parameters.add(parameter);
		this.parameters.put(paramNumber, parameter);
		paramNumber++;
	}

	// return list of parameters
	/*
	 * public Iterator<Record> getParamIterator() { return
	 * parameters.iterator(); } public List<String> getLocals() { List<String>
	 * localVariables = new ArrayList<>(); // this for is probably not necessary
	 * for (Iterator<Record> iterator = this.getParamIterator();
	 * iterator.hasNext();) { Record next = iterator.next();
	 * localVariables.add(next.getId()); } for (Map.Entry<String, Record> entry
	 * : myScope.records.entrySet()) { String key = entry.getKey(); Record value
	 * = entry.getValue(); if (!localVariables.contains(key)) {
	 * localVariables.add(key); } } return localVariables; }
	 */

	public List<String> getLocals() {
		List<String> locals = new ArrayList<>();
		Iterator it = parameters.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry pair = (Map.Entry) it.next();
			VarRecord tempRec = (VarRecord) pair.getValue();
			locals.add(tempRec.getId());
		}
		return locals;
	}

	// check if method contains parameter
	public boolean containParameter(int paramNumber, Record parameter) {
		// hash map
		Record paramRec = parameters.get(paramNumber);
		if (parameter == null || paramRec == null)
			return false;
		return parameters.get(paramNumber).getType().equals(parameter.getType());
	}

	public int numberOfParameters() {
		return parameters.size();
	}

	public void printParameters() {
		System.out.print("( ");
		Iterator it = parameters.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry pair = (Map.Entry) it.next();
			// System.out.println(pair.getKey() + " = " + pair.getValue());
			System.out.print(pair.getValue().toString());
		}

		/*
		 * for (VarRecord it : parameters) { System.out.print(it.getType() + " "
		 * + it.getId() + " ");
		 * 
		 * }
		 */
		System.out.print(" )\n");
	}

}
