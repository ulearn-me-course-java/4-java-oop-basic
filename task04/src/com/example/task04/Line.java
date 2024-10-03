package com.example.task04;

public class Line {
    private Point a; // Начало отрезка
    private Point b; // Конец отрезка

    public Line(Point p1, Point p2){
        a = Point.MinX(p1, p2);
        b = Point.MaxX(p1,p2);
    }

    public String toString(){
        return a.toString() + ", " + b.toString();
    }

    void print() {
        System.out.println(toString());
    }

    public boolean isCollinearLine(Point p){
        return p.distance(a) + p.distance(b) == a.distance(b);
    }

    public Point getP1() {return a;}
    public Point getP2() {return b;}
}
