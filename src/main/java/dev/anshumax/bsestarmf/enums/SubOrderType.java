package dev.anshumax.bsestarmf.enums;

public enum SubOrderType {
	ALL("All"),
	NRM("NRM"),
	SPOR("SPOR"),
	SWITCH("SWITCH");

	private String value; 
	  
    public String getValue() 
    { 
        return this.value; 
    } 
  
    private SubOrderType(String value) 
    { 
        this.value = value; 
    }
    
    @Override
    public String toString() {
    	return this.value;
    }
}
