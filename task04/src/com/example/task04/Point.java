package com.example.task04;

/**
 * Класс точки на плоскости
 */
public class Point {
    final int x, y;
    public Point(int x, int y){
        this.x= x;
        this.y = y;
    }

    public double distance(Point dot){
        return (Math.sqrt((Math.pow(dot.x - this.x, 2)) + (Math.pow(dot.y - this.y, 2))));
    }

    public String toString(){
        return "(" + this.x + ", " + this.y + ")";
    }
}
