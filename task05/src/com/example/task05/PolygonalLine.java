package com.example.task05;

import java.util.Arrays;

public class PolygonalLine {

    private Point[] points;
    private double length;

    public PolygonalLine() {
        points = new Point[0];
    }

    public void setPoints(Point[] points) {
        this.points = new Point[points.length];
        length = 0;
        for (int i = 0; i < points.length; i++) {
            this.points[i] = points[i];
            if (i > 0) {
                length += points[i - 1].getLength(points[i]);
            }
        }
    }

    public void addPoint(Point point) {
        Point[] newPoints = Arrays.copyOf(points, points.length + 1);
        newPoints[points.length] = point;
        setPoints(newPoints);
    }

    public void addPoint(double x, double y) {
        addPoint(new Point(x, y));
    }

    public double getLength() {
        return length;
    }
}