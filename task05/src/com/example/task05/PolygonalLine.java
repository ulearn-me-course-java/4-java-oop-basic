package com.example.task05;

import java.util.*;

/**
 * Ломаная линия
 */
public class PolygonalLine {

    private List<Point> points;

    public PolygonalLine() {
        points = new ArrayList<Point>();
    }

    public void setPoints(Point[] points) {
        for(Point p: points)
            this.points.add(new Point(p.getX(), p.getY()));
    }

    public void addPoint(Point point) {
        this.points.add(new Point(point.getX(), point.getY()));
    }

    public void addPoint(double x, double y) {
        this.points.add(new Point(x,y));
    }

    public double getLength() {
        double length = 0;
        Point cPoint = this.points.get(0);
        for(int i = 1; i < this.points.size(); i++) {
            length += cPoint.getLength(this.points.get(i));
            cPoint = this.points.get(i);
        }
        return  length;
    }

}
