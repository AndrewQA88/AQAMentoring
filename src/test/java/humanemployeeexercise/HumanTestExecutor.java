package humanemployeeexercise;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class HumanTestExecutor {
    public static void main(String[] args) {
        Company company = new Company();
        Employee employee = new Employee("Ben", "operation", ZonedDateTime.of(LocalDate.of(1988, 11, 18), LocalTime.of(7, 30), ZoneId.of("Europe/Helsinki"))
                , ZonedDateTime.of(LocalDate.of(2005, 2, 15), LocalTime.of(9, 0), ZoneId.of("Europe/Helsinki")));

        Human human = new Human("Ben", ZonedDateTime.of(LocalDate.of(1988, 12, 3), LocalTime.of(7, 30), ZoneId.of("Europe/Helsinki")));

        /*System.out.println("Can breath: " + Creature.isBreathable);
        System.out.println(employee);
        System.out.println(human);

        employee.setVacation(2021, 11);

        System.out.println(employee.getVacation());

        long ageOfEmployee = employee.getAgeOfEmployee();
        System.out.println("Age of employee is " + ageOfEmployee + " years.");

        long ageWhenStartedWorking = employee.getAgeWhenStartedWorking();
        System.out.println("Employee started working at " + ageWhenStartedWorking + " years.");

        long experience = employee.getJobExperience();
        System.out.println("Employee has " + experience + " years of experience.");

        employee.setSalary(1000);
        company.allowance(employee);
        company.getAllowance(employee);
        System.out.println("Current salary of employee is " + employee.getSalary() + "$");

        human.getMeaning(); */
    }
}
