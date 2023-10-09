package com.example.task04;

public class Line {
    private Point p1;
    private Point p2;

    public Point getP1() {
        return p1;
    }

    public Point getP2() {
        return p2;
    }

    public Line(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public boolean isCollinearLine(Point p) {
        int distanceXClass = p2.x - p1.x;
        int distanceYClass = p2.y - p1.y;

        int distanceX = p.x - p1.x;
        int distanceY = p.y - p1.y;

        int square = distanceXClass * distanceY - distanceX * distanceYClass;
        if (square == 0) return true;
        return false;
    }

    public String toString() {
        return String.format("Length of line: %f", p1.distance(p2));
    }
}
