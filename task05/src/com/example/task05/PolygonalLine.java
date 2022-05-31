package com.example.task05;

public class PolygonalLine {
    int NumOfPoints = 0;
    private Point[] points = new Point[1];

    public void setPoints(Point[] points) {
        for (Point point : points) {
            this.addPoint(point);
        }
    }

    public void addPoint(Point point) {
        if (point == null) throw new NullPointerException();

        if (NumOfPoints == points.length) {
            Point[] pointsNew = new Point[points.length * 2];
            System.arraycopy(points, 0, pointsNew, 0, points.length);
            points = pointsNew;
        }
        points[NumOfPoints] = new Point(point.getX(), point.getY());
        NumOfPoints++;
    }

    public void addPoint(double x, double y) {
        addPoint(new Point(x, y));
    }

    public double getLength() {
        double length = 0;
        for (int i = 1; i < NumOfPoints; i++) {
            length += Math.sqrt(Math.pow(points[i].getX() - points[i - 1].getX(), 2)
                    + Math.pow(points[i].getY() - points[i - 1].getY(), 2));
        }
        return length;
    }

}
