package main.java.seedsbanks;

public class Variety {
    private final String uVarietyID;
    private final String name;

    public Variety(String uVarietyID, String name) {
        this.uVarietyID = uVarietyID;
        this.name = name;
    }

    public String getuVarietyID() {
        return this.uVarietyID;
    }

    public String getName() {
        return this.name;
    }
}
