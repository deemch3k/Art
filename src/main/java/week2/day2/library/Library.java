package week2.day2.library;

import week2.day2.library.comparators.AuthorPeriodicalIssueComparator;
import week2.day2.library.comparators.NamePeriodicalIssueComparator;
import week2.day2.library.comparators.NameReaderComparator;
import week2.day2.library.comparators.YearPeriodicalIssueComparator;
import week2.day2.library.exceptions.AuthorIsNullException;
import week2.day2.library.exceptions.IncorrectCriterionSortException;
import week2.day2.library.exceptions.NameIsNullException;

import java.util.ArrayList;

/**
 * Created by Дмитрий on 16.10.2016.
 */
public class Library {

    private String name;
    private ArrayList<Reader> readers;
    private ArrayList<PeriodicalIssue> issues;

    public Library(String name) {
        this.name = name;
        readers = new ArrayList<>();
        issues = new ArrayList<>();
    }

    public ArrayList<Reader> getReaders() {
        sortByNameReaders();
        return readers;
    }

    public ArrayList<PeriodicalIssue> getIssues(String criterionSort) throws IncorrectCriterionSortException {

        switch (criterionSort) {
            case "name":
                sortByNameIssues(issues);
                break;
            case "year":
                sortByYear(issues);
                break;
            case "author":
                sortByAuthor(issues);
                break;
            default:
                throw new IncorrectCriterionSortException();
        }

        return issues;
    }

    private void sortByAuthor(ArrayList<PeriodicalIssue> issues) {
        issues.sort(new AuthorPeriodicalIssueComparator());
    }

    private void sortByYear(ArrayList<PeriodicalIssue> issues) {
        issues.sort(new YearPeriodicalIssueComparator());
    }

    private void sortByNameIssues(ArrayList<PeriodicalIssue> issues) {
        issues.sort(new NamePeriodicalIssueComparator());
    }

    public boolean addReader(Reader reader) {
        if (reader == null || reader.isBlackList()) return false;

        return readers.add(reader);
    }

    public boolean addPeriodicalIssue(PeriodicalIssue issue) {
        if (issue == null) return false;

        return issues.add(issue);
    }

    private void sortByNameReaders() {
        readers.sort(new NameReaderComparator());
    }

    public ArrayList<PeriodicalIssue> getAllIssuesThatHaveReaders() {

        ArrayList<PeriodicalIssue> res = new ArrayList<>();

        for (int i = 0; i < readers.size(); i++) {
            res.addAll(readers.get(i).getIssues());
        }

        sortByNameIssues(res);

        return res;
    }

    public boolean setBlackList(Reader reader) {
        reader.setBlackList(true);
        return true;
    }


    public ArrayList<PeriodicalIssue> getPeriodicalIssuesByAuthor(String authorName) throws AuthorIsNullException {

        if (authorName == null) throw new AuthorIsNullException();

        ArrayList<PeriodicalIssue> res = new ArrayList<>();

        for (PeriodicalIssue issue : issues)
            if (issue.getAuthorName().equals(authorName)) {
                res.add(issue);
            }

        sortByNameIssues(res);

        return res;
    }

    public ArrayList<PeriodicalIssue> getPeriodicalIssuesByName(String name) throws NameIsNullException {

        if (name == null) throw new NameIsNullException();
        ArrayList<PeriodicalIssue> res = new ArrayList<>();

        for (PeriodicalIssue issue : issues)
            if (issue.getName().equals(name)) {
                res.add(issue);
            }

        sortByAuthor(res);

        return res;
    }

    public ArrayList<PeriodicalIssue> getPeriodicalIssuesByYear(int year) {

        ArrayList<PeriodicalIssue> res = new ArrayList<>();

        for (PeriodicalIssue issue : issues)
            if (issue.getYear() == year) {
                res.add(issue);
            }

        sortByNameIssues(res);

        return res;

    }

    public int amountOfReaders() {
        return readers.size();
    }

    public int amountOfPeriodicalIssues() {
        return issues.size();
    }


}
