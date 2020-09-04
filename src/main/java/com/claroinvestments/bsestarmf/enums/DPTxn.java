package com.claroinvestments.bsestarmf.enums;

public enum DPTxn {
	CDSL("C"),
	NSDL("N"),
	PHYSICAL("P");

	private String value; 
	  
    public String getValue() 
    { 
        return this.value; 
    } 
  
    private DPTxn(String value) 
    { 
        this.value = value; 
    }
    
    @Override
    public String toString() {
    	return this.value;
    }
}
