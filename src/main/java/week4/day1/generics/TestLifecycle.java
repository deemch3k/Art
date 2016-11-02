package week4.day1.generics;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Дмитрий on 29.10.2016.
 */
public class TestLifecycle {

    public static void main(String[] args) {


        _02LifecycleOfGenerics<String> lifecycleOfGenerics = new _02LifecycleOfGenerics();

        List<String> list = new ArrayList<>();

        list.add("1");
        list.add("2");
        list.add("3");

        lifecycleOfGenerics.show(list);

    }

}

