package com.example.task05;

public class Task05Main {
    public static void main(String[] args) {
        Point[] points = {
                new Point(1, 2),
                new Point(4, 6),
                new Point(8, 9),
                new Point(12, 12),
                new Point(15, 16),
        };
        PolygonalLine line = new PolygonalLine();
        line.setPoints(points);
        System.out.println(line.getLength());
    }
}
