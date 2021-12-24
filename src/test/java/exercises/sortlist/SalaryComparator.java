package exercises.sortlist;

import java.util.Comparator;

public class SalaryComparator implements Comparator<Workman> {

    @Override
    public int compare(Workman o1, Workman o2) {
        return o1.getSalary() - o2.getSalary();
    }
}
