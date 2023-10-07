package com.example.task05;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Ломаная линия
 */
public class PolygonalLine {
    private Point[] points = new Point[0];

    public void setPoints(Point[] points) {
        this.points = new Point[points.length];
        for (int i = 0; i < points.length; i++) {
            this.points[i] = new Point(points[i].getX(), points[i].getY());
        }
    }

    public void addPoint(Point point) {
        int length = this.points.length;
        Point[] newPoints = new Point[length + 1];
        for (int i = 0; i < length; i++) {
            newPoints[i] = new Point(points[i].getX(), points[i].getY());
        }
        newPoints[length] = point;
        this.points = newPoints;
    }

    public void addPoint(double x, double y) {
        int length = this.points.length;
        Point[] newPoints = new Point[length + 1];
        for (int i = 0; i < length; i++) {
            newPoints[i] = new Point(points[i].getX(), points[i].getY());
        }
        newPoints[length] = new Point(x, y);
        this.points = newPoints;
    }

    public double getLength() {
        double sum = 0;
        for (int i = 0; i < this.points.length - 1; i++) {
            sum += points[i].getLength(points[i + 1]);
        }
        return sum;
    }
}
