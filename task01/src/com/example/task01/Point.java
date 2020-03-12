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
        int tempY = y;
        this.y = -x;
        this.x = -tempY;
    }

    double distance(Point point){
        int diffX = Math.abs(point.x - x);
        int diffY = Math.abs(point.y - y);
        return Math.sqrt(diffX * diffX + diffY * diffY);
    }

    public String toString(){
        return x + " " + y;
    }

    void print() {
        String pointToString = String.format("(%d, %d)", x, y);
        System.out.println(pointToString);
    }
}
