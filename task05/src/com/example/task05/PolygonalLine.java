package com.example.task05;

public class PolygonalLine {
    private Point[] points;

    public void setPoints(Point[] points) {
        this.points = new Point[points.length];

        int count = 0;

        for (Point point : points) {
            this.points[count++] = point;
        }
    }

    public void addPoint(Point point) {
        Point[] pointsNew = new Point[this.points.length + 1];

        int count = 0;

        for (Point pointC : points) {
            this.points[count++] = pointC;
        }

        points[count] = point;
    }


    public void addPoint(double x, double y) {
        Point[] pointsNew = new Point[this.points.length + 1];

        Point point = new Point(x,y);

        int count = 0;

        for (Point pointC : points) {
            this.points[count++] = pointC;
        }

        points[count] = point;
    }

    public double getLength() {
        double length = 0;
        for (int count = 0; count < points.length; count++) {
            Point p1 = points[count];
            Point p2 = points[count + 1];

            length += p1.getLength(p2);
            System.out.println(length);
        }
        return length;
    }
}
