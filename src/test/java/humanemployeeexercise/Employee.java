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

    public long getCalculationOfFullYears(ZonedDateTime firstDate, ZonedDateTime secondDate) {
        long fullYears = firstDate.getYear() - secondDate.getYear();
        if ((firstDate.getMonth().getValue() < secondDate.getMonth().getValue())
                || (firstDate.getMonth().getValue() == secondDate.getMonth().getValue() && firstDate.getDayOfMonth() < secondDate.getDayOfMonth())) {
            return fullYears - 1;
        } else {
            return fullYears;
        }
    }

    public long getAgeOfEmployee() {
        ZonedDateTime currentDate = ZonedDateTime.now();
        return getCalculationOfFullYears(currentDate, getBirthDate());
    }

    public long getAgeWhenStartedWorking() {
        return getCalculationOfFullYears(dateOfEmployment, getBirthDate());
    }

    public long getJobExperience() {
        ZonedDateTime currentDate = ZonedDateTime.now();
        return getCalculationOfFullYears(currentDate, dateOfEmployment);
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Name: " + super.getName() + "\n" + this.GREETING + "\n" + "Title: " + this.title + "\n" + "Day of employment: " + this.dateOfEmployment
                + "\n" + "Salary: " + this.salary + "\n" + "Vacation: " + this.vacation;
    }

    public void setVacation(int year, int month) {
        setVacation(year, month, 1);
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

