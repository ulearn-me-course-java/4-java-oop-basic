package com.example.task04;

public class Line {
    private final Point p1, p2;

    public Line(Point point1, Point point2) {
        p1 = point1;
        p2 = point2;
    }

    public Point getP1() {
        return p1;
    }

    public Point getP2() {
        return p2;
    }

    @Override
    public String toString() {
        return String.format("Point 1: (%d, %d), Point 2: (%d, %d)", p1.X, p1.Y, p2.X, p2.Y);
    }

    public boolean isCollinearLine(Point p) {
        return Math.sqrt(Math.pow(p2.X - p1.X, 2) + Math.pow(p2.Y - p1.Y, 2)) -
                (Math.sqrt(Math.pow(p2.X - p.X, 2) + Math.pow(p2.Y - p.Y, 2)) +
                        Math.sqrt(Math.pow(p1.X - p.X, 2) + Math.pow(p1.Y - p.Y, 2))) < 0.00001;
    }
}
