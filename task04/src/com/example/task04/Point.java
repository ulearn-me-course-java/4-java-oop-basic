package com.example.task04;

/**
 * Класс точки на плоскости
 */
public class Point {
    public final int x;
    public final int y;

    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }
    void print() {
        String pointToString = String.format("(%d, %d)", x, y);
        System.out.println(pointToString);
    }
    double distance(Point point){
        return Math.sqrt(Math.pow(x - point.x, 2) + Math.pow(y - point.y, 2));
    }
    public String toString(){
        return "("+x+","+y+")";
    }
}
