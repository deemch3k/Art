package week4.day1.products;

import java.util.List;

/**
 * Created by Дмитрий on 29.10.2016.
 */
public class Utils {

    public static <T extends Product>boolean find(List<T> list, T product ){

        return false;

    }

    public static void copy(List<? extends Product> src, List<? super Product> dest){

        dest.addAll(src);

    }

}
