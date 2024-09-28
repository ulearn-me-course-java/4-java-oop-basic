package com.example.task05;

public class Task05Main {
    public static void main(String[] args) {
        PolygonalLine line = new PolygonalLine();
        line.addPoint(10, 10);
        line.addPoint(12, 12);
        System.out.println(line.getLength());
    }
}
