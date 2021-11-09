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

    public long calculateFullYear(ZonedDateTime firstDate, ZonedDateTime secondDate) {
        long fullYears = firstDate.getYear() - secondDate.getYear();
        if ((firstDate.getMonth().getValue() < secondDate.getMonth().getValue())
                || (firstDate.getMonth().getValue() == secondDate.getMonth().getValue() && firstDate.getDayOfMonth() < secondDate.getDayOfMonth())) {
            return fullYears - 1;
        } else {
            return fullYears;
        }
    }

    public long ageOfEmployee() {
        ZonedDateTime currentDate = ZonedDateTime.now();
        return calculateFullYear(currentDate, getBirthDate());
    }

    public long ageWhenStartedWorking() {
        return calculateFullYear(getDateOfEmployment(), getBirthDate());
    }

    public long jobExperience() {
        ZonedDateTime currentDate = ZonedDateTime.now();
        return calculateFullYear(currentDate, getDateOfEmployment());
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

    @Override
    public String voice() {
        return "hey";
    }
}

