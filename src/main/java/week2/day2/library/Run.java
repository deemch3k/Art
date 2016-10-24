package week2.day2.library;

import week2.day2.library.controller.Library;
import week2.day2.library.enums.Genre;
import week2.day2.library.model.Book;
import week2.day2.library.model.PeriodicalIssue;
import week2.day2.library.model.Reader;

/**
 * Created by Дмитрий on 22.10.2016.
 */
public class Run {

    public static void main(String[] args) {

        PeriodicalIssue book = new Book("Idiot","Dostoevskij", 1916, Genre.ACTION);

        Reader reader = new Reader("John");

        Library library = new Library("Vernadskogo");

        library.addReader(reader);
        library.addPeriodicalIssue(book);

    }

}
