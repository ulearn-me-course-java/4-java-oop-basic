package com.example.task04;

public class Line {
    private Point p1;
    private Point p2;

    public Line(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public boolean isCollinearLine(Point p) {
        int A = this.p1.getY() - this.p2.getY();
        int B = this.p2.getX() - this.p1.getX();
        int C = -A * this.p1.getX() - B * this.p1.getY();
        return (A*p.getX() + B*p.getY() + C) == 0;
    }

    public Point getP1() {
        return p1;
    }

    public Point getP2() {
        return p2;
    }

    public String toString() {
        return p1 + ":" + p2;
    }
}