package collections.arraylist;

import java.util.ArrayList;

public class Array21 {

    public static void main(String[] args) {
        //replace the second element of a ArrayList with the specified element

        ArrayList<String> names = new ArrayList<>();
        names.add("Mark");
        names.add("Paul");
        names.add("Donald");
        names.add("Kenneth");

        names.add(1, "Jhon");

        System.out.println(names);
    }
}
