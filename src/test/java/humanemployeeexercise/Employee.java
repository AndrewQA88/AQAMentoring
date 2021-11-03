package humanemployeeexercise;

import java.time.ZonedDateTime;

public class Employee extends Human {

    private ZonedDateTime dateOfEmployment;

    Employee(ZonedDateTime birthDate, ZonedDateTime dateOfEmployment) {
        super(birthDate);
        this.dateOfEmployment = dateOfEmployment;
    }

    public ZonedDateTime getDateOfEmployment() {
        return dateOfEmployment;
    }

    public long ageOfEmployee() {
        if (ZonedDateTime.now().getMonth().getValue() == getBirthDate().getMonth().getValue()
                && ZonedDateTime.now().getDayOfMonth() < getBirthDate().getDayOfMonth()) {
            return ZonedDateTime.now().getYear() - getBirthDate().getYear() - 1;
        } else if (ZonedDateTime.now().getMonth().getValue() < getBirthDate().getMonth().getValue()) {
            return (ZonedDateTime.now().getYear() - getBirthDate().getYear()) - 1;
        } else {
            return ZonedDateTime.now().getYear() - getBirthDate().getYear();
        }
    }

    public long ageWhenStartedWorking() {
        if (getDateOfEmployment().getMonth().getValue() == getBirthDate().getMonth().getValue()
                && getDateOfEmployment().getDayOfMonth() < getBirthDate().getDayOfMonth()) {
            return (getDateOfEmployment().getYear() - getBirthDate().getYear()) - 1;
        } else if (getDateOfEmployment().getMonth().getValue() < getBirthDate().getMonth().getValue()) {
            return (getDateOfEmployment().getYear() - getBirthDate().getYear()) - 1;
        } else {
            return getDateOfEmployment().getYear() - getBirthDate().getYear();
        }
    }

    public long jobExperience() {
        if (ZonedDateTime.now().getMonth().getValue() == getDateOfEmployment().getMonth().getValue()
                && ZonedDateTime.now().getDayOfMonth() < getDateOfEmployment().getDayOfMonth()) {
            return (ZonedDateTime.now().getYear() - getDateOfEmployment().getYear() - 1);
        } else if (ZonedDateTime.now().getMonth().getValue() < getDateOfEmployment().getMonth().getValue()) {
            return (ZonedDateTime.now().getYear() - getDateOfEmployment().getYear() - 1);
        } else {
            return ZonedDateTime.now().getYear() - getDateOfEmployment().getYear();
        }
    }
}
