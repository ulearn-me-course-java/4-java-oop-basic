package com.example.task04;

public class Line {
    private Point p1;
    private Point p2;

    public Line(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public String toString() {
        return String.format("1p (%d, %d), 2p (%d, %d), dist %5$,.3f", p1.x, p1.y, p2.x, p2.y, p1.distance(p2));
    }

    public boolean isCollinearLine(Point p) {
        double k = (double) (p1.y - p2.y) / (p1.x - p2.x);
        double b = p1.y - p1.x * k;
        return p.y == k * p.x + b;
    }

    public Point getP1() { return p1; }

    public Point getP2() { return p2; }
}
