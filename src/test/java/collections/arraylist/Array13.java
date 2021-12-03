package collections.arraylist;

import java.util.ArrayList;
import java.util.List;

public class Array13 {

    public static void main(String[] args) {

        /*Write a Java program to compare two array lists.*/

        List<String> names = new ArrayList<>();
        names.add("Mark");
        names.add("Paul");
        names.add("Donald");
        names.add("Kenneth");

        List<String> names2 = names;

        System.out.println(names.equals(names2));
    }
}
