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

    @Override
    public String toString() {
        return String.format("Line form" + p1 + " to " + p2);
    }

    public boolean isCollinearLine(Point p) {
        int x1 = p1.getX();
        int y1 = p1.getY();
        int x2 = p2.getX();
        int y2 = p2.getY();
        int x = p.getX();
        int y = p.getY();

        if (x1 == x2) {
            return x == x1 && y >= Math.min(y1, y2) && y <= Math.max(y1, y2);
        }

        if (y1 == y2) {
            return y == y1 && x >= Math.min(x1, x2) && x <= Math.max(x1, x2);
        }

        return (x - x1) * (y2 - y1) == (y - y1) * (x2 - x1);
    }

}
