package com.example.task04;

public class Line {
    private Point p1;
    public Point getP1(){
        return p1;
    }
    private Point p2;
    public Point getP2(){
        return p2;
    }
    public boolean isCollinearLine(Point p){
        double angleOfInclination = Math.atan((double) Math.abs(p1.y - p2.y) / Math.abs(p1.x - p2.x));
        double angleOfInclinationP = Math.atan((double) Math.abs(p.y - p2.y) / Math.abs(p.x - p2.x));
        return angleOfInclination == angleOfInclination;
    }
    public Line(Point p1, Point p2){
        this.p1 = p1;
        this.p2 = p2;
    }
    public String toString(){
        return new String(p1.toString() +  p2.toString());
    }
}
