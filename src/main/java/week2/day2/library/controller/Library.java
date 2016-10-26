package week2.day2.library.controller;

import javafx.application.Application;
import week2.day2.library.comparators.AuthorPeriodicalIssueComparator;
import week2.day2.library.comparators.NamePeriodicalIssueComparator;
import week2.day2.library.comparators.NameReaderComparator;
import week2.day2.library.comparators.YearPeriodicalIssueComparator;
import week2.day2.library.config.ApplicationContext;
import week2.day2.library.dao.IssueDAO;
import week2.day2.library.dao.ReaderDAO;
import week2.day2.library.database.LibraryDB;
import week2.day2.library.enums.Genre;
import week2.day2.library.exceptions.AuthorIsNullException;
import week2.day2.library.exceptions.IncorrectCriterionSortException;
import week2.day2.library.exceptions.MoreThanMaxAmountOfPeriodicalIssuesException;
import week2.day2.library.exceptions.NameIsNullException;
import week2.day2.library.model.PeriodicalIssue;
import week2.day2.library.model.Reader;

import java.util.ArrayList;
import java.util.Comparator;

/**
 * Created by Дмитрий on 16.10.2016.
 */
public class Library {

    private ApplicationContext context;

    private String name;

    public Library(String name) {

        context = ApplicationContext.getInstance();
        this.name = name;

    }

    public ArrayList<Reader> getReaders() {

        ArrayList<Reader> temp = context.getReaderDAO().getReaders();

        sort(temp,new NameReaderComparator());

        return temp;
    }

    public ArrayList<PeriodicalIssue> getIssues(String criterionSort) throws IncorrectCriterionSortException {

        ArrayList<PeriodicalIssue> temp = context.getIssueDAO().getIssues();

        switch (criterionSort) {
            case "name":
                sort(temp, new NamePeriodicalIssueComparator());
                break;
            case "year":
                sort(temp, new YearPeriodicalIssueComparator());
                break;
            case "author":
                sort(temp, new AuthorPeriodicalIssueComparator());
                break;
            default:
                throw new IncorrectCriterionSortException();
        }

        return temp;
    }

    private void sort(ArrayList list, Comparator comparator) {

        list.sort(comparator);

    }

    public boolean addReader(Reader reader) {
        if (reader == null || context.getReaderDAO().findReader(reader.getName()) || reader.isBlackList()) return false;

        return context.getReaderDAO().addReader(reader);
    }

    public boolean addPeriodicalIssue(PeriodicalIssue issue) {
        if (issue == null) return false;

        return context.getIssueDAO().addIssue(issue);
    }

    public ArrayList<PeriodicalIssue> getAllIssuesThatHaveReaders() {

        ArrayList<PeriodicalIssue> res = new ArrayList<>();

        for (int i = 0; i < context.getReaderDAO().getReaders().size(); i++) {
            res.addAll(context.getReaderDAO().getReaders().get(i).getIssues());
        }

        sort(res, new NamePeriodicalIssueComparator());

        return res;
    }

    public boolean setBlackList(Reader reader) {

        if (reader == null) return false;

        reader.setBlackList(true);
        return true;
    }


    public ArrayList<PeriodicalIssue> getPeriodicalIssuesByAuthor(String authorName) throws AuthorIsNullException {

        if (authorName == null) throw new AuthorIsNullException();

        ArrayList<PeriodicalIssue> res = new ArrayList<>();

        for (PeriodicalIssue issue : context.getIssueDAO().getIssues())
            if (issue.getAuthorName().equals(authorName)) {
                res.add(issue);
            }

        sort(res, new NamePeriodicalIssueComparator());

        return res;
    }

    public ArrayList<PeriodicalIssue> getPeriodicalIssuesByName(String name) throws NameIsNullException {

        if (name == null) throw new NameIsNullException();
        ArrayList<PeriodicalIssue> res = new ArrayList<>();

        for (PeriodicalIssue issue : context.getIssueDAO().getIssues())
            if (issue.getName().equals(name)) {
                res.add(issue);
            }

        sort(res, new AuthorPeriodicalIssueComparator());

        return res;
    }

    public ArrayList<PeriodicalIssue> getPeriodicalIssuesByYear(int year) {

        ArrayList<PeriodicalIssue> res = new ArrayList<>();

        for (PeriodicalIssue issue : context.getIssueDAO().getIssues())
            if (issue.getYear() == year) {
                res.add(issue);
            }

        sort(res, new NamePeriodicalIssueComparator());

        return res;

    }

    public int amountOfReaders() {
        return context.getReaderDAO().getReaders().size();
    }

    public int amountOfPeriodicalIssues() {
        return context.getIssueDAO().getIssues().size();
    }

    public boolean giveIssueToReader(String readerName, String issueName, String author, int year, Genre genre) throws MoreThanMaxAmountOfPeriodicalIssuesException {

        if(!context.getReaderDAO().findReader(readerName)) return false;
        if(!context.getIssueDAO().findIssue(issueName,author,year,genre)) return false;

        Reader reader = context.getReaderDAO().getReader(readerName);

        return reader.addPeriodicalIssue(context.getIssueDAO().getIssue(issueName,author,year,genre));


    }

}
