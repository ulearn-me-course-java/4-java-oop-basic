package com.example.task04;

import java.awt.*;

public class Line {
    private Point point1;
    private Point point2;
    public Point getPoint1(){
        return point1;
    }
    public Point getPoint2(){
        return point2;
    }

    public Line(Point point1, Point point2){
        this.point1 = point1;
        this.point2 = point2;
    }
    public boolean isCollinearLine(Point point) {
        int A = point2.y - point1.y;
        int B = point2.x - point1.x;
        int C = point.y - point1.y;
        int D = point.x - point1.x;
        return A/B == C/D;
    }
    public String toString(){
        return String.format("point 1 " + point1 + " point 2 " + point2);
    }
}
