package com.example.task04;

public class Point {
    private final int x;
    private final int y;

    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    public double distance(Point point){
        return Math.sqrt((point.x - this.x) * (point.x - this.x) + (point.y - this.y) * (point.y - this.y));
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }
    public String toString() {
        return "(" + this.x + ", " +  this.y + ")";
    }
}