package week3.day1;

import java.util.ArrayList;

/**
 * Created by Дмитрий on 22.10.2016.
 */
public class TestPoint {

    public static void main(String[] args) {

        ArrayList<Point> points = new ArrayList<>();

        Point point = new Point(2,5);
        ColorPoint cp1 = new ColorPoint(2,5,Colors.RED);
        ColorPoint cp2 = new ColorPoint(2,5,Colors.BLUE);

        points.add(point);

        System.out.println(points.contains(cp1));

        System.out.println(point.equals(cp1));
        System.out.println(cp1.equals(cp2));
        System.out.println(point.equals(cp2));

    }

}
