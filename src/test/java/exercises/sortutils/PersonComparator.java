package exercises.sortutils;

import java.util.Comparator;
import java.util.TreeSet;

public class PersonComparator implements Comparator<Person> {

    @Override
    public int compare(Person a, Person b) {
        if(a.getAge()>b.getAge())
            return 1;
        else if (a.getAge()<b.getAge())
            return -1;
        else
            return 0;
    }

    public static void main(String[] args) {
        PersonComparator personComparator = new PersonComparator();
        TreeSet<Person> personTreeSet = new TreeSet<Person>(personComparator);
        personTreeSet.add(new Person("Ben", 11));
        personTreeSet.add(new Person("Tom", 21));
        personTreeSet.add(new Person("Dilan", 9));

        for (Person p : personTreeSet) {
            System.out.println(p.getName());
        }
    }
}
