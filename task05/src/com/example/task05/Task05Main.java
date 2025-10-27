package com.example.task05;

public class Task05Main {
    public static void main(String[] args) {
        Point[] points = {
                new Point(1,4),
                new Point(2,3),
                new Point(3,5)
        };

        PolygonalLine line = new PolygonalLine();
        line.setPoints(points);

        System.out.println(line.getLength());
        line.addPoint(new Point(4,6));
        System.out.println(line.getLength());
    }
}
