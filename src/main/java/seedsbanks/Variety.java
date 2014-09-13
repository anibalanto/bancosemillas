package main.java.seedsbanks;

public class Variety {
    private String uVarietyID;
    private String name;

	public Variety(String name) {
        this.name = name;
    }
    
    public Variety(String uVarietyID, String name) {
        this.uVarietyID = uVarietyID;
        this.name = name;
    }

    public String getuVarietyID() {
        return this.uVarietyID;
    }
    
    public void setuVarietyID(String uVarietyID) {
		this.uVarietyID = uVarietyID;
	}    

    public String getName() {
        return this.name;
    }
}
