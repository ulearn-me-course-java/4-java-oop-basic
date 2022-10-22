package com.example.task04;

public class Line {
    private Point firstPoint;
    private Point secondPoint;

    public Line(Point firstPoint, Point p2) {
        this.firstPoint = firstPoint;
        this.secondPoint = p2;
    }

    public Point getP1() {
        return firstPoint;
    }

    public Point getP2() {
        return secondPoint;
    }

    public String toString() {
        return String.format("Line = { p1 = (%d , %d); p2 = (%d , %d) }", firstPoint.getX(), firstPoint.getY(), secondPoint.getX(), secondPoint.getY() );
    }

    public boolean isCollinearLine(Point p){
        return (p.getX() - firstPoint.getX()) * (secondPoint.getY() - firstPoint.getY()) - (secondPoint.getX() - firstPoint.getX()) * (p.getY() - firstPoint.getY()) == 0;
    }
}
