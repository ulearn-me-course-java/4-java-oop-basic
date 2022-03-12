package com.example.task04;

public class Line {
    private Point p1, p2;
    public Line(Point first, Point second){
        p1 = first;
        p2 = second;
    }

    public Point getP1() {
        return p1;
    }
    public Point getP2() {
        return p2;
    }

    @Override
    public String toString() {
        return "Line{" +
                "p1=" + p1 +
                ", p2=" + p2 +
                '}';
    }

    public boolean isCollinearLine(Point p){
        float horizontalRelation = Math.abs((p2.x- p.x)/(p2.x - p1.x));
        float verticalRelation = Math.abs((p2.y- p.y)/(p2.y - p1.y));
        return horizontalRelation == verticalRelation;
    }
}
