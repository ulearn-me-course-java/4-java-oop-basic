package com.example.task04;

public class Line {
    private Point p1;
    private Point p2;

    public Line(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public Line() {
        this(new Point(), new Point());
    }

    public Point getP1() {
        return p1;
    }

    public Point getP2() {
        return p2;
    }

    public boolean isCollinearLine(Point p) {
        return (p.x - p1.x) * (p2.y - p1.y) - (p.y - p1.y) * (p2.x - p1.x) == 0 &&
                ((p1.x < p.x && p.x < p2.x) || (p2.x < p.x && p.x < p1.x));
    }

    @Override
    public String toString() {
        return String.format("Line = [Point%s;Point%s]", p1.toString(), p2.toString());
    }
}
