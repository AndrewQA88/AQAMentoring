package humanemployeeexercise;

public class Company {

    public void oldAllowance(Employee employee) {
        if (employee.getJobExperience() > 10) {
            employee.setSalary(employee.getSalary() + 500);
        }
    }

    public Employee getAllowance(Employee employee) {
        if (employee.getJobExperience() > 10) {
            employee.setSalary(employee.getSalary() + 500);
        }
        return employee;
    }

    public void Allowance(Object requester) {
        if (requester instanceof Employee) {
            Employee employee = (Employee) requester;
            String jobDescription = employee.getClass().getAnnotation(JobDescription.class).value();
            int salary = employee.getSalary();
            if (employee.getJobExperience() >= 10) {
                employee.setSalary(salary + 500);
                System.out.println("You earn " + (salary + 500) + "$ for " + jobDescription + ".");
            } else if (employee.getJobExperience() < 10) {
                System.out.println("You earn " + salary + "$ for " + jobDescription + ".");
            }
        } else {
            try {
                throw new IncorrectAccessException("Who let the dog in!");
            } catch (IncorrectAccessException e) {
                e.printStackTrace();
            }
        }
    }
}



