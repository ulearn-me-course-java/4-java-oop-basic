package com.example.task05;

import java.util.ArrayList;



public class PolygonalLine {

    private ArrayList<Point> points = new ArrayList<Point>();

    public void setPoints(Point[] points) {
        for (Point point : points) {
            this.points.add(new Point(point.getX(), point.getY()));
        }
    }

    public void addPoint(Point point) {
        points.add(new Point(point.getX(), point.getY()));
    }

    public void addPoint(double x, double y) {
        points.add(new Point(x, y));
    }

    public double getLength() {
        double length = 0;
        for (int i = 0; i < points.size() - 1; i++) {
            Point firstPoint = points.get(i);
            Point secondPoint = points.get(i + 1);
            length += secondPoint.getLength(firstPoint);
        }
        return length;
    }
}