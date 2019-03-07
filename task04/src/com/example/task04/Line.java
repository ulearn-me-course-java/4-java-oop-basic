package com.example.task04;

import org.junit.Assert;

import java.math.BigDecimal;

public class Line {
    private Point firstPoint;
    private Point secondPoint;
    private double length;

    public Line(Point point1, Point point2){
        firstPoint = point1;
        secondPoint = point2;
        length = Math.sqrt(Math.pow(point1.x - point2.x, 2) + Math.pow(point1.y - point2.y, 2));
    }

    public Point GetP1(){ return firstPoint; }
    public Point GetP2(){ return secondPoint; }

    public boolean isCollinearLine(Point otherPoint){
        Line firstPart = new Line(firstPoint, otherPoint);
        Line secondPart = new Line(otherPoint, secondPoint);

        return Math.abs((firstPart.length + secondPart.length) - length) < 0.00001;
    }

    public String toString(){
        return (firstPoint.x + ";" + firstPoint.y + " " + secondPoint.x + ";" + secondPoint.y);
    }
}
