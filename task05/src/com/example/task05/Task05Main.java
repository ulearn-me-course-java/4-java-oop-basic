package com.example.task05;

public class Task05Main {
    public static void main(String[] args) {
        Point[] points = new Point[]{
                new Point(1,1),
                new Point(4,5),
                new Point(0, 1)
        };
        PolygonalLine line = new PolygonalLine();
        line.setPoints(points);
        System.out.println(line.getLength());
    }
}
