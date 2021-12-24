package collections.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Array14 {

    public static void main(String[] args) {

        /*Write a Java program of swap two elements in an array list.*/

        List<String> names = new ArrayList<>();
        names.add("Mark");
        names.add("Paul");
        names.add("Donald");
        names.add("Kenneth");

        //before swap
        System.out.println(names);

        //after swap
        Collections.swap(names, 0, 3);
        System.out.println(names);
    }
}
