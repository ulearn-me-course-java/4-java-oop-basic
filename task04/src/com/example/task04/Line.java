package com.example.task04;

public class Line {
    private Point point1;
    private Point point2;

    public Line(Point p1, Point p2){
        point1 = p1;
        point2 = p2;
    }

    public Point getP1(){
        return point1;
    }

    public Point getP2(){
        return point2;
    }

    public boolean isCollinearLine(Point p){
        //(x-x1)/(x2-x1)=(y-y1)/(y2-y1)
        int x = (p.x-point1.x)/(point2.x- point1.x);
        int y = (p.y- point1.y)/(point2.y- point1.y);
        return x == y;
    }

    @Override
    public String toString(){
        return String.format("%s %s", point1, point2);
    }
}
