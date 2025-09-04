package com.example.task04;

public class Line {
    private final Point p1;
    private final Point p2;

    public Line(Point p1, Point p2){
        this.p1 = p1;
        this.p2 = p2;
    }

    public Point getP1(){
        return this.p1;
    }
    public Point getP2(){
        return this.p2;
    }

    public  String toString(){
        return p1.toString() + "-----" + p2.toString();
    }

    public boolean isCollinearLine(Point point){
        return (int)this.p1.distance(this.p2) == (int)(point.distance(p1) + point.distance(p2));
    }
}
