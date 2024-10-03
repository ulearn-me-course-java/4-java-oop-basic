package com.example.task05;

public class Task05Main {
    public static void main(String[] args) {
        Point point1 = new Point(1.0, 2.0);
        Point point2 = new Point(4.0, 6.0);
        Point point3 = new Point(7.0, 1.0);

        PolygonalLine polygonalLine = new PolygonalLine();

        polygonalLine.addPoint(point1);
        polygonalLine.addPoint(point2);
        polygonalLine.addPoint(point3);

        System.out.println("Длина ломаной линии: " + polygonalLine.getLength());

        polygonalLine.addPoint(10.0, 5.0);

        System.out.println("Обновленная длина ломаной линии: " + polygonalLine.getLength());
    }
}
