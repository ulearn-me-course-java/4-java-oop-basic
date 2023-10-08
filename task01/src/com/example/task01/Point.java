package com.example.task01;

/**
 * Класс точки на плоскости
 */
public class Point {
    public int x;
    public int y;
    Point(int x, int y){
        this.x=x;
        this.y=y;
    }
    void flip(){
        int xVar = x;
        x=-y;
        y=-xVar;
    }

    double distance(Point point){
        double res = (x -point.x)*(x -point.x) + (y -point.y)*(y -point.y);
        return Math.sqrt(res);
    }
    public String toString(){
        return "(" + x + ", "+y +")";
    }
    void print() {
        String pointToString = String.format("(%d, %d)", x, y);
        System.out.println(pointToString);
    }
}
