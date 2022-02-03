package constructor;

public enum Fruit {
    APPLE("APPLE"),
    MANGO("MANGO"),
    BANANA("BANANA"),
    ;

    private String name;

    Fruit(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
