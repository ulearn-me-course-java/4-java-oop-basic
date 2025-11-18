package com.example.task05;

public class Task05Main {
    public static void main(String[] args) {

        PolygonalLine line = new PolygonalLine();
        line.setPoints(new Point[]{
                new Point(2,3),
                new Point(4,4),
                new Point(1,3),
                new Point(7,2)
        });
        line.addPoint(0,5);
        System.out.println("Длина ломаной: " + line.getLength());

    }
}
