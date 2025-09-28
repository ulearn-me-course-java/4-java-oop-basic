package com.example.task05;

public class Task05Main {
    public static void main(String[] args) {
        PolygonalLine line = new PolygonalLine();
        line.setPoints(new Point[] {
                new Point(1,2),
                new Point(3,1),
                new Point(5,6)
        });
        line.addPoint(7, 1);
        System.out.println("Длина ломаной линии: " + line.getLength());
    }
}
