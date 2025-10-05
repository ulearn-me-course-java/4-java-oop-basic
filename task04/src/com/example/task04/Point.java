package com.example.task04;

/**
 * Класс точки на плоскости
 */
public class Point {
    public final int x;
    public final int y;

    double distance(Point point){
        return Math.sqrt(Math.pow(Math.abs(x - point.x), 2) + Math.pow(Math.abs(y - point.y), 2));
    }

    void print() {
        String pointToString = String.format("(%d, %d)", x, y);
        System.out.println(pointToString);
    }
    public String toString() {
        String pointToString = String.format("(%d, %d)", x, y);
        return pointToString;
    }

    public Point(){
        this.x = 0;
        this.y = 0;
    }
    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }
}
