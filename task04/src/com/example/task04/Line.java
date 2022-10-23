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
    public String toString(){
        StringBuilder str = new StringBuilder();
        str.append("Line starts at point ");
        str.append(p1.toString());
        str.append(" and ends at point ");
        str.append(p2.toString());
        return str.toString();
    }
    public boolean isCollinearLine(Point p){
    return ((p.x - getP1().x)/(getP2().x - getP1().x) == (p.y - getP1().y)/(getP2().y) - getP1().y);
    }
}
