package com.example.task05;

public class Task05Main {
    public static void main(String[] args) {
        Point[] points = {
                new Point(1, 2),
                new Point(4, 6)
        };
        points[1] = new Point(10, 20);
        Point point = new Point(13, 6);

        PolygonalLine line = new PolygonalLine();
        line.setPoints(points);
        System.out.println(line.getLength());

        line.addPoint(point);
        System.out.println(line.getLength());

        line.addPoint(3, 5);
        System.out.println(line.getLength());
    }
}
