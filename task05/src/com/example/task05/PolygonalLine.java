package com.example.task05;

import java.util.ArrayList;
import java.util.List;

public class PolygonalLine {
    private List<Point> points = new ArrayList<>();

    public void setPoints(Point[] points) {
        if (points == null) {
            throw new NullPointerException();
        }
        for (Point p : points) {
            this.points.add(new Point(p.getX(), p.getY()));
        }
    }

    public void addPoint(Point point) {
        if (point == null) {
            throw new NullPointerException();
        }
        this.points.add(new Point(point.getX(), point.getY()));
    }

    public void addPoint(double x, double y) {
        this.points.add(new Point(x, y));
    }

    public double getLength() {
        double len = 0;
        for (int i = 0; i < points.size() - 1; i++) {
            len += points.get(i).getLength(points.get(i + 1));
        }
        return len;
    }

}
