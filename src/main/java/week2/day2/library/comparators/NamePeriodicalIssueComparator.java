package week2.day2.library.comparators;

import week2.day2.library.PeriodicalIssue;

import java.util.Comparator;

/**
 * Created by Дмитрий on 16.10.2016.
 */
public class NamePeriodicalIssueComparator implements Comparator<PeriodicalIssue> {
    @Override
    public int compare(PeriodicalIssue o1, PeriodicalIssue o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
