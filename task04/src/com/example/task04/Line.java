package com.example.task04;

public class Line {
    private Point p1;
    private Point p2;

    public Line(Point p1, Point p2) {
        if (p1 == null || p2 == null) {
            throw new IllegalArgumentException();
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
        return "[" + p1 + ", " + p2 + "]";
    }

    public boolean isCollinearLine(Point M) {
        if (M == null) {
            throw new NullPointerException();
        }
        return (p2.x-p1.x) * (M.y-p1.y) - (M.x-p1.x) * (p2.y-p1.y) == 0;
    }
}
