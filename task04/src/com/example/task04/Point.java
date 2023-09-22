package com.example.task04;
/**
 * Класс точки на плоскости
 */
public class Point {
    final int x;
    final int y;
    Point(int x, int y){
        this.x=x;
        this.y=y;
    }
    double distance(Point point){
        double res = 0.0;
        res = (x -point.x)*(x -point.x) + (y -point.y)*(y -point.y);
        return Math.sqrt(res);
    }
    public String toString(){
        return "(" + x + ", "+y +")";
    }
}