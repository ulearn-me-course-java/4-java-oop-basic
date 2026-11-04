package com.example.task04;

public class Line {

    private Point p1;
    private Point p2;

    public Line(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public Point getP1() {
        return p1;
    }

    public Point getP2() {
        return p2;
    }

    @Override
    public String toString() {
        return "Line: " + p1 + " - " + p2;
    }

    public boolean isCollinearLine(Point p) {

        double result =
                (p.getX() - p1.getX()) * (p2.getY() - p1.getY())
                        - (p.getY() - p1.getY()) * (p2.getX() - p1.getX());

        return Math.abs(result) < 1e-9;
    }
}