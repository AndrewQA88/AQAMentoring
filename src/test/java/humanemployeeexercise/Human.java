package humanemployeeexercise;

import java.time.ZonedDateTime;

public class Human {

    private final ZonedDateTime birthDate;

    Human(ZonedDateTime birthDate) {
        this.birthDate = birthDate;
    }

    public ZonedDateTime getBirthDate() {
        return birthDate;
    }
}
