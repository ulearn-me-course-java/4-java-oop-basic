package com.example.task05;

public class PolygonalLine {
    private Point[] points = new Point[0];

    public PolygonalLine() {
    }

    public void setPoints(Point[] points) {
        Point[] p = new Point[points.length];
        for (int i = 0; i < points.length; i++) {
            p[i] = new Point(points[i].getX(), points[i].getY());
        }
        this.points = p;
    }

    public void addPoint(Point point) {
        Point[] p = new Point[this.points.length + 1];
        for(int i = 0; i < points.length; i++)
            p[i] = this.points[i];
        p[p.length - 1] = new Point(point.getX(), point.getY());
        points = p;
    }

    public void addPoint(double x, double y) {
        addPoint(new Point(x, y));
    }

    public double getLength() {
        double lineLength = 0;
        for (int i = 0; i < points.length - 1; i++)
            lineLength += points[i].getLength(points[i + 1]);
        return lineLength;
    }

}
