package collections.arraylist;

import java.util.ArrayList;
import java.util.List;

public class Array5 {

    public static void main(String[] args) {

        /*Write a Java program to update specific array element by given element.*/

        List<String> names = new ArrayList<>();
        names.add("Mark");
        names.add("Paul");
        names.add("Donald");
        names.add("Kenneth");

        //before update
        System.out.println(names);

        names.set(2, "Andrew");

        //after update
        System.out.println(names);


    }
}
