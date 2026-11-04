package com.example.task05;

public class Task05Main {
    public static void main(String[] args) {

        PolygonalLine line = new PolygonalLine();

        line.addPoint(1, 2);
        line.addPoint(4, 6);
        line.addPoint(8, 9);
        line.addPoint(12, 12);
        line.addPoint(15, 16);

        System.out.println("Длина ломаной: " + line.getLength());

        Point[] points = {
                new Point(1, 2),
                new Point(4, 6),
                new Point(8, 9)
        };

        line.setPoints(points);

        System.out.println("Новая длина ломаной: " + line.getLength());
    }
}