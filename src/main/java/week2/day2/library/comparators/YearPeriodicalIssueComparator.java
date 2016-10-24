package week2.day2.library.comparators;

import week2.day2.library.model.PeriodicalIssue;

import java.util.Comparator;

/**
 * Created by Дмитрий on 17.10.2016.
 */
public class YearPeriodicalIssueComparator implements Comparator<PeriodicalIssue>{
    @Override
    public int compare(PeriodicalIssue o1, PeriodicalIssue o2) {
        return o1.getYear() - o2.getYear();
    }
}
