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

    void flip(){
        int temp = x;
        x = -y;
        y = -temp;
    }

    double distance(Point point){
        int deltaX = this.x - point.x;
        int deltaY = this.y - point.y;
        return Math.sqrt(deltaX * deltaX + deltaY * deltaY);
    }

    public String toString() {
        return String.format("(%d, %d)", x, y);
    }

    void print() {
        String pointToString = String.format("(%d, %d)", x, y);
        System.out.println(pointToString);
    }
}
