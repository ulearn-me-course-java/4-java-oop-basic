package com.example.task04;

public class Line {
    private final Point p1;

    private final Point p2;

    public Line(Point p1, Point p2){
        this.p1 = p1;
        this.p2 = p2;
    }
    @Override
    public String toString(){
        return p1.toString() + "-------" + p2.toString();
    }

    public boolean isCollinearLine(Point p){
        return Math.abs(p.distance(p1) + p.distance(p2) - p1.distance(p2)) < 1e-5;
    }
}
