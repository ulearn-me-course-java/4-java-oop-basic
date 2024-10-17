package com.example.task05;
import java.util.ArrayList;

/**
 * Ломаная линия
 */
public class PolygonalLine {
    public ArrayList<Point> points;

    public PolygonalLine() {
        points = new ArrayList<>();
    }

    public void setPoints(Point[] points){
        this.points = new ArrayList<>();
        for (Point p : points) {
            this.points.add(new Point(p.getX(), p.getY()));
        }
    }

    public void addPoint(Point point) {
        points.add(new Point(point.getX(), point.getY()));
    }

    public void addPoint(double x, double y) {
        points.add(new Point(x,y));
    }

    public double getLength() {
        double length = 0;
        for (int i = 1; i < points.size(); i++) {
            length += points.get(i - 1).getLength(points.get(i));
        }
        return length;
    }

}
