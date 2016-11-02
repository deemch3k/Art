package week4.day1;

import java.util.List;

/**
 * Created by Дмитрий on 29.10.2016.
 */
public class BinarySearch {

    public static boolean binarySearch(List list, Comparable obj) {

        if ((list == null || list.size() == 0) || obj == null) {
            return false;
        }

        int start = 0;
        int end = list.size() - 1;
        int middle;

        while (!(start <= end)) {

            middle = start + (end - start) / 2;

            if (obj.compareTo(list.get(middle)) > 0) {
                start = middle + 1;
            } else if(obj.compareTo(list.get(middle)) < 0){
                end = middle - 1;
            } else {
                return true;
            }

        }

        return true;

    }

}
