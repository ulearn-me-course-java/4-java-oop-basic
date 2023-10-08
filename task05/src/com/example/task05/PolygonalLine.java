package com.example.task05;

/**
 * Ломаная линия
 */
public class PolygonalLine {
    private Point[] points = new Point[0];

    public void setPoints(Point[] points) {
        Point[] newPoints = new Point[points.length];
        for (int i = 0; i < points.length; i++) {
            newPoints[i] = new Point(points[i].getX(), points[i].getY());
        }
        this.points = newPoints;
    }

    public void addPoint(Point point) {
        Point[] newPoints = new Point[this.points.length + 1];
        for (int i = 0; i < points.length; i++) {
            newPoints[i] = new Point(points[i].getX(), points[i].getY());
        }

        newPoints[newPoints.length - 1] = new Point(point.getX(), point.getY());
        points = newPoints;
    }

    public void addPoint(double x, double y) {
        Point point = new Point(x,y);
        addPoint(point);
    }

    public double getLength() {
        double len = 0;
        for (int i = 0; i < points.length - 1; i++) {
            len += points[i].getLength(points[i + 1]);
        }

        return len;
    }

}
