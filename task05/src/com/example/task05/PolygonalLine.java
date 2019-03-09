package com.example.task05;

import java.util.*;

public class PolygonalLine {

    private ArrayList<Point> points = new ArrayList<>();

    public void setPoints(Point[] points) {
        for (int i = 0; i < points.length; i++) {
            this.points.add(new Point(points[i]));
        }
    }

    public void addPoint(Point point) {
        points.add(new Point(point));
    }

    public void addPoint(double x, double y) {
        points.add(new Point(x, y));
    }

    public double getLength() {
        double distance = 0;
        for (int i = 0; i < points.size() - 1; i++) {
            distance += points.get(i).getLength(points.get(i + 1));
        }
        return distance;
    }
}
