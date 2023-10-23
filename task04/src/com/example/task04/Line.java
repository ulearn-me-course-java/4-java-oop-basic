package com.example.task04;

public class Line {
    private Point point1;
    private Point point2;

    public Line(Point p1, Point p2) {
        this.point1 = p1;
        this.point2 = p2;
    }

    public Point getP1() {
        return point1;
    }
    public Point getP2() {
        return point2;
    }

    public boolean isCollinearLine(Point p) {
        return (p.getX() - point1.getX()) * (point2.getY() - point1.getY()) - (point2.getX() - point1.getX()) * (p.getY() - point1.getY()) == 0;
    }

    public String toString() {
        return "P1: (" + point1.getX() + ", " + point1.getY() + "), P2: (" + point2.getX() + ", " + point2.getY() + ")";
    }
}