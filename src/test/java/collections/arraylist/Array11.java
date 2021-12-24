package collections.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Array11 {

    public static void main(String[] args) {

        /*Write a Java program to reverse elements in a array list.*/

        List<String> names = new ArrayList<>();
        names.add("Mark");
        names.add("Paul");
        names.add("Donald");
        names.add("Kenneth");

        Collections.reverse(names);
        System.out.println(names);
    }
}
