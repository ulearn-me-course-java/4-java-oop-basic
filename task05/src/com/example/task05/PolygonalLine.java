package com.example.task05;

/**
 * Ломаная линия
 */
public class PolygonalLine {

    private Point[] points = new Point[0];

    public PolygonalLine() {

    }

    public void setPoints(Point[] points) {
        Point[] newPoints = new Point[points.length];
        for (int i = 0; i < points.length; i++) {
            newPoints[i] = new Point(points[i].getX(), points[i].getY());
        }

        this.points = newPoints;
    }

    public void addPoint(Point point) {

        Point[] oldPoints = new Point[this.points.length + 1];
        for(int i = 0; i < this.points.length; i++){
            oldPoints[i] = this.points[i];
        }

        this.points = oldPoints;
        this.points[this.points.length -1] = new Point(point.getX(), point.getY());
    }

    public void addPoint(double x, double y) {
        addPoint(new Point(x, y));
    }

    public double getLength() {
        double totalDistance = 0;
        for(int i = 0; i < points.length - 1; i++){
            totalDistance += points[i].getLength(points[i + 1]);
        }

        return totalDistance;
    }

}
