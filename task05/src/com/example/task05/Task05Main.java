package com.example.task05;

public class Task05Main {
    public static void main(String[] args) {
        Line line = new Line(new Point(10, 20), new Point(11, 21));
        PolygonalLine polygonalLine = new PolygonalLine();
        polygonalLine.addLine(line);
        System.out.println(polygonalLine.getLengths());

        PolygonalLine poligonalLine1 = new PolygonalLine();
        poligonalLine1.addPoint(new Point(10, 20));
        poligonalLine1.addPoint(new Point(11, 21));
        System.out.println(poligonalLine1.getLength());

    }
}

