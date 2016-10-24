package week2.day2.library.model;

import week2.day2.library.enums.Genre;

/**
 * Created by Дмитрий on 16.10.2016.
 */
public class Journal extends PeriodicalIssue {


    public Journal(String name, String authorName, int year, Genre genre) {
        super(name, authorName, year, genre);
    }
}
