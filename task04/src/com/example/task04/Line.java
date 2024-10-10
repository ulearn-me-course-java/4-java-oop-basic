package com.example.task04;

public class Line {
    private final Point p1;
    private final Point p2;

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

    public boolean isCollinearLine(Point p) {
        // slope AB = slope AC
        // (y2-y1)/(x2-x1) = (y3-y1)/(x3-x1)

        // avoid division by zero
        return (p2.y - p1.y) * (p.x - p1.x) == (p.y - p1.y) * (p2.x - p1.x);
    }

    @Override
    public String toString() {
        return String.format("%s, %s", p1, p2);
    }
}
