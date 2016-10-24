package week2.day2.library.dao;

import week2.day2.library.database.LibraryDB;
import week2.day2.library.enums.Genre;
import week2.day2.library.model.Book;
import week2.day2.library.model.PeriodicalIssue;
import week2.day2.library.model.Reader;

import java.util.ArrayList;

/**
 * Created by Дмитрий on 22.10.2016.
 */
public class IssueDAO {


    private LibraryDB db;

    public IssueDAO() {
        db = LibraryDB.getInstance();
    }

    public boolean findIssue(String name, String authorName, int year, Genre genre){

        return db.findIssue(new Book(name,authorName,year,genre));

    }

    public PeriodicalIssue getIssue(String name, String authorName, int year, Genre genre){

        return db.getIssue(new Book(name,authorName,year,genre));

    }

    public ArrayList<PeriodicalIssue> getIssues(){
        return db.getIssues();
    }

    public boolean addIssue(PeriodicalIssue issue) {

        return issue != null && db.addIssue(issue);

    }

    public boolean deleteIssue(PeriodicalIssue issue){

        return issue != null && db.deleteIssue(issue);

    }
}
