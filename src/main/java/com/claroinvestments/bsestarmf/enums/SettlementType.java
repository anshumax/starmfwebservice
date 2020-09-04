package com.claroinvestments.bsestarmf.enums;

public enum SettlementType {
	ALL("ALL"),
	L0("L0"),
	L1("L1"),
	OTHERS("OTHERS");
	
	private String value; 
	  
    public String getValue() 
    { 
        return this.value; 
    } 
  
    private SettlementType(String value) 
    { 
        this.value = value; 
    }
    
    @Override
    public String toString() {
    	return this.value;
    }
}
