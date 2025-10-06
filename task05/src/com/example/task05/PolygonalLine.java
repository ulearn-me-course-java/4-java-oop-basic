package com.example.task05;

import java.util.ArrayList;
import java.util.List;

public class PolygonalLine {

    private final List<Point> points;

    public PolygonalLine() {
        this.points = new ArrayList<>();
    }
    public void setPoints(Point[] points) {
        this.points.clear();
        if (points != null) {
            for (Point point : points) {
                this.points.add(point);
            }
        }
    }

    public void addPoint(Point point) {
        if (point != null) points.add(point);
    }

    public void addPoint(double x, double y) {
        points.add(new Point(x, y));
    }

    public double getLength() {
        if (points.size() < 2) return 0.0;

        double totalLenght = 0.0;
        for (int i=0; i<points.size()-1; i++) {
            Point current = points.get(i);
            Point next = points.get(i+1);
            totalLenght += current.getLength(next);
        }
        return totalLenght;
    }

    public int getNumberOfPoints() {
        return points.size();
    }

    public String toString() {
        return points.toString();
    }
}
