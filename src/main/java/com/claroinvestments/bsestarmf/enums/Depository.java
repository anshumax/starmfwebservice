package com.claroinvestments.bsestarmf.enums;

public enum Depository {
	CDSL("CDSL"),
	NSDL("NSDL");

	private String value; 
	  
    public String getValue() 
    { 
        return this.value; 
    } 
  
    private Depository(String value) 
    { 
        this.value = value; 
    }
    
    @Override
    public String toString() {
    	return this.value;
    }
}
