package collections.arraylist;

import java.util.ArrayList;

public class Array18 {

    //Write a Java program to test an array list is empty or not.

    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();
        names.add("Mark");
        names.add("Paul");
        names.add("Donald");
        names.add("Kenneth");

        System.out.println(names.isEmpty());
    }
}
