package week2.day2.library.database;

import week2.day2.library.exceptions.ModelNotFoundException;
import week2.day2.library.model.PeriodicalIssue;
import week2.day2.library.model.Reader;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * Created by Дмитрий on 22.10.2016.
 */
public class LibraryDB {

    private static LibraryDB instance = new LibraryDB();

    private LibraryDB() {
    }


    private static ArrayList<Reader> readers = new ArrayList<>();
    private static ArrayList<PeriodicalIssue> issues = new ArrayList<>();


    public static LibraryDB getInstance() {
        if (instance == null) {
            synchronized (LibraryDB.class) {
                if (instance == null) {
                    instance = new LibraryDB();
                }
            }
        }
        return instance;
    }

    public boolean deleteReader(Reader reader) {

        if(readers.contains(reader)) {
            return readers.remove(reader);
        } else {
            throw new ModelNotFoundException();
        }
    }

    public boolean deleteIssue(PeriodicalIssue issue) {

        if(issues.contains(issue)) {
            return issues.remove(issue);
        } else {
            throw new ModelNotFoundException();
        }

    }

    public boolean addReader(Reader reader) {

        return readers.add(reader);

    }


    public boolean addIssue(PeriodicalIssue issue) {

        return issues.add(issue);

    }

    public boolean findReader(Reader reader) {

        return readers.contains(reader);
    }

    public boolean findIssue(PeriodicalIssue issue) {

        return issues.contains(issue);

    }

    public Reader getReader(Reader reader) {

        for (Reader r : readers) {
            if (r.getName().equals(reader.getName())) {
                return r;
            }
        }
        return null;
    }

    public PeriodicalIssue getIssue(PeriodicalIssue issue) {

        for (PeriodicalIssue i : issues){
            if(i.equals(issue)){
                return i;
            }
        }
        return null;
    }

    public ArrayList<PeriodicalIssue> getIssues() {
        return new ArrayList<>(issues);
    }

    public ArrayList<Reader> getReaders() {
        return new ArrayList<>(readers);
    }

}
