package com.example.task05;

/**
 * Ломаная линия
 */
public class PolygonalLine {

    private Point[] points = {};

    public void setPoints(Point[] points) {
        Point[] newPoints = new Point[points.length];
        for (int item = 0; item<points.length; item++){
            newPoints[item] = new Point(points[item].getX(), points[item].getY());
        }
        this.points = newPoints;
    }

    public void addPoint(Point point) {
        Point[] newPoints = new Point[this.points.length + 1];
        for (int item = 0; item<points.length; item++){
            newPoints[item] = new Point(points[item].getX(), points[item].getY());
        }
        newPoints[newPoints.length - 1] = point;
        this.points = newPoints;
    }

    public void addPoint(double x, double y) {
        Point point = new Point(x, y);
        addPoint(point);
    }

    public double getLength() {
        double sum = 0;
        for (int item = 0; item < points.length - 1; item++){
            sum += points[item].getLength(points[item+1]);
        }
        return sum;
    }

}
