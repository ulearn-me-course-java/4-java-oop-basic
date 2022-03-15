package com.example.task04;

public class Line {
    private Point p1;
    private Point p2;

    public Line(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public Point getP1() {
        return p1;
    }

    public Point getP2() {
        return p2;
    }

    public String toString() {
        return String.format("Point 1: %s\nPoint 2: %s", p1, p2);
    }

    public boolean isCollinearLine(Point point) {
        int dx1 = p2.x - p1.x;
        int dy1 = p2.y - p1.y;

        int dx = point.x - p1.x;
        int dy = point.y - p1.y;

        return dx1 * dy == dx * dy1;
    }
}
