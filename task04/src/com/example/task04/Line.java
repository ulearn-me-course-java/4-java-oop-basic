package com.example.task04;

public class Line {
    private final Point p1;
    private final Point p2;

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

    public double length() {
        return p1.distance(p2);
    }

    public boolean isCollinearLine(Point p) {
        // точки коллинеарны, если площадь треугольника равна 0
        // Если S = 0, то точки лежат на одной прямой

        double area = (p2.getX() - p1.getX()) * (p.getY() - p1.getY())
                - (p.getX() - p1.getX()) * (p2.getY() - p1.getY());

        return Math.abs(area) < 1e-10;
    }

    @Override
    public String toString() {
        return "Line from " + p1 + " to " + p2;
    }
}