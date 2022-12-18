package com.example.task05;

public class Task05Main {
    public static void main(String[] args) {
        PolygonalLine help = new PolygonalLine();
        Point[] poinnts = new Point[3];
        poinnts[0] = new Point(1, 5);
        poinnts[1] = new Point(3, 5);
        poinnts[2] = new Point(3, 7);
        help.setPoints(poinnts);
        double x = help.getLength();
        System.out.println(help.getLength());
        help.addPoint(9, 7);
        help.addPoint(new Point(9, 9));
        System.out.println(help.getLength());

        Point[] points = {
                new Point(1, 2),
                new Point(4, 6)
        };
        PolygonalLine line = new PolygonalLine();
        for (Point p : points) {
            line.addPoint(p);
        }
    }
}
