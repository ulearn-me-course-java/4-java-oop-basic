package com.example.task04;

public class Line {
    private Point p1;
    private Point p2;

    public Point getP1() {
        return p1;
    }

    public Point getP2() {
        return p2;
    }

    public Line(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public String toString() {
        return "p1: " + p1.toString() + ", p2: " + p2.toString();
    }

    public boolean isCollinearLine(Point p) {
        return Math.round(p1.distance(p) * 100.0) / 100.0 +
                Math.round(p2.distance(p) * 100.0) / 100.0 ==
                Math.round(p1.distance(p2) * 100.0) / 100.0;
    }
}
