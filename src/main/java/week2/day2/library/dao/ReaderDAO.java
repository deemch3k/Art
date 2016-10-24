package week2.day2.library.dao;

import week2.day2.library.database.LibraryDB;
import week2.day2.library.model.Reader;

import java.util.ArrayList;

/**
 * Created by Дмитрий on 22.10.2016.
 */
public class ReaderDAO {

    private LibraryDB db;

    public ReaderDAO() {
        db = LibraryDB.getInstance();
    }

    public boolean findReader(String name) {

        return db.findReader(new Reader(name));

    }

    public Reader getReader(String name) {

        return db.getReader(new Reader(name));

    }

    public ArrayList<Reader> getReaders() {
        return db.getReaders();
    }

    public boolean addReader(Reader reader) {
        return db.addReader(reader);
    }

    public boolean deleteReader(Reader reader) {

        return reader != null && db.deleteReader(reader);

    }

}
