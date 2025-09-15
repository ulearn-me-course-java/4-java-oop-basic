package com.example.task05;

public class Task05Main {
    public static void main(String[] args) {

        PolygonalLine line = new PolygonalLine();
        line.addPoint(new Point(1, 1));
        line.addPoint(new Point(2, 2));
        line.addPoint(new Point(3, 3));
        line.addPoint(new Point(4, 10));
        line.getLength();
    }
}
