package collections.arraylist;

import java.util.ArrayList;

public class Array22 {

    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();
        names.add("Mark");
        names.add("Paul");
        names.add("Donald");

        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }
    }
}
