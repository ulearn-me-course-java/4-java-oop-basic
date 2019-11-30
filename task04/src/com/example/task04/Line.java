package com.example.task04;

public class Line {
    private Point p1;
    private Point p2;

    Line(Point p1, Point p2) {
        if (p1 == null || p2 == null) {
            throw new NullPointerException();
        }

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
        return String.format("(%d, %d);(%d, %d)", p1.x, p1.y, p2.x, p2.y);
    }

    public boolean isCollinearLine(Point p) {
        if (p == null) {
            throw new NullPointerException();
        }

        long y1 = (p.x - this.getP1().x) / (this.getP2().x - this.getP1().x);
        long y2 = (p.y - this.getP1().y) / (this.getP2().y - this.getP1().y);
        return y1 == y2;
    }
}
