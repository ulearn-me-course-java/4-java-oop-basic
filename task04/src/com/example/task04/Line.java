package com.example.task04;

public class Line {
    private final Point firstPoint;
    private final Point secondPoint;

    public Line(Point p1, Point p2) {
        firstPoint = p1;
        secondPoint = p2;
    }

    public Point getP1() {
        return firstPoint;
    }

    public Point getP2() {
        return secondPoint;
    }

    public boolean isCollinearLine(Point p) {
        double dx1 = secondPoint.x - firstPoint.x;
        double dy1 = secondPoint.y - firstPoint.y;

        double dx = p.x - firstPoint.x;
        double dy = p.y - firstPoint.y;

        double s = dx1 * dy - dx * dy1; //Эта величина равна удвоенной площади треугольника, составленного тремя точками, и равна нулю если три точки лежат на одной прямой.
        return s == 0;
    }

    public String toString() {
        return "Line{" +
                "firstPoint=" + firstPoint.toString() +
                ", secondPoint=" + secondPoint.toString() +
                "}";
    }
}
