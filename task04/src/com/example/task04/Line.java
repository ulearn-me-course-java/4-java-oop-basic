package com.example.task04;

public class Line {
    private Point p1;
    private Point p2;

    public Line(Point P1, Point P2) {
        p1 = P1;
        p2 = P2;
    }

    public Point getP1() {
        return p1;
    }

    public Point getP2() {
        return p2;
    }

    public boolean isCollinearLine(Point p) {
        int dx1 = p2.x - p1.x;
        int dy1 = p2.y - p1.y;
        int dx = p.x - p1.x;
        int dy = p.y - p1.y;

        return (dx * dy1 - dy * dx1) == 0;
    }

    public String toString() {
        return String.format("([%d; %d]; [%d; %d])", p1.x, p1.y, p2.x, p2.y);
    }
}
