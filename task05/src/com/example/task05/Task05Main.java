package com.example.task05;

import static java.lang.System.out;

public class Task05Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        PolygonalLine polygonalLine = new PolygonalLine();
        polygonalLine.setPoints(new Point[]{new Point(1, 4), new Point(15, 8)});
        out.println(polygonalLine.getLength());
    }
}
