package com.example.task04;

public class Line {
    private final Point p1;
    private final Point p2;

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
        return String.format("([%d,%d],[%d, %d])", p1.x,p1.y, p2.x, p2.y);
    }

    public boolean isCollinearLine(Point p){
        return ((p.x- p1.x)*(p2.y- p1.y)-(p.y- p1.y)*(p2.x- p1.x) == 0 && p1.x < p.x && p.x < p2.x);
        // проверка на коллинеарность [p1, p] и [p, p2] и абссциса p не нахожится правее или левее отрезка
    }

}
