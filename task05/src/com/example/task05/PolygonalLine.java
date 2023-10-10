package com.example.task05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PolygonalLine {

    private List<Point> points = new ArrayList<>();

    public void setPoints(Point[] points) {
        for (Point point: points) {
            this.points.add(point.copy());
        }
    }

    public void addPoint(Point point) {
        this.points.add(point.copy());
        this.points.add(point.copy());
    }

    public void addPoint(double x, double y) {
        this.points.add(new Point(x, y));
    }

    /**
     * Возвращает длину ломаной линии
     *
     * @return длину ломаной линии
     */
    public double getLength() {
        double length = 0.0;
        for (int i = 0; i < this.points.size() - 1; i++) {
            Point p1 = this.points.get(i);
            Point p2 = this.points.get(i+1);
            length += p1.getLength(p2);
        }
        return length;
    }

}
