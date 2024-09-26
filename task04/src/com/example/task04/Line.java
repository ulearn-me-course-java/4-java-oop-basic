package com.example.task04;

public class Line {

    private final Point point1;
    private final Point point2;

    public Line(Point p1, Point p2) {
        this.point1 = p1;
        this.point2 = p2;
    }

    public Point getP1(){
        return this.point1;
    }
    public Point getP2(){
        return this.point2;
    }

    public boolean isCollinearLine(Point p){
        double result = (point2.y - point1.y) * (p.x - point1.x) - (point2.x - point1.x) * (p.y - point1.y);
        return result == 0;
    }
    public String toString() {
        return "Отрезок от " + this.point1 +" до " + this.point2;
    }

}
