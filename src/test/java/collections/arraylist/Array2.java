package collections.arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Array2 {

    public static void main(String[] args) {

        /*Write a Java program to iterate through all elements in a array list.*/

        List<String> names = new ArrayList<>();

        names.add("James");
        names.add("Robert");
        names.add("Anthony");
        names.add("David");

        Iterator<String> itr = names.iterator();
        while (itr.hasNext()) {
            String element = itr.next();
            {
                System.out.println(element);
            }
        }
    }
}
