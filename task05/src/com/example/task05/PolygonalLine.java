package com.example.task05;

/**
 * Ломаная линия
 */
public class PolygonalLine {

    private Point[] points = {};

    public void setPoints(Point[] points) {
        Point[] newPoints = new Point[points.length];
        for (int i = 0; i < points.length; i++){
            newPoints[i] = new Point(points[i].getX(), points[i].getY());
        }
        this.points = newPoints;
    }

    public void addPoint(Point point) {
        Point[] newPoints = new Point[this.points.length + 1];
        for (int i = 0; i < points.length; i++){
            newPoints[i] = new Point(points[i].getX(), points[i].getY());
        }
        newPoints[this.points.length] = point;
        this.points = newPoints;
    }

    public void addPoint(double x, double y) {
        Point point = new Point(x, y);
        addPoint(point);
    }

    public double getLength() {
        double sum = 0;
        for (int i = 0; i < points.length - 1; i++){
            sum += points[i].getLength(points[i + 1]);
        }
        return sum;
    }

}
