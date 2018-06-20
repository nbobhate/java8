package io.github.nbobhate.patterns.creational.singleton;

public class Manager {

    private static Manager instance;

    private String name;

    private Manager() {
        this.name = "Ron";
    }

    public static Manager getInstance() {
        if (instance == null) {
            instance = new Manager();
        }

        return instance;
    }

    public String getName() {
        return name;
    }
}
