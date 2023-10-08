package com.example.task04;

public class Line {
    private Point p1;
    private Point p2;
    public Line(Point p1, Point p2){
        this.p1 = p1;
        this.p2 = p2;
    }
    public Point getP1(){
        return p1;
    }
    public Point getP2(){
        return p2;
    }
    public boolean isCollinearLine(Point p){
        double distanceP1P = p1.distance(p);
        double distanceP2P = p2.distance(p);

        return Math.abs(distanceP2P+distanceP1P - p1.distance(p2))<0.001 ||
                Math.abs(Math.abs(distanceP2P-distanceP1P) - p1.distance(p2))<0.001;
    }
    public String toString(){
        return String.format("(%s; %s)", p1.toString(), p2.toString());
    }
}
