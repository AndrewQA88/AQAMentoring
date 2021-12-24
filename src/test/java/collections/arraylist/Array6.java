package collections.arraylist;

import java.util.ArrayList;
import java.util.List;

public class Array6 {

    public static void main(String[] args) {

        /*Write a Java program to remove the third element from a array list.*/

        List<String> names = new ArrayList<>();
        names.add("Mark");
        names.add("Paul");
        names.add("Donald");
        names.add("Kenneth");

        //before remove
        System.out.println(names);

        //after remove
        names.remove(2);
        System.out.println(names);
    }
}
