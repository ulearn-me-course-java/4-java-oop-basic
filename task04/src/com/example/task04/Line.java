package com.example.task04;

public class Line {
    private Point p1;
    private Point p2;

    public Line(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public String toString() {
        return String.format("[(%d, %d), (%d, %d)]", p1.x, p1.y, p2.x, p2.y);
    }

    public Point getP1() {
        return p1;
    }

    public Point getP2() {
        return p2;
    }

    public boolean isCollinearLine(Point p) {
        // формируем уравнение прямой Ax + By + C = 0
        int xCoeff = p1.y - p2.y;
        int yCoeff = p2.x - p1.x;
        int freeCoeff = p1.x * p2.y - p2.x * p1.y;

        return xCoeff * p.x + yCoeff * p.y + freeCoeff == 0;
    }
}