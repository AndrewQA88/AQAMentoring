package collections.hashsets;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class HashSet1 {

    public static void main(String[] args) {

        System.out.println("1.Write a Java program to append the specified element to the end of a hash set.");
        HashSet<String> names = new HashSet<>();
        names.add("Brian");
        names.add("Mark");
        names.add("Donald");
        names.add("Anthony");
        names.add("Brandon");
        System.out.println(names);

        System.out.println("2.Write a Java program to iterate through all elements in a hash list.");
        Iterator<String> itr = names.iterator();
        while (itr.hasNext()) {
            String element = itr.next();
            System.out.println(element);
        }

        System.out.println("3.Write a Java program to get the number of elements in a hash set.");
        System.out.println("The size od set " + names.size());

        System.out.println("4.Write a Java program to empty an hash set.");
        names.clear();
        System.out.println("The size after clean " + names.size());

        System.out.println("5. Write a Java program to test a hash set is empty or not.");
        System.out.println(names.isEmpty());

        System.out.println("6. Write a Java program to clone a hash set to another hash set.");
        HashSet<String> names1 = new HashSet<>();
        names1.add("Brian");
        names1.add("Mark");

        names = (HashSet<String>) names1.clone();
        System.out.println(names);

        System.out.println("7. Write a Java program to convert a hash set to an array.");
        Object[] names2 = names1.toArray();
        System.out.println(names2[1]);

        System.out.println("8. Write a Java program to convert a hash set to a tree set.");
        TreeSet<String> names4 = new TreeSet<>(names1);

        System.out.println("9. Write a Java program to convert a hash set to a List/ArrayList.");
        ArrayList<String> names5 = new ArrayList<>(names1);

        System.out.println("10. Write a Java program to compare two hash set.");
        System.out.println(names.equals(names1));

        System.out.println("11. Write a Java program to compare two sets and retain elements which are same on both sets.");
        names.retainAll(names1);
        System.out.println(names);

        System.out.println("12. Write a Java program to remove all of the elements from a hash set");
        names.clear();
        System.out.println(names.size());
    }
}
