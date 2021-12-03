package collections.arraylist;

import java.util.ArrayList;
import java.util.List;

public class Array1 {

    /*Write a Java program to create a new array list, add some colors (string) and print out the collection.*/
    public static void main(String[] args) {

        List<String> colors = new ArrayList<>();

        colors.add("white");
        colors.add("black");
        colors.add("white");

        System.out.println(colors);

    }
}
