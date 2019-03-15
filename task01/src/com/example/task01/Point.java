package com.example.task01;

/**
 * Класс точки на плоскости
 */
public class Point {
    int x;
    int y;

    Point(int x, int y){
        this.x= x;
        this.y = y;
    }

    public String toString() {
        String pointToString = String.format("(%d, %d)", x, y);
        return pointToString;
    }
    double distance(Point point) {
        return Math.sqrt(Math.pow(point.x - this.x, 2) + Math.pow(point.y - this.y, 2));
    }
    void flip(){
        int temp = -x;
        x = -y;
        y = temp;
    }
}
