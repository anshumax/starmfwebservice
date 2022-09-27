package dev.anshumax.bsestarmf.enums;

public enum OrderType {
	ALL("All"),
	NRM("NRM"),
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
  
    private OrderType(String value) 
    { 
        this.value = value; 
    }
    
    @Override
    public String toString() {
    	return this.value;
    }
}
