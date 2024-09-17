package com.example.task04;

public class Line {

    private Point p1;
    private Point p2;
    private double len;

    public Line(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
        len = p2.distance(p1);
    }

    public Point getP1() {
        return p1;
    }

    public Point getP2() {
        return p2;
    }

    public double getLen() {
        return len;
    }

    @Override
    public String toString() {
        return String.format("[%s, %s]", p1, p2);
    }

    public boolean isCollinearLine(Point p) {
        Point vector1 = new Point(p2.x - p1.x, p2.y - p1.y);
        Point vector2 = new Point(p.x - p1.x, p.y - p1.y);
        return vector2.x * vector1.y - vector2.y * vector1.x == 0;
    }
}
