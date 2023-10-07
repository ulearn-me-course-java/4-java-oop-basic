package com.example.task04;

public class Point {
    private final int x;
    private final int y;

    public Point(int x, int y) {
        this.x=x;
        this.y=y;
    }

    public int getX(){
        return this.x;
    }
    public int getY(){
        return this.y;
    }

    public double distance(Point point) {
        return Math.sqrt(Math.pow(point.x - x, 2) + Math.pow(point.y - y, 2));
    }
}
