package com.claroinvestments.bsestarmf.enums;

public enum TransactionType {
	PURCHASE("P"),
	REDEMPTION("R"),
	SWITCH_OUT("SO");

	private String value; 
	  
    public String getValue() 
    { 
        return this.value; 
    } 
  
    private TransactionType(String value) 
    { 
        this.value = value; 
    }
    
    @Override
    public String toString() {
    	return this.value;
    }
}
