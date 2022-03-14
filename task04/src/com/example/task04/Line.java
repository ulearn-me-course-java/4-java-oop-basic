package com.example.task04;

public class Line {
    private static final double THICKNESS = 0.001;
    private final Point firstPoint, secondPoint;

    public Line(Point p1, Point p2) {
        firstPoint = p1;
        secondPoint = p2;
    }

    public Point getP1() {
        return firstPoint;
    }
    public Point getP2() {
        return secondPoint;
    }

    public String toString() {
        return "(" + firstPoint + "," + secondPoint + ")";
    }

    public Boolean isCollinearLine(Point p) {
        return THICKNESS > Math.abs((p.X - firstPoint.X) / (p.Y - firstPoint.Y) - (secondPoint.X - firstPoint.X) / (secondPoint.Y - firstPoint.Y));
    }
}
