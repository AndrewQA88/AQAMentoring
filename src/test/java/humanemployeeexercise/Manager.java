package humanemployeeexercise;

import java.time.ZonedDateTime;

@JobDescription(value = "managing")
public class Manager extends Employee {

    public Manager(String name, String title, ZonedDateTime birthDate, ZonedDateTime dateOfEmployment) {
        super(name, title, birthDate, dateOfEmployment);
    }
}
