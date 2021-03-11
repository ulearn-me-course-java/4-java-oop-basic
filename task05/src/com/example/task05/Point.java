package com.example.task05;


import static java.lang.Math.*;

public class Point {

   private final double x;
   private final double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }


    public double getX() {
        return x;
    }


    public double getY() {
        return y;
    }


    public double getLength(Point point) {
        return sqrt(pow(point.x - x, 2) + pow(point.y - y, 2));
    }

}
