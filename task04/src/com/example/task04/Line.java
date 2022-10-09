package com.example.task04;

public class Line {
    private final Point P1;
    private final Point P2;

    public Line(Point p1, Point p2){
        P1 = p1;
        P2 = p2;
    }

    public Point getP1(){
       return this.P1;
    }

    public Point getP2(){
        return this.P2;
    }

    public String toString(){
        return String.format("P1 = (%d;%d), P2 = (%d;%d)", P1.x, P1.y, P2.x, P2.y);
    }

    public boolean isCollinearLine(Point p){
        return  this.P1.distance(p) + this.P2.distance(p) == this.P1.distance(this.P2);
    }
}
