package com.example.task05;

public class Task05Main {
    public static void main(String[] args) {
        Point[] points = {
                new Point(0,0),
                new Point (2,3),
                new Point(8,9),
                new Point(10,5),
                new Point(25,12)
        };

        PolygonalLine line = new PolygonalLine(points);
        for (int i = 0; i < points.length; i++) {
            line.addPoint(points[i]);
        }
        double len = line.getLength();
        System.out.println(len);


    }
}
