package com.example.task04;

public class Point {
    final int x;
    final int y;

    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    public double distance(Point point){
        double d = Math.sqrt(Math.pow((this.x - point.x), 2) + Math.pow((this.y - point.y), 2));
        return d;
    }
    public String toString(){
        String result = String.format("(%d, %d)", this.x, this.y);
        return result;
    }
}