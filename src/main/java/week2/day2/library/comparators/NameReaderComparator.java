package week2.day2.library.comparators;

import week2.day2.library.Reader;

import java.util.Comparator;

/**
 * Created by Дмитрий on 16.10.2016.
 */
public class NameReaderComparator implements Comparator<Reader> {
    @Override
    public int compare(Reader o1, Reader o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
