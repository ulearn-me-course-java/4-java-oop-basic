package com.example.task04;
/**
 * Класс точки на плоскости
 */
public class Point {
    final double x;
    final double y;

    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    public Point(){
        this.x = 0;
        this.y = 0;
    }

    public double distance(Point point){
        return Math.sqrt( (point.x - x)*(point.x - x) + (point.y - y)*(point.y - y) );
    }

    void print() {
        System.out.println(this.toString());
    }

    public String toString(){
        return "x: " + x + " y: " + y;
    }
}