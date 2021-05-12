package com.example.task01;

/**
 * Класс точки на плоскости
 */
public class Point {
    int x;
    int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public Point() {
        this.x = 0;
        this.y = 0;
    }
    void flip() {
        int p = this.x;
        this.x = (-1)*this.y;
        this.y = (-1)*p;
    }
    double distance(Point point) {
        int distance_x = Math.abs(point.x - this.x);
        int distance_y = Math.abs(point.y - this.y);
        return Math.sqrt(Math.pow(distance_x, 2) + Math.pow(distance_y, 2));
    }
    public String toString() {
        return (String.format("(%d, %d)", x, y));
    }
    void print() {
        String pointToString = String.format("(%d, %d)", x, y);
        System.out.println(pointToString);
    }
}

