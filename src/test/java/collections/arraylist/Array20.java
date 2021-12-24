package collections.arraylist;

import java.util.ArrayList;

public class Array20 {

    public static void main(String[] args) {

        // Write a Java program to increase the size of an array list.

        ArrayList<String> names = new ArrayList<>();
        names.add("Mark");
        names.add("Paul");
        names.add("Donald");
        names.add("Kenneth");



        //force capacity increase
        names.ensureCapacity(2);
        System.out.println(names.size());
    }
}
