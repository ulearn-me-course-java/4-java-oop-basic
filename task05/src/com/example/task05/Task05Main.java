package com.example.task05;

public class Task05Main {
    public static void main(String[] args) {
        Point p1 = new Point(1,1);
        Point p2 = new Point(2,2);
        Point p3 = new Point(3,3);
        Point[] arr = new Point[]{p1, p2, p3};
        PolygonalLine line = new PolygonalLine();
        line.setPoints(arr);
        System.out.println(line.getLength());
    }
}
