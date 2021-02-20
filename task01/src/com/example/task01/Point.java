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
        x = 0;
        y = 0;
    }

    public void flip(){
        int temp = x;
        x = -y;
        y = - temp;
    }

    //sqrt((x1 - x2)^2 + (y1 - y2)^2)
    public double distance(Point point) {
        return Math.sqrt((this.x - point.x) * (this.x - point.x) + (this.y - point.y) * (this.y - point.y));
    }

    void print() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return String.format("(%d, %d)", x, y);
    }
}
