package com.claroinvestments.bsestarmf.enums;

public enum TransMode {
	DEMAT("D"),
	PHYSICAL("P");

	private String value; 
	  
    public String getValue() 
    { 
        return this.value; 
    } 
  
    private TransMode(String value) 
    { 
        this.value = value; 
    }
    
    @Override
    public String toString() {
    	return this.value;
    }
}
