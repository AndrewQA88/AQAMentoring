package humanemployeeexercise;

import java.time.ZonedDateTime;

public class Human implements Creature {

    private final ZonedDateTime birthDate;
    private final String name;
    private final String GREETING;
    private int weight;
    private int height;

    Human(String name, ZonedDateTime birthDate) {

        this.GREETING = "Hello, I'm human.";
        this.birthDate = birthDate;
        this.name = name;
    }

    public ZonedDateTime getBirthDate() {
        return birthDate;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return this.GREETING + "\n" + "Name: " + this.name;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public int getWeight() {
        return weight;
    }

    @Override
    public int getHeight() {
        return height;
    }
}
