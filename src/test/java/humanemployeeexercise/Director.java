package humanemployeeexercise;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Director extends Employee {

    int salary;


    public int getSalary(Human human) {
        if (human instanceof Director) {
            return salary;
        } else {
            try {
                throw new IncorrectAccessException("access denied");
            } catch (IncorrectAccessException e) {
                e.printStackTrace();
            }
        }
        return -1;
    }

    @Override
    public void setSalary(int salary) {
        this.salary = salary;
    }

    Director(String name, String title, ZonedDateTime birthDate, ZonedDateTime dateOfEmployment) {
        super(name, title, birthDate, dateOfEmployment);
    }

    public static void main(String[] args) {

        Director director = new Director("Employee", "employee", ZonedDateTime.of(LocalDate.of(1988, 11, 18), LocalTime.of(7, 30), ZoneId.of("Europe/Helsinki"))
                , ZonedDateTime.of(LocalDate.of(2005, 2, 15), LocalTime.of(9, 0), ZoneId.of("Europe/Helsinki")));

        Employee employee = new Employee("Employee", "employee", ZonedDateTime.of(LocalDate.of(1988, 11, 18), LocalTime.of(7, 30), ZoneId.of("Europe/Helsinki"))
                , ZonedDateTime.of(LocalDate.of(2005, 2, 15), LocalTime.of(9, 0), ZoneId.of("Europe/Helsinki")));

        director.setSalary(1000);
        employee.setSalary(100);
        System.out.println(director.getSalary(employee));
    }
}