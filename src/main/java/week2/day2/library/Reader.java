package week2.day2.library;

import week2.day2.library.comparators.NamePeriodicalIssueComparator;
import week2.day2.library.exceptions.MoreThanMaxAmountOfPeriodicalIssuesException;

import java.util.ArrayList;

/**
 * Created by Дмитрий on 16.10.2016.
 */
public class Reader {

    private String name;
    private ArrayList<PeriodicalIssue> issues;
    private static final int MAX_AMOUNT_OF_ISSUES = 3;
    private boolean isBlackList = false;


    public Reader(String name) {
        this.name = name;
        issues = new ArrayList<>();
    }

    public ArrayList<PeriodicalIssue> getIssues() {

        issues.sort(new NamePeriodicalIssueComparator());

        return issues;
    }


    public boolean addPeriodicalIssue(PeriodicalIssue issue) throws MoreThanMaxAmountOfPeriodicalIssuesException {

        if (issue == null || isBlackList()) return false;


        if (issues.size() < MAX_AMOUNT_OF_ISSUES) {
            issues.add(issue);
        } else {
            throw new MoreThanMaxAmountOfPeriodicalIssuesException();
        }

        return true;
    }

    public boolean addPeriodicalIssues(ArrayList<PeriodicalIssue> issues) throws MoreThanMaxAmountOfPeriodicalIssuesException {

        if (issues == null || isBlackList()) return false;

        if (issues.size() < MAX_AMOUNT_OF_ISSUES || issues.size() + this.issues.size() < MAX_AMOUNT_OF_ISSUES) {
            this.issues = issues;
        } else {
            throw new MoreThanMaxAmountOfPeriodicalIssuesException();
        }

        return true;

    }

    public int getAmountOfIssues() {
        return issues.size();
    }

    public boolean isBlackList() {
        return isBlackList;
    }

    public void setBlackList(boolean blackList) {
        isBlackList = blackList;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Reader{");
        sb.append("name='").append(name).append('\'');
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Reader reader = (Reader) o;

        return name != null ? name.equals(reader.name) : reader.name == null;

    }

    @Override
    public int hashCode() {
        return name != null ? name.hashCode() : 0;
    }
}
