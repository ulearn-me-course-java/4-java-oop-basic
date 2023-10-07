package com.example.task05;

import java.lang.reflect.Array;

public class PolygonalLine {
    private Point[] points = new Point[0];

    public void setPoints(Point[] points) {
        this.points = cloneArray(points);
    }

    private Point[] cloneArray(Point[] points) {
        Point[] newPoints = points.clone();
        for (int i = 0; i < points.length; i++) {
            newPoints[i] = points[i].clone();
        }
        return newPoints;
    }

    public void addPoint(Point point) {
        if (points.length == 0) {
            points = new Point[]{point.clone()};
            return;
        }

        Point[] oldArray = points.clone();
        int length = points.length;
        points = new Point[length + 1];

        for (int i = 0; i < length; i++) {
            points[i] = oldArray[i];
        }

        points[length] = point.clone();
    }

    public void addPoint(double x, double y) {
        addPoint(new Point(x, y));
    }

    public double getLength() {
        double length = 0;
        for (int i = 0; i < points.length - 1; i++) {
            length += points[i].getLength(points[i + 1]);
        }
        return length;
    }

}
