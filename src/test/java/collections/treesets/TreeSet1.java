package collections.treesets;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSet1 {

    public static void main(String[] args) {

        System.out.println("1. Write a Java program to create a new tree set, add some colors (string) and print out the tree set.");
        TreeSet<String> names = new TreeSet<>();
        names.add("Brian");
        names.add("Mark");
        names.add("Donald");
        names.add("Anthony");
        names.add("Brandon");
        System.out.println(names);

        System.out.println("2. Write a Java program to iterate through all elements in a tree set.");
        Iterator<String> itr = names.iterator();
        while (itr.hasNext()) {
            String element = itr.next();
            System.out.println(element);
        }

        System.out.println("3. Write a Java program to add all the elements of a specified tree set to another tree set.");
        TreeSet<String> names1 = new TreeSet<>();
        names1 = (TreeSet<String>) names.clone();
        System.out.println(names1);

        System.out.println("4. Write a Java program to create a reverse order view of the elements contained in a given tree set.");
        itr = names.descendingIterator();
        while (itr.hasNext()) {
            String element = itr.next();
            System.out.println(element);
        }

        System.out.println("5.  Write a Java program to get the first and last elements in a tree set.");
        System.out.println(names.first());
        System.out.println(names.last());

        System.out.println("6. Write a Java program to clone a tree set list to another tree set.");
        names.addAll(names1);

        System.out.println("7. Write a Java program to get the number of elements in a tree set. ");
        System.out.println(names.size());

        System.out.println("8. Write a Java program to compare two tree sets.");
        System.out.println(names.equals(names1));

        System.out.println("9. Write a Java program to find the numbers less than 3 in a tree set.");
        TreeSet<Integer> numbers = new TreeSet<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);

        TreeSet numbers2 = new TreeSet();
        numbers2 = (TreeSet) numbers.headSet(4);
        System.out.println(numbers2);

        System.out.println("10. Write a Java program to get the element in a tree set which is greater than or equal to the given element.");
        System.out.println(numbers.higher(3));
        System.out.println(numbers.floor(3));

        System.out.println("11. Write a Java program to get the element in a tree set which is less than or equal to the given element.");
        System.out.println(numbers.lower(3));
        System.out.println(numbers.floor(3));

        System.out.println("12. Write a Java program to get the element in a tree set which is strictly greater than or equal to the given element.");
        System.out.println(numbers.higher(3));

        System.out.println("13. Write a Java program to get an element in a tree set which is strictly less than the given element.");
        System.out.println(numbers.lower(3));

        System.out.println("14. Write a Java program to retrieve and remove the first element of a tree set.");
        System.out.println(names.pollFirst());

        System.out.println("15. Write a Java program to retrieve and remove the last element of a tree set.");
        System.out.println(names.pollLast());

        System.out.println("16. Write a Java program to remove a given element from a tree set. ");
        names.remove("Donald");

    }
}


