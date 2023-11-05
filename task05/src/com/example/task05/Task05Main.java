package com.example.task05;

public class Task05Main {
    public static void main(String[] args) {
        Point p1 = new Point(2, 10);
        Point p2 = new Point(-1, 7);
        Point p3 = new Point(5, 3);

        PolygonalLine polyGone = new PolygonalLine();
        polyGone.addPoint(p1);
        polyGone.addPoint(p2);
        polyGone.addPoint(p3);
        polyGone.addPoint(new Point(1, 0));
        System.out.println(polyGone);
    }
}
