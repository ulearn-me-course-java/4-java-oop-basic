package com.example.task05;

public class PolygonalLine {
    private Point[] points = new Point[0];
    public void setPoints(Point[] points) {
        this.points = createArray(points);
    }
    public void addPoint(Point point) {
        Point[] oldArray = points.clone();
        int length = points.length;
        points = new Point[length + 1];

        for (int i = 0; i < length; i++) {
            points[i] = oldArray[i];
        }

        points[length] = point.clone();
    }

    public void addPoint(double x, double y) {
        addPoint(new Point(x, y));
    }

    private Point[] createArray(Point[] points) {
        Point[] newPoints = points.clone();
        for (int i = 0; i < points.length; i++) {
            newPoints[i] = points[i].clone();
        }
        return newPoints;
    }
    public double getLength() {
        double length = 0;
        for (int i = 0; i < points.length - 1; i++) {
            length += points[i].getLength(points[i + 1]);
        }
        return length;
    }

}
