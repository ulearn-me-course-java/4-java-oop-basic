package com.example.task04;

public class Line {

    private Point point1;
    private Point point2;

    public Line(Point p1, Point p2) {
        this.point1 = p1;
        this.point2 = p2;
    }

    public Point getP1() {
        return this.point1;
    }

    public Point getP2() {
        return this.point2;
    }

    public String toString() {
        return String.format("start=[%d,%d]  end=[%d, %d]", point1.x,point1.y, point2.x, point2.y);
    }

    public boolean isCollinearLine(Point p) {
        return (((p.x- point1.x)*(point2.y- point1.y)-(p.y- point1.y)*(point2.x- point1.x) == 0) && (point1.x < p.x || p.x < point2.x));
    }
}
