package com.example.task05;

public class Task05Main {
    public static void main(String[] args) {
        Point p1 = new Point(1.0, 4.0);
        Point p2 = new Point(3.0, 1.0);
        Point p3 = new Point(4.0, 3.0);

        PolygonalLine line = new PolygonalLine();
        line.addPoint(p1);
        line.addPoint(p2);
        line.addPoint(p3);

        System.out.println("Polygonal Line Length: " + line.getLength());
    }
}
