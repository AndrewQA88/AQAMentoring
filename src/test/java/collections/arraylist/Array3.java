package collections.arraylist;

import java.util.ArrayList;
import java.util.List;

public class Array3 {

    public static void main(String[] args) {

        /*Write a Java program to insert an element into the array list at the first position.*/

        List<String> names = new ArrayList<>();
        names.add("Robert");
        names.add("David");
        names.add("Joseph");
        names.add("Charles");
        names.add(0, "Daniel");

        System.out.println(names);

    }
}
