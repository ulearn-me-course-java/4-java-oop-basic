package com.example.task04;

public class Line {
    private Point p1;

    public Point getP1() {
        return p1;
    }

    private Point p2;

    public Point getP2() {
        return p2;
    }

    public Line(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public String toString() {
        return p1.toString() + "; " + p2.toString();
    }

    public boolean isCollinearLine(Point p) {
        int dx = getP2().x - getP1().x;
        int dy = getP2().y - getP1().y;
        return ((dx * (p.x - getP1().x) - dy * (p.y - getP1().y)) == 0);
    }
}
