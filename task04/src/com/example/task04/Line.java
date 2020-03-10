package com.example.task04;

public class Line {

    private Point point1;
    private Point point2;

    public Line(Point p1, Point p2){
        point1 = p1;
        point2 = p2;
    }

    public Point getPoint1() {
        return point1;
    }

    public Point getPoint2() {
        return point2;
    }

    public String toString(){
        return "Line from "+point1+" to "+point2;
    }

    public boolean isCollinearLine(Point p){
        return ((p.x - point1.x) * (point2.y - point1.y) - (point2.x - point1.x) * (p.y - point1.y) == 0);
    }
}
