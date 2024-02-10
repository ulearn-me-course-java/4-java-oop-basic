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
    public String toString(){
        return "["+p1.toString()+";"+p2.toString()+"]";
    }
    public float getAngularCoefficient(){
        return p1.getAngularCoefficient(p2);
    }

    public boolean isCollinearLine(Point p){
        if (p1.x == p2.x && p1.x == p.x)
            return (p.y >= Math.min(p1.y, p2.y) && p.y <= Math.max(p1.y, p2.y));
        if (getAngularCoefficient() != p1.getAngularCoefficient(p)) return false;
        if (!(p.y >= Math.min(p1.y, p2.y) && p.y <= Math.max(p1.y, p2.y))) return false;
        if (!(p.x >= Math.min(p1.x, p2.x) && p.x <= Math.max(p1.x, p2.x))) return false;
        return true;
    }
}
