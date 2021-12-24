package exercises.sortlist;

import java.util.Comparator;

public class ExperienceComparator implements Comparator<Workman> {

    @Override
    public int compare(Workman o1, Workman o2) {
        return o1.getExperience() - o2.getExperience();
    }
}
