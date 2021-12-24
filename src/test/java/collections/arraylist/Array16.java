package collections.arraylist;

import java.util.ArrayList;

public class Array16 {

    public static void main(String[] args) {

        //Write a Java program to clone an array list to another array list.

        ArrayList<String> names = new ArrayList<>();
        names.add("Mark");
        names.add("Paul");
        names.add("Donald");
        names.add("Kenneth");

        ArrayList<String> names2 = (ArrayList<String>) names.clone();
        System.out.println(names2);

    }
}
