package com.example.task05;

public class Task05Main {
    public static void main(String[] args) {
        Point p1 = new Point(1, 3);
        Point p2 = new Point(4, 5);
        Point p3 = new Point(2, 7);

        PolygonalLine line = new PolygonalLine();
        line.setPoints(new Point[]{p1, p2, p3});

        System.out.println(line.getLength());
    }
}
