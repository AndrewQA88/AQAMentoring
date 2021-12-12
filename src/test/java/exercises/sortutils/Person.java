package exercises.sortutils;

import java.util.TreeSet;

public class Person implements Comparable<Person> {

    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public int compareTo(Person o) {
        return name.compareTo(o.getName());
    }

    public static void main(String[] args) {

        TreeSet<Person> people = new TreeSet<>();
        people.add(new Person("Tom", 11));
        people.add(new Person("Tom", 13));
        System.out.println();
    }


}
