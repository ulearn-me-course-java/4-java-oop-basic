package com.example.task04;

public class Line {
    private final Point p1;

    public Point getP1() {
        return p1;
    }

    private final Point p2;

    public Point getP2() {
        return p2;
    }

    public Line(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public boolean isCollinearLine(Point p) {
        return (this.p1.getX() / p.getX()) == (this.p1.getY() / p.getY())
                && (this.p2.getX() / p.getX()) == (this.p2.getY() / p.getY());
    }

    @Override
    public String toString() {
        return "Line{" +
                "p1=" + p1 +
                ", p2=" + p2 +
                '}';
    }
}