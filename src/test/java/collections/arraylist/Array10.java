package collections.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Array10 {

    public static void main(String[] args) {

        /*Write a Java program to shuffle elements in a array list*/

        List<String> names = new ArrayList<>();
        names.add("Mark");
        names.add("Paul");
        names.add("Donald");
        names.add("Kenneth");

        //before shuffle
        System.out.println(names);

        //after shuffle
        Collections.shuffle(names);
        System.out.println(names);
    }
}
