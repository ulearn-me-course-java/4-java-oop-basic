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
        double dx1 = p2.getX() - p1.getX();
        double dy1 = p2.getY() - p1.getY();
        double dx2 = p.getX() - p1.getX();
        double dy2 = p.getY() - p1.getY();

        return dx1 * dy2 - dy1 * dx2 == 0;
    }

    @Override
    public String toString() {
        return "Line from; " + p1 + " To: " + p2;
    }
}
