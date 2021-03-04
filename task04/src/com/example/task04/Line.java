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

    public String toString() {
        return firstPoint.toString() + " " + secondPoint.toString();
    }

    public boolean isCollinearLine(Point p) {
        double dist = firstPoint.distance(secondPoint);
        double part = firstPoint.distance(p);
        double part2 = secondPoint.distance(p);
        return Math.abs(dist - (part + part2)) < 0.00001;//Думаю такой точности достаточно
    }

}