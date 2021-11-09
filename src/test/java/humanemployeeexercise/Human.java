package humanemployeeexercise;

import java.io.Serializable;
import java.time.ZonedDateTime;

public class Human implements Creature, Serializable {

    private final ZonedDateTime birthDate;
    private final String name;
    private final String GREETING;
    private int weight;

    Human(String name, ZonedDateTime birthDate) {

        this.GREETING = "Hello, I'm human.";
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

    public String toString() {
        return this.GREETING + "\n" + "Name: " + this.name;
    }
}
