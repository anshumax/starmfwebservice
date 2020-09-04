package com.claroinvestments.bsestarmf.enums;

public enum SystematicPlanType {
	SIP("SIP"), 
	XSIP("XSIP"), 
	ISIP("ISIP"), 
	STP("STP"), 
	SWP("SWP");
	
	private String value; 
	  
    public String getValue() 
    { 
        return this.value; 
    } 
  
    private SystematicPlanType(String value) 
    { 
        this.value = value; 
    }
    
    @Override
    public String toString() {
    	return this.value;
    }

}
