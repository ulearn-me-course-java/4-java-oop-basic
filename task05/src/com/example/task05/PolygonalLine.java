package com.example.task05;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Ломаная линия
 */
public class PolygonalLine {
    private ArrayList<Point> points = new ArrayList<>();

    public void setPoints(Point[] points) {
        for (Point p: points) {
            this.points.add(new Point(p.getX(), p.getY()));
        }
    }

    public void addPoint(Point point) {
        this.points.add(new Point(point.getX(), point.getY()));
    }

    public void addPoint(double x, double y) {
        this.points.add(new Point(x, y));
    }

    public double getLength() {
        double sum = 0;
        for (int i = 0; i < this.points.size() - 1; i++) {
            sum += points.get(i).getLength(points.get(i + 1));
        }
        return sum;
    }
}
