package collections.arraylist;

import java.util.ArrayList;

public class Array17 {

    public static void main(String[] args) {

        //Write a Java program to empty an array list.

        ArrayList<String> names = new ArrayList<>();
        names.add("Mark");
        names.add("Paul");
        names.add("Donald");
        names.add("Kenneth");

        names.clear();
        System.out.println(names);
    }
}
