package com.example.task05;

import java.util.Arrays;

/**
 * Ломаная линия
 */
public class PolygonalLine {
    private Point[] points = new Point[1];
    private int countOfPoints = 0;

    public void setPoints(Point[] points) {
        for (Point point : points) {
            addPoint(point);
        }
    }

    public void addPoint(Point point) {
        if (countOfPoints == points.length) {
            Point[] pointsNew = Arrays.copyOf(points, points.length + 1);
            points = pointsNew;
        }
        points[countOfPoints] = new Point(point.getX(), point.getY());
        countOfPoints++;
    }

    public void addPoint(double x, double y) {
        addPoint(new Point(x, y));
    }

    public double getLength() {
        double length = 0;
        for (int i = 1; i < countOfPoints; i++) {
            length += Math.sqrt(Math.pow(points[i].getX() - points[i - 1].getX(), 2) + Math.pow(points[i].getY() - points[i - 1].getY(), 2));
        }
        return length;
    }
}
