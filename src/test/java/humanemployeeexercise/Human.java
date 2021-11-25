package humanemployeeexercise;

import java.time.ZonedDateTime;

public class Human extends People {

    private final ZonedDateTime birthDate;
    private final String name;
    protected String greeting;

    Human(String name, ZonedDateTime birthDate) {

        this.greeting = "Hello, I'm human.";
        this.birthDate = birthDate;
        this.name = name;
    }

    protected Object voice() {
        return "Hey";
    }

    public ZonedDateTime getBirthDate() {
        return birthDate;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return this.greeting + "\n" + "Name: " + this.name + "\n" + "Birthday: " + this.birthDate;
    }

    @Override
    void temperature() {
        System.out.println("lives in a temperate environment");
    }

    @Override
    void surroundings() {
        System.out.println("lives on land");
    }

    @Override
    void foodSource() {
        System.out.println("eats other organisms as its food source");
    }
}
