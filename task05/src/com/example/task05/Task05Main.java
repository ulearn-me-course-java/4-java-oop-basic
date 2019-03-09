package com.example.task05;

public class Task05Main {
    public static void main(String[] args) {
        Point[] points = {
                new Point(0, 0),
                new Point(1, 1),
                new Point(2, 0),
                new Point(3, 3),
                new Point(4, 0),
        };
        PolygonalLine line = new PolygonalLine();
        for (Point p : points) {
            line.addPoint(p);
        }
        System.out.println(line.getLength());
    }
}
