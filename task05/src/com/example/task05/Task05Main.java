package com.example.task05;

public class Task05Main {
    public static void main(String[] args) {
        Point p1 = new Point(0,0);
        Point p2 = new Point(0,10);
        Point p3 = new Point(10,10);
        PolygonalLine pl = new PolygonalLine();
        pl.setPoints(p1,p2,p3);
        pl.addPoint(10,15);
        System.out.println(pl.getLength());
    }
}
