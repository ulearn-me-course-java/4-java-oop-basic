package com.example.task05;

import java.util.ArrayList;
import java.util.List;

public class PolygonalLine {
    private List<Point> points = new ArrayList<>();

    public void setPoints(Point[] points) {
        this.points.clear();
        for (Point point : points) {
            this.points.add(point);
        }
    }

    public void addPoint(Point point) {
        points.add(point);
    }

    public void addPoint(double x, double y) {
        points.add(new Point(x, y));
    }

    public double getLength() {
        double length = 0.0;
        for (int i = 0; i < points.size() - 1; i++) {
            length += points.get(i).getLength(points.get(i + 1));
        }
        return length;
    }
}
