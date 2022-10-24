package com.example.task04;

public class Line {
    private final Point P1;
    private final Point P2;

    public Line(Point p1, Point p2){
        P1 = p1;
        P2 = p2;

    }
    public Point getP1(){
        return P1;
    }
    public Point getP2(){
        return P2;
    }
    public String toString(){
        return String.format("(%d, %d)", P1.x, P1.y, P2.x, P2.y);
    }
    public boolean isCollinearLine(Point p){
        return (p.getX() - P1.getX()) * (P2.getY() - P1.getY()) - (P2.getX() - P1.getX()) * (p.getY() - P1.getY()) == 0;

    }
}
