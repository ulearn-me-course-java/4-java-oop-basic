package com.example.task04;

public class Line {

    final private Point p1;
    final private Point p2;
    public Line(Point p1, Point end) {
        this.p1 = p1;
        this.p2 = end;
    }

    public Point getP2() {
        return p2;
    }

    public Point getP1() {
        return p1;
    }

    public String toString() {
        return String.format("(%d, %d) - (%d, %d)", p1.getX(), p1.getY(), p2.getX(), p2.getY());
    }

    public boolean isCollinearLine(Point p) {
        int x1 = p1.getX();
        int y1 = p1.getY();
        int x2 = p2.getX();
        int y2 = p2.getY();
        int x = p.getX();
        int y = p.getY();

        return (y2 - y1) * (x - x1) == (y - y1) * (x2 - x1);
    }
}
