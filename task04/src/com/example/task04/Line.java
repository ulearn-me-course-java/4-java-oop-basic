package com.example.task04;

public class Line {
    private Point p1;
    private Point p2;

    public String toString(){
        return p1.toString() + "-" + p2.toString();
    }

    public boolean isCollinearLine(Point p){
        return (p.getX() - p1.getX()) * (p2.getY() - p1.getY()) == (p2.getX() - p1.getX()) * (p.getY() - p1.getY());
    }

    public Point getP1() {
        return p1;
    }

    public Point getP2() {
        return p2;
    }

    public Line(Point point1, Point p2){
        this.p1 = point1;
        this.p2 = p2;
    }
}