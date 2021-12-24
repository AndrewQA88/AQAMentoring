package collections.arraylist;

import java.util.ArrayList;
import java.util.List;

public class Array15 {

    public static void main(String[] args) {

        /*Write a Java program to join two array lists.*/

        List<String> names = new ArrayList<>();
        names.add("Mark");
        names.add("Paul");
        names.add("Donald");
        names.add("Kenneth");

        System.out.println(names);

        List<String> names2 = new ArrayList<>();
        names.add("Edward");
        names.add("Ronald");
        names.add("Timothy");
        names.add("Jason");

        names.addAll(names2);
        System.out.println(names);

    }
}
