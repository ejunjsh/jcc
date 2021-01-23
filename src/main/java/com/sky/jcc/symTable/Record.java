package com.sky.jcc.symTable;

public class Record {

	protected String id;
	protected String type;
	
	public Record (String id, String type){
		this.id = id;
		this.type = type;
	}
	
	public String getId(){
		return this.id;
	}
	
	public String getType(){
		return this.type;
	}
	
	@Override
	public String toString() {	
		return "Record: "+id+" : "+type;
	}
	
}
