package com.example.task04;

public class Line {
    private Point point1;
    private Point point2;

    public Line(Point point1, Point point2) {
        this.point1 = point1;
        this.point2 = point2;
    }

    public Point getP1() {
        return point1;
    }

    public Point getP2() {
        return point2;
    }

    public String toString() {
        return "Point1 = (" + point1.x + ", " + point1.y + "), Point2 = (" + point2.x + ", " + point2.y + ")";
    }

    public boolean isCollinearLine(Point p) {
        int a = point1.y - point2.y;
        int b = point2.x - point1.x;
        int c = point1.x * point2.y - point2.x * point1.y;

        return a * p.x + b * p.y + c == 0;
    }
}
