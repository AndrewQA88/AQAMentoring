package collections.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Array8 {

    public static void main(String[] args) {

        /*Write a Java program to sort a given array list.*/

        List<String> names = new ArrayList<>();
        names.add("Mark");
        names.add("Paul");
        names.add("Donald");
        names.add("Kenneth");

        //before sorting
        System.out.println(names);

        //after sorting

        Collections.sort(names);
        System.out.println(names);

    }

}
