package exercises.sortlist;

import java.util.ArrayList;
import java.util.List;

public class RemoveAllExercise {

    public static void main(String[] args) {

        List<Integer> digitList1 = new ArrayList<>();
        digitList1.add(1);
        digitList1.add(2);
        digitList1.add(3);
        digitList1.add(4);

        System.out.println("Collection 'digitList1' before removeAll " + digitList1);

        List<Integer> digitList2 = new ArrayList<>();
        digitList2.add(3);
        digitList2.add(2);
        digitList2.add(1);
        digitList2.add(0);

        digitList1.removeAll(digitList2);
        System.out.println("Collection 'digitList1' after removeAll " + digitList1);

    }
}
