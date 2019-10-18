package com.example.task04;

public class Line {
    private Point point1;
    private Point point2;

    Line() {
        this.point1 = new Point(0, 0);
        this.point2 = new Point(0, 0);
    }

    Line(Point point1, Point point2) {
        this.point1 = point1;
        this.point2 = point2;
    }

    public Point getPoint1() {
        return point1;
    }

    public void setPoint1(Point point1) {
        this.point1 = point1;
    }

    public Point getPoint2() {
        return point2;
    }

    public void setPoint2(Point point2) {
        this.point2 = point2;
    }

    public String toString() {
        return "(" + point1.toString() + ";" + point2.toString() + ")";
    }

    public boolean isCollinearLine(Point p) {
        if (point2.x - point1.x == 0) {
            return Math.min(point1.y, point2.y) <= p.y && Math.max(point1.y, point2.y) >= p.y;
        }
        if (point2.y - point1.y == 0) {
            return Math.min(point1.x, point2.x) <= p.x && Math.max(point1.x, point2.x) >= p.x;
        }
        return (p.x - point1.x) / (point2.x - point1.x) == (p.y - point1.y) / (point2.y - point1.y);
    }
}