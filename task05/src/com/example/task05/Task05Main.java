package com.example.task05;

public class Task05Main {
    public static void main(String[] args) {
        Point[] points = new Point[]{
                new Point(1,2),
                new Point(2,3),
                new Point(3, 4)
        };
        PolygonalLine line = new PolygonalLine();
        line.setPoints(points);
        System.out.println(line.getLength());
    }
}
