package com.example.task05;

public class Task05Main {
    public static void main(String[] args) {
        PolygonalLine line = new PolygonalLine();

        line.addPoint(new Point(1, 2));
        line.addPoint(4, 6);
        line.addPoint(new Point(8, 9));

        System.out.println("Длина ломаной: " + line.getLength());

        Point[] points = {
                new Point(0, 0),
                new Point(3, 4),
                new Point(6, 8)
        };
        line.setPoints(points);
        System.out.println("Новая длина ломаной: " + line.getLength());
    }
}