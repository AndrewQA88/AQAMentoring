package humanemployeeexercise;

public class Company {

    public void allowance(Employee employee) {
        if (employee.getJobExperience() > 10) {
            employee.setSalary(employee.getSalary() + 500);
        }
    }

    public Employee getAllowance(Employee employee) {
        if (employee.getJobExperience() > 10) {
            employee.setSalary(employee.getSalary() + 500);
        } return employee;
    }
}

