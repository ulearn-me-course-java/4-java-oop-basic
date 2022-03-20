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
        boolean res = false;
        try {
            res = (Math.abs((p1.x - p.x) / (p1.y - p.y)) - ((p2.x - p.x) / (p2.y- p.y)) < 0.001);
        }
        catch(Exception ex) {
            System.out.println(ex);
        }
        return res;
    }
    public String toString(){
        return p1.toString() + " " + p2.toString();
    }
}
