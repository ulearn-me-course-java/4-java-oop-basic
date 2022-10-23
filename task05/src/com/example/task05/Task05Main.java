package com.example.task05;

public class Task05Main {
    public static void main(String[] args) {
        Point[] points = { new Point(0, 0), new Point(0, 1),
                            new Point( 1, 1), new Point(1, 0)};
        PolygonalLine line = new PolygonalLine();
        line.setPoints(points);

        Point p = new Point(1, 2);
        line.addPoint(p);

        System.out.println(line.getLength());

        System.out.println(line.getLength());
    }
}
