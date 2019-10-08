package com.example.task01;

/**
 * Класс точки на плоскости
 */
public class Point {
    int x;
    int y;

    Point() {
        this.x = 0;
        this.y = 0;
    }

    Point(int х, int у) {
        this.x = х;
        this.y = у;
    }

    void flip() {
        int z = x;
        this.x = -this.y;
        this.y = -z;
    }

    double distance(Point point) {
        return Math.sqrt(Math.pow(this.x - point.x, 2) + Math.pow(this.y - point.y, 2));
    }

    public String toString() {
        return "(" + this.x + ", " + this.y + ")";
    }

    void print() {
        String pointToString = String.format("(%d, %d)", x, y);
        System.out.println(pointToString);
    }
}
