package com.example.task01;

/**
 * Класс точки на плоскости
 */
public class Point {

    int x;
    int y;

    public Point() {
        this.x = x;
        this.y = y;
    }
    public void flip() {
        int temp = this.x;
        this.x = -this.y;
        this.y= -temp;
    }

    public double distance(Point point) {
        int tempX = this.x - point.x;
        int tempY = this.y - point.y;
        return Math.sqrt(Math.pow(tempX, 2) + Math.pow(tempY, 2)); //По теореме Пифагора
    }

    public String toString() {
        return "(" + x + ", " + y + ")";
    }

    void print() {
        String pointToString = String.format("(%d, %d)", x, y);
        System.out.println(pointToString);
    }
}