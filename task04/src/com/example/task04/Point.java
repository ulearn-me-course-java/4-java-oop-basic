package com.example.task04;

public class Point {
    final double x;
    final double y;

    public Point(double x, double y){
        this.x = x;
        this.y = y;
    }

    double distance(Point point){
        return Math.sqrt(Math.pow((this.x - point.x), 2) + Math.pow((this.y - point.y), 2));
    }

    public String toString(){
        return String.format("(%d, %d)", x, y);
    }
}
