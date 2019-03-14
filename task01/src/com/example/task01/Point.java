package com.example.task01;

/**
 * Класс точки на плоскости
 */
public class Point {
    int x;
    int y;

    Point(){
        x = 0;
        y = 0;
    }

    Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    void flip(){
        int a = -x;
        x = -y;
        y = a;
    }

    double distance(Point point){
        return Math.sqrt(Math.pow(point.x - this.x, 2) + Math.pow(point.y - this.y, 2));
    }

    public String toString(){
        return String.format("(%d, %d)", x, y);
    }

    void print() {
        String pointToString = String.format("(%d, %d)", x, y);
        System.out.println(pointToString);
    }
}
