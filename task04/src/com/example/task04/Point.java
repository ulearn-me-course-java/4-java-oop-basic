package com.example.task04;

public class Point {
    public final int x;
    public final int y;
    public Point(int x, int y){
        this.y = y;
        this.x = x;
    }

    double distance(Point point){
        return Math.sqrt(Math.pow(x - point.x, 2) + Math.pow(y - point.y, 2));
    }
    public String toString(){
        return String.format("(%d, %d)", x, y);
    }
    void print() {

        System.out.println(toString());
    }
}
