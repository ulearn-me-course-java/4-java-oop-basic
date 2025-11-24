package com.example.task01;

/**
 * Класс точки на плоскости
 */
public class Point {
    int x;
    int y;

    Point(){}

    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }


    void print() {
        String pointToString = String.format("(%d, %d)", x, y);
        System.out.println(pointToString);
    }

    void flip(){
        this.x *= -1;
        this.y *= -1;
        int buffer = this.x;
        this.x = this.y;
        this.y = buffer;
    }

    double distance(Point point) {
        int dx = this.x - point.x;
        int dy = this.y - point.y;
        return Math.sqrt(dx * dx + dy * dy);
    }

    @Override
    public String toString() {
        return String.format("(%d, %d)", x, y);
    }
}
