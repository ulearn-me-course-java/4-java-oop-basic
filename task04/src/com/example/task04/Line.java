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
        int B = point1.x - point2.x;
        int C = point2.x * point1.y - point1.x * point2.y;
        return A * point.x + B * point.y + C == 0;
    }
}
