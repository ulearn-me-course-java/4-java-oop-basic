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
        return String.format("[(%d;%d),(%d;%d)]", p1.getX(), p1.getY(), p2.getX(), p2.getY());
    }

    public boolean isCollinearLine(Point p){
        // проверка на коллинеарность
        boolean coll = (p.getX() - p1.getX()) * (p2.getY() - p1.getY()) - (p.getY() - p1.getY()) * (p2.getX() - p1.getX()) == 0;
        //проверка на принадлежность
        boolean acces = (p1.getX() < p.getX() && p.getX() < p2.getX()) || (p2.getX() < p.getX() && p.getX() < p1.getX());
        return coll && acces;
    }
}
