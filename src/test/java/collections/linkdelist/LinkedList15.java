package collections.linkdelist;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedList15 {
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

        System.out.println("15. Write a Java program of swap two elements in a linked list. ");
        Collections.swap(names,5,1);
        System.out.println(names);

        System.out.println("16. Write a Java program to shuffle the elements in a linked list");
        Collections.shuffle(names);
        System.out.println(names);

        System.out.println("17. Write a Java program to join two linked lists.");
        LinkedList<String> names2 = new LinkedList<>();
        names.add("Jose");
        names.add("Adam");
        names.add("Henry");
        names.add("Nathan");

        names.addAll(names2);
        System.out.println(names);

        System.out.println("18. Write a Java program to clone an linked list to another linked list. ");
        LinkedList<String> names3 = (LinkedList<String>) names.clone();
        System.out.println(names3);

        System.out.println("19. Write a Java program to remove and return the first element of a linked list.");
        System.out.println(names.pop());

        System.out.println("20. Write a Java program to retrieve but does not remove, the first element of a linked list.");
        System.out.println(names.peekFirst());

        System.out.println("21. Write a Java program to retrieve but does not remove, the last element of a linked list.");
        System.out.println(names.peekLast());

        System.out.println("22. Write a Java program to check if a particular element exists in a linked list.");
        System.out.println(names.contains("Adam"));

        System.out.println("23. Write a Java program to convert a linked list to array list.");
        Object[] converted = names.toArray();
        System.out.println(converted[2]);

        System.out.println("24. Write a Java program to compare two linked lists.");
        LinkedList<String> names4 = new LinkedList<>();
        names4.add("Brian");
        System.out.println(names.equals(names4));

        System.out.println("25. Write a Java program to test an linked list is empty or not.");
        System.out.println(names.isEmpty());

        System.out.println("26. Write a Java program to replace an element in a linked list.");
        Collections.replaceAll(names,"Brian", "Ben");
        System.out.println(names);
    }
}
