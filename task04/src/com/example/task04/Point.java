package com.example.task04;

import java.text.MessageFormat;

public class Point {
    final int x;
    final int y;


    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    public double distance(Point point){
        double Xd = Math.abs(point.x - x);
        double Yd = Math.abs(point.y - y);

        return Math.sqrt(Math.pow(Xd, 2) + Math.pow(Yd, 2));
    }

    public String toString(){
        return String.format("(%d,%d)",x,y);
    }
}
