package humanemployeeexercise;


public class Company {

    public Employee getAllowance(Employee employee) {
        if (employee.getJobExperience() > 10) {
            employee.setSalary(employee.getSalary() + 500);
        }
        return employee;
    }

    public void allowance(Object requester) {
        if (requester instanceof Employee) {
            Employee employee = (Employee) requester;
            int salary = employee.getSalary();
            String jobDescription = requester.getClass().getAnnotation(JobDescription.class).value();
            if (employee.getJobExperience() >= 10) {
                employee.setSalary(salary + 500);
                System.out.println("You earn " + (salary + 500) + "$ for " + jobDescription + ".");
            } else if (employee.getJobExperience() < 10) {
                System.out.println("You earn " + salary + "$ for " + jobDescription + ".");
            }
        } else {
            if (requester.getClass().isAnnotationPresent(JobDescription.class)) {
                try {
                    throw new IncorrectAccessException("Salary rise is declined. Job description '"
                            + requester.getClass().getAnnotation(JobDescription.class).value() + "' is not appropriate.");
                } catch (IncorrectAccessException e) {
                    e.printStackTrace();
                }
            } else {
                try {
                    throw new IncorrectAccessException("Salary rise is declined. Job description is not present");
                } catch (IncorrectAccessException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}



