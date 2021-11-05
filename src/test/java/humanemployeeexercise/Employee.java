package humanemployeeexercise;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Employee extends Human {

    private final String GREETING;
    private ZonedDateTime dateOfEmployment;
    private int salary;
    private String title;
    private ZonedDateTime vacation;

    Employee(String name, String title, ZonedDateTime birthDate, ZonedDateTime dateOfEmployment) {
        super(name, birthDate);
        this.GREETING = "Hello , I'm employed.";
        this.dateOfEmployment = dateOfEmployment;
        this.title = title;
    }

    public ZonedDateTime getDateOfEmployment() {
        return dateOfEmployment;
    }

    public long ageOfEmployee() {
        long fullYears = ZonedDateTime.now().getYear() - getBirthDate().getYear();
        if ((ZonedDateTime.now().getMonth().getValue() < getBirthDate().getMonth().getValue())
                || (ZonedDateTime.now().getMonth().getValue() == getBirthDate().getMonth().getValue()
                && ZonedDateTime.now().getDayOfMonth() < getBirthDate().getDayOfMonth())) {
            return fullYears - 1;
        } else {
            return fullYears;
        }
    }

    public long ageWhenStartedWorking() {
        long fullYears = getDateOfEmployment().getYear() - getBirthDate().getYear();
        if ((getDateOfEmployment().getMonth().getValue() < getBirthDate().getMonth().getValue())
                || (ZonedDateTime.now().getMonth().getValue() == getBirthDate().getMonth().getValue()
                && ZonedDateTime.now().getDayOfMonth() < getBirthDate().getDayOfMonth())) {
            return fullYears - 1;
        } else {
            return fullYears;
        }
    }

    public long jobExperience() {
        long fullYears = ZonedDateTime.now().getYear() - getDateOfEmployment().getYear();
        if ((ZonedDateTime.now().getMonth().getValue() < getDateOfEmployment().getMonth().getValue())
                || (ZonedDateTime.now().getMonth().getValue() == getBirthDate().getMonth().getValue()
                && ZonedDateTime.now().getDayOfMonth() < getBirthDate().getDayOfMonth())) {
            return (fullYears - 1);
        } else {
            return fullYears;
        }
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String toString() {
        return this.GREETING + "\n" + "Name: " + super.getName() + "\n" + "Title: " + this.title;
    }

    public void setVacation(int year, int month) {
        this.vacation = ZonedDateTime.of(LocalDate.of(year, month, 1), LocalTime.of(0, 0), ZoneId.of("Europe/Helsinki"));
    }

    public void setVacation(int year, int month, int day) {
        this.vacation = ZonedDateTime.of(LocalDate.of(year, month, day), LocalTime.of(0, 0), ZoneId.of("Europe/Helsinki"));
    }

    public ZonedDateTime getVacation() {
        return vacation;
    }
}

