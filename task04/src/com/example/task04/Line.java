package com.example.task04;

public class Line {
    private Point p1;
    private Point p2;

    Line(Point p1, Point p2) {
        if (p1 == null || p2 == null)
            throw new NullPointerException();
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
        return p1.toString() + "\n" + p2.toString();
    }

    public boolean isCollinearLine(Point p) {

        if (p == null)
            throw new NullPointerException();

        long dx1 = p2.x - p1.x;
        long dy1 = p2.y - p1.y;

        long dx = p.x - p1.x;
        long dy = p.y - p1.y;

        double S = dx1 * dy - dx * dy1;

        double ab = Math.sqrt(dx1 * dx1 + dy1 * dy1);

        double h = S / ab;
        return Math.abs(h) < 0.00001 / 2;
    }
}
