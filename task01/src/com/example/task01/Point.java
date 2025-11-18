package com.example.task01;

/**
 * Класс точки на плоскости
 */
public class Point {
    int x;
    int y;

    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    public  Point(){
        this(0,0);
    }

    void flip(){
        int item = x;
        x = - y;
        y = - item;
    }

    double distance(Point point){
        double distanceX = point.x - this.x;
        double distanceY = point.y - this.y;
        double result = Math.sqrt((distanceX * distanceX) + (distanceY * distanceY));
        return result;
    }

    public String toString(){
        return String.format("(%d, %d)", x, y);
    }

    void print() {
        System.out.println(toString());
    }
}
