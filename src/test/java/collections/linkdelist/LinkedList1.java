package collections.linkdelist;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedList1 {

    public static void main(String[] args) {

        LinkedList<String> names = new LinkedList<>();
        names.add("Brian");
        names.add("Mark");
        names.add("Donald");
        names.add("Anthony");
        names.add("Brandon");


        System.out.println("1. Write a Java program to append the specified element to the end of a linked list.");
        System.out.println(names);

        System.out.println("2. Write a Java program to iterate through all elements in a linked list.");
        Iterator<String> itr = names.iterator();
        while(itr.hasNext()){
            String element = itr.next();
            System.out.println(element);
        }

        System.out.println("3. Write a Java program to iterate through all elements in a linked list starting at the specified position.");

        for(int i = 2; i < names.size(); i++){
            System.out.println(names.get(i));
        }

        System.out.println("4. Write a Java program to iterate a linked list in reverse order.");

        Iterator<String> itr2 = names.descendingIterator();
        while(itr2.hasNext()){
            String element = itr2.next();
            System.out.println(element);
        }

        System.out.println("5. Write a Java program to insert the specified element at the specified position in the linked list.");
        names.add(2,"Gregory");
        System.out.println(names);

        System.out.println("6. Write a Java program to insert elements into the linked list at the first and last position.");
        names.addFirst("Frank");
        names.addLast("Raymond");
        System.out.println(names);

        System.out.println("7. Write a Java program to insert the specified element at the front of a linked list.");
        names.offerFirst("Patrick");
        System.out.println(names);

        System.out.println("8. Write a Java program to insert the specified element at the end of a linked list.");
        names.offerLast("Jack");
        System.out.println(names);

        System.out.println("9. Write a Java program to insert some elements at the specified position into a linked list.");
        LinkedList<String> names2 = new LinkedList<>();
        names2.add("Andrew");
        names2.add("Peter");
        names.addAll(3, names2);
        System.out.println(names);

        System.out.println("10. Write a Java program to get the first and last occurrence of the specified elements in a linked list.");
        System.out.println(names.getFirst() + " " + names.getLast());
        }
    }

