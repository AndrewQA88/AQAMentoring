package collections.linkdelist;

import java.util.LinkedList;

public class LinkedList11 {

    public static void main(String[] args) {

        LinkedList<String> names = new LinkedList<>();
        names.add("Brian");
        names.add("Mark");
        names.add("Donald");
        names.add("Anthony");
        names.add("Brandon");
        names.add("Dennis");
        names.add("Jerry");
        names.add("Aaron");

        System.out.println("11. Write a Java program to display the elements and their positions in a linked list." );
        for(int i = 0; i < names.size(); i++){
            System.out.println("The index of element is " + i + " : " + names.get(i));
        }

        System.out.println("12. Write a Java program to remove a specified element from a linked list. ");
        names.remove("Mark");
        System.out.println(names);

        System.out.println("13. Write a Java program to remove first and last element from a linked list.");
        names.removeFirst();
        names.removeLast();
        System.out.println(names);

        System.out.println("14. Write a Java program to remove all the elements from a linked list.");
        names.clear();
        System.out.println(names);
    }
}
