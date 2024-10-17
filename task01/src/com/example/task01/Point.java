package com.example.task01;

/**
 * Класс точки на плоскости
 */
public class Point {
    int x;
    int y;
    Point(){
    }
    Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    void flip(){
        x *= -1;
        y *= -1;
        int temp = x;
        x = y;
        y = temp;
    }
    double distance(Point point){
        int x_distanse = Math.max(x,point.x) - Math.min(x,point.x);
        int y_distanse = Math.max(y,point.y) - Math.min(y,point.y);
        return Math.sqrt(Math.pow(x_distanse,2) + Math.pow(y_distanse,2));
    }
    public String toString() {
        return String.format("(%d, %d)", x, y);
    }
}
