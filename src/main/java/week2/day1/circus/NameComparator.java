package week2.day1.circus;

import java.util.Comparator;

/**
 * Created by Дмитрий on 16.10.2016.
 */
public class NameComparator implements Comparator<Artist> {

    @Override
    public int compare(Artist o1, Artist o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
