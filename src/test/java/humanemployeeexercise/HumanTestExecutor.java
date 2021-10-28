package humanemployeeexercise;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class HumanTestExecutor {
    public static void main(String[] args) {
        Employee employee = new Employee(ZonedDateTime.of(LocalDate.of(1988, 7, 15), LocalTime.of(7, 30), ZoneId.of("Europe/Helsinki"))
                , ZonedDateTime.of(LocalDate.of(2015, 2, 13), LocalTime.of(9, 0), ZoneId.of("Europe/Helsinki")));
        ZonedDateTime currentDate = ZonedDateTime.now();
        ZonedDateTime birthDate = employee.getBirthDate();
        ZonedDateTime dateOfEmployment = employee.getDateOfEmployment();
        long ageOfEmployee = employee.ageOfEmployee(birthDate, currentDate);
        System.out.println("Age of employee is " + ageOfEmployee + " years.");
        long ageWhenStartedWorking = employee.ageWhenStartedWorking(birthDate, dateOfEmployment);
        System.out.println("Employee started working at " + ageWhenStartedWorking + " years.");
        long experience = employee.jobExperience(dateOfEmployment, currentDate);
        System.out.println("Employee has " + experience + " years of experience.");
    }
}
