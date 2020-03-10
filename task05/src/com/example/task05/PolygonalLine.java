package com.example.task05;

import java.util.ArrayList;

public class PolygonalLine {

    private ArrayList<Point> points = new ArrayList<>();

    public void setPoints(Point[] points) {
        for (Point p : points)
            addPoint(p);
    }

    public void addPoint(Point point) {
        points.add(new Point(point.getX(), point.getY()));
    }

    public void addPoint(double x, double y) {
        points.add(new Point(x,y));
    }

    public double getLength() {
        double length = 0;
        Point previous = null;
        for (Point p : points) {
            if (previous != null)
                length += previous.getLength(p);
            previous = p;

        }
        return length;
    }

}
