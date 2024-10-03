package com.example.task04;

public class Line {
    private final Point firstPoint;
    private final Point secondPoint;

    public Line(Point p1, Point p2){
        this.firstPoint = p1;
        this.secondPoint = p2;
    }

    public Point getP1(){
        return firstPoint;
    }

    public Point getP2() {
        return secondPoint;
    }

    public boolean isCollinearLine(Point p){
        return (p.x - firstPoint.x) / (secondPoint.x - firstPoint.x) == (p.y - firstPoint.y) / (secondPoint.y - firstPoint.y);
    }

    public String toString(){
        return String.format("(%d, %d) -- (%d, %d)", firstPoint.x, firstPoint.y, secondPoint.x, secondPoint.y);
    }
}
