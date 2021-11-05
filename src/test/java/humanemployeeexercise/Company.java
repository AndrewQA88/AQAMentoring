package humanemployeeexercise;

public class Company {

    public void allowance(Employee employee) {
        if (employee.jobExperience() > 10) {
            employee.setSalary(employee.getSalary() + 500);
        }
    }
}

