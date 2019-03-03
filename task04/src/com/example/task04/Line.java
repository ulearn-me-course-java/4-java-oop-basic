package com.example.task04;

public class Line {
    private final Point p1, p2;

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

    @Override
    public String toString() {
        return "Line{" +
                "p1=" + p1 +
                ", p2=" + p2 +
                '}';
    }

    // A = (Y1 - Y2)    B = (X2 - X1)   C = (X1 * Y2 - X2 * Y1)
    public boolean isCollinearLine(Point p){
        return (p1.getY() - p2.getY()) * p.getX() + (p2.getX() - p1.getX()) * p.getY() +
                p1.getX() * p2.getY() - p2.getX() * p1.getY() == 0;
    }
}
