package com.example.task05;

import java.util.ArrayList;

public class PolygonalLine {
    private ArrayList<Point> line = new ArrayList<Point>();

    public void setPoints(Point[] points) {
        for (Point point : points) {
            addPoint(point);
        }
    }

    public void addPoint(Point point) {
        line.add(new Point(point.getX(), point.getY()));
    }

    public void addPoint(double x, double y) {
        line.add(new Point(x, y));
    }

    public double getLength() {
        double length = 0;
        for (int i = 0; i < line.size() - 1; i++) {
            Point first = line.get(i);
            Point second = line.get(i+1);
            length += first.getLength(second);
        }
        return length;
    }

}
