package com.example.task05;

public class Task05Main {
    public static void main(String[] args) {
        PolygonalLine line = new PolygonalLine();
        line.addPoint(new Point(0, 0));
        line.addPoint(new Point(3.5, 4));
        line.addPoint(6, 8);
        
        System.out.println("Длина ломаной линии: " + line.getLength());
    }
}
