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
        return String.format("P1 %s, P2 %s", p1, p2);
    }

    public boolean isCollinearLine(Point p) {
        int k = (getP1().y - getP2().y) / (getP1().x - getP2().x);
        int b = getP2().y - k * getP2().x;

        if (k * p.x + b == p.y) {
            return true;
        } else return false;
    }
}
