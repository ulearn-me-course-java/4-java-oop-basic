package com.example.task05;

public class Task05Main {
    public static void main(String[] args) {
        PolygonalLine line = new PolygonalLine();
        Point[] points = new Point[]{
                new Point(0, 0),
                new Point(2, 0),
                new Point(2, 2)
        };
        line.setPoints(points);
        line.addPoint(4, 2);
        System.out.println(line.getLength());
    }
}
