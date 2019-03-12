package com.example.task05;

import java.util.ArrayList;

public class PolygonalLine {

    private ArrayList<Point> points = new ArrayList<>();

    void setPoints(Point[] points) {
        for (Point p : points) {
            this.points.add(new Point(p));
        }
    }

    void addPoint(Point point) {
        points.add(new Point(point));
    }

    public void addPoint(double x, double y) {
        points.add(new Point(x, y));
    }

    double getLength() {
        if(points == null || points.size() <= 1) return 0;

        double length = 0;
        for (int i = 0; i < points.size() - 1; i++) length += points.get(i).getLength(points.get(i + 1));
        return length;
    }

}
