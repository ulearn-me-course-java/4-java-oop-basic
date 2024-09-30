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
        int x1 = p1.getX(), y1 = p1.getY();
        int x2 = p2.getX(), y2 = p2.getY();
        int x3 = p.getX(), y3 = p.getY();

        int area = (x2 - x1) * (y3 - y1) - (y2 - y1) * (x3 - x1);
        return area == 0;
    }

    @Override
    public String toString() {
        return p1.toString() + " - " + p2.toString();
    }
}
