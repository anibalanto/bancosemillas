package main.java.seedsbanks;

public class Seed {

    private final String key;
    private final String name;

    public Seed(String key, String name) {
        this.key = key;
        this.name = name;
    }

    public String getKey() {
        return this.key;
    }

    public String getName() {
        return this.name;
    }
}
