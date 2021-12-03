package collections.arraylist;

import java.util.ArrayList;
import java.util.List;

public class Array12 {

    public static void main(String[] args) {

        /*Write a Java program to extract a portion of a array list.*/

        List<String> names = new ArrayList<>();
        names.add("Mark");
        names.add("Paul");
        names.add("Donald");
        names.add("Kenneth");

        System.out.println(names.subList(1, 3));
    }
}
