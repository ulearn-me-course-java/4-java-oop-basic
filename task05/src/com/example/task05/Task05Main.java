package com.example.task05;

public class Task05Main {
    public static void main(String[] args) {
        Point p1 = new Point(1, 0);
        Point p2 = new Point(3, 0);
        Point p3 = new Point(5, 0);

        PolygonalLine polygonalLine = new PolygonalLine();

        polygonalLine.setPoints(new  Point[]{p1, p2, p3});
        System.out.println(polygonalLine.getLength());


    }
}
