package humanemployeeexercise;

import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;

public class Employee extends Human {

    private ZonedDateTime dateOfEmployment;

    Employee(ZonedDateTime birthDate, ZonedDateTime dateOfEmployment) {
        super(birthDate);
        this.dateOfEmployment = dateOfEmployment;
    }

    public ZonedDateTime getDateOfEmployment() {
        return dateOfEmployment;
    }

    public long ageOfEmployee(ZonedDateTime birthDate, ZonedDateTime currentDate) {
        return ChronoUnit.YEARS.between(birthDate, currentDate);
    }

    public long ageWhenStartedWorking(ZonedDateTime birthDate, ZonedDateTime hiringDate) {
        return ChronoUnit.YEARS.between(birthDate, hiringDate);
    }

    public long jobExperience(ZonedDateTime hiringDate, ZonedDateTime currentDate) {
        return ChronoUnit.YEARS.between(hiringDate, currentDate);
    }
}
