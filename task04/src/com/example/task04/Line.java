package com.example.task04;

public class Line {
    private final Point firstPoint;
    private final Point secondPoint;

    public Point GetP1() {
        return firstPoint;
    }

    public Point GetP2() {
        return secondPoint;
    }

    public Line(Point p1, Point p2) {
        this.firstPoint = p1;
        this.secondPoint = p2;
    }

    public boolean isCollinearLine(Point p) {
        double x1 = firstPoint.getX();
        double y1 = firstPoint.getY();
        double x2 = secondPoint.getX();
        double y2 = secondPoint.getY();
        double x3 = p.getX();
        double y3 = p.getY();

        return (y3 - y1) * (x2 - x1) == (y2 - y1) * (x3 - x1);
    }

    public String toString() {
        return this.firstPoint.toString() + " " + this.secondPoint.toString();
    }
}