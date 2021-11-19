package humanemployeeexercise;

import java.time.ZonedDateTime;

@JobDescription(value = "development")
public class Developer extends Employee {

    public Developer(String name, String title, ZonedDateTime birthDate, ZonedDateTime dateOfEmployment) {
        super(name, title, birthDate, dateOfEmployment);
    }
}
