package com.example.task05;

public class PolygonalLine {
    Point[] points;
    public void setPoints (Point[] points) {
        this.points = new Point[points.length];

        for (int i = 0; i < points.length; i++) {
            this.points[i] = new Point(points[i].getX(), points[i].getY());
        }
    }

    public void addPoint(Point point) {
        if (points != null) {
            Point[] temp;
            temp = new Point[points.length + 1];

            for (int i = 0; i < points.length; i++) {
                temp[i] = points[i];
            }
            temp[points.length] = new Point(point.getX(), point.getY());

            points = temp;
        }
        else {
            points = new Point[1];
            points[0] = new Point(point.getX(), point.getY());
        }
    }

    public void addPoint(double x, double y) {
        Point p = new Point(x, y);
        addPoint(p);
    }

    public double getLength() {
        double length = 0;
        for (int i = 0; i < points.length - 1; i++) {
            length += points[i].getLength(points[i + 1]);
        }
        return length;
    }

}
