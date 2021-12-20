package exercises.sortlist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Workman implements Comparable<Workman> {

    int experience;
    int salary;
    int age;

    public Workman(int experience, int salary, int age) {
        this.experience = experience;
        this.salary = salary;
        this.age = age;
    }

    public int getExperience() {
        return experience;
    }

    public int getSalary() {
        return salary;
    }

    public int getAge() {
        return age;
    }

    @Override
    public int compareTo(Workman o) {
        return this.age - o.getAge();
    }

    @Override
    public String toString() {
        return "Workman{" +
                "experience=" + experience +
                ", salary=" + salary +
                ", age=" + age +
                '}';
    }

    public static void main(String[] args) {

        List<Workman> employees = new ArrayList<>();
        employees.add(new Workman(3, 2000, 32));
        employees.add(new Workman(1, 700, 22));
        employees.add(new Workman(6, 10000, 37));
        employees.add(new Workman(7, 3000, 29));

        Collections.sort(employees);
        System.out.println("Comparable: sort by age.");
        System.out.println(employees);

        System.out.println("Comparator: sort by experience.");
        Comparator<Workman> experience = new ExperienceComparator();
        Collections.sort(employees, experience);
        System.out.println(employees);

        System.out.println("Comparator: sort by salary.");
        Comparator<Workman> salary = new SalaryComparator();
        Collections.sort(employees, salary);
        System.out.println(employees);

        System.out.println("Comparator: sort by salary for blacklisted.");
        List<Workman> blacklist = new ArrayList<>();
        blacklist.add(new Workman(3, 2000, 32));
        blacklist.add(new Workman(1, 700, 22));
        blacklist.add(new Workman(6, 10000, 37));
        blacklist.add(new Workman(7, 3000, 29));
        Collections.sort(blacklist, salary);
    }
}
