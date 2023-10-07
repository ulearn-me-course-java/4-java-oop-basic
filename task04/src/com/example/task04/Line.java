package com.example.task04;

public class Line {
    private Point point1;
    private Point point2;

    public Point getP1(){
        return point1;
    }

    public Point getP2(){
        return point2;
    }

    public Line(Point p1, Point p2){
        point1 = p1;
        point2 = p2;
    }

    public String toString() {
        return point1.toString() + " " + point2.toString();
    }

    public boolean isCollinearLine(Point p){
        return point1.distance(point2) == p.distance(point1) + p.distance(point2);
    }
}
