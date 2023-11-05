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
            pointsNew[count++] = pointC;
        }

        pointsNew[count] = point;
        this.points = pointsNew;
    }


    public void addPoint(double x, double y) {
        Point[] pointsNew = new Point[this.points.length + 1];

        Point point = new Point(x,y);

        int count = 0;

        for (Point pointC : points) {
            pointsNew[count++] = pointC;
        }

        pointsNew[count] = point;
        this.points = pointsNew;
    }

    public double getLength() {
        double length = 0;
        for (int count = 0; count < points.length - 1; count++) {
            Point p1 = points[count];
            Point p2 = points[count + 1];

            length += p1.getLength(p2);
        }
        return length;
    }

    public void getPoints() {
        for (Point point : points) {
            System.out.println(point.getX());
            System.out.println(point.getY());
            System.out.println("-----");
        }
    }
}
