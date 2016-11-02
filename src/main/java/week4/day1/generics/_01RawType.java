package week4.day1.generics;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Дмитрий on 29.10.2016.
 */
public class _01RawType {

    public static void main(String[] args) {

        List rawType = new ArrayList();
        List<String> list = new ArrayList<>();

        rawType.add(1);
        rawType.add("1");

       // Object o = (String)rawType.get(0);

        list.add("1");

        rawType = list;

        rawType.add(1);

        String s = list.get(1);

        System.out.println(list.size());


    }

}
