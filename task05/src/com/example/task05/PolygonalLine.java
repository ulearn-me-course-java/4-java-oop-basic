package com.example.task05;

import java.util.ArrayList;
import java.util.Collections;

public class PolygonalLine {

    private final ArrayList<Point> pointsList;

    public PolygonalLine() {
        pointsList = new ArrayList<Point>();
    }

    public void setPoints(Point[] points) {
        for (Point p : points) {
            addPoint(p);
        }
    }

    public void addPoint(Point point) {
        pointsList.add(new Point(point.getX(), point.getY()));
    }

    public void addPoint(double x, double y) {
        Point p = new Point(x, y);
        pointsList.add(p);
    }

    public double getLength() {
        double lenght = 0;
        for (int i = 0; i < pointsList.size() - 1; i++) {
            Point p1 = pointsList.get(i);
            Point p2 = pointsList.get(i + 1);
            lenght += p1.getLength(p2);
        }

        return lenght;
    }

}
