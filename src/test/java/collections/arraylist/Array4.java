package collections.arraylist;

import java.util.ArrayList;
import java.util.List;

public class Array4 {

    public static void main(String[] args) {

        /*Write a Java program to retrieve an element (at a specified index) from a given array list.*/

        List<String> names = new ArrayList<>();
        names.add("Mark");
        names.add("Paul");
        names.add("Donald");
        names.add("Kenneth");

        System.out.println(names.get(2));

    }
}
