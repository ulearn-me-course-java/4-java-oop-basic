package com.example.task05;

public class Task05Main {
    public static void main(String[] args) {
        Point[] points = new Point[] {
                new Point(12, 3),
                new Point(1, 8),
                new Point(9, 0),
                new Point(11, 5),
        };

        PolygonalLine polyLine = new PolygonalLine();
        polyLine.setPoints(points);

        System.out.println(polyLine.toString());

        System.out.println(polyLine.getLength());
    }
}
