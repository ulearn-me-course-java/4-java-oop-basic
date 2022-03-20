package com.example.task04;

/**
 * Класс точки на плоскости
 */
public class Point {
    final int x;
    final int y;

    public Point(){
        this(0, 0);
    }
    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }
    double distance(Point point){
        double xSide = Math.abs(x - point.x);
        double ySide = Math.abs(y - point.y);
        double result = Math.sqrt(Math.pow(xSide, 2) + Math.pow(ySide, 2));

        return result;
    }
    void print() {
        String pointToString = String.format("(%d, %d)", x, y);
        System.out.println(pointToString);
    }
    public String toString(){
        return "(" + x + ", " + y + ")";
    }
}
