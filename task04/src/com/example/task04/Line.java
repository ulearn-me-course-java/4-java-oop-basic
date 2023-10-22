package com.example.task04;

public class Line {
    private Point p1;
    private Point p2;

    public Point getP1() {
        return p1;
    }

    public void setP1(Point p1) {
        this.p1 = p1;
    }

    public Point getP2() {
        return p2;
    }

    public void setP2(Point p2) {
        this.p2 = p2;
    }

    public Line(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public boolean isCollinearLine(Point p) {
        double d1 = p1.distance(p);
        double d2 = p2.distance(p);
        double d = p1.distance(p2);

        return Math.abs(d1 + d2 - d) < 0.00001;
    }
    public String toString() {
        return String.format("Point1(%s, %s), Point2(%s, %s)", this.p1.getX(), this.p1.getY(), this.p2.getX(), this.p2.getY());
    }
}