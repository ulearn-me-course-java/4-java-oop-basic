package com.example.task05;

public class PolygonalLine {
    private Point[] points = new Point[]{};

    public void setPoints(Point[] points) {
        //this.points = points;
        this.points = new Point[points.length];
        for (int i = 0; i < points.length; i++) {
            this.points[i] = new Point(points[i].getX(), points[i].getY());
        }
    }

    public void addPoint(Point point) {
        if (point != null) {
            Point[] newPoints = new Point[this.points.length + 1];
            for (int i = 0; i < newPoints.length; i++) {
                if (i < points.length) {
                    newPoints[i] = points[i];
                } else {
                    newPoints[i] = point;
                }
            }
            setPoints(newPoints);
        }
    }

    public void addPoint(double x, double y) {
        Point[] newPoints = new Point[this.points.length + 1];
        for (int i = 0; i < newPoints.length; i++) {
            if (i <= points.length) {
                newPoints[i] = points[i];
            } else {
                newPoints[i] = new Point(x, y);
            }
        }
        setPoints(newPoints);
    }

    public double getLength() {
        double len = 0;
        for (int i = 0; i < points.length - 1; i++) {
            len += points[i].getLength(points[i + 1]);
        }
        return len;
    }

}
