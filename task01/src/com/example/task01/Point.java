package com.example.task01;

/**
 * Класс точки на плоскости
 */
public class Point {

    Point() {}

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    int x, y;

    void flip(){
        int temp = x;
        x = -y;
        y = -temp;
    }

    double distance(Point point){
        if (point == null)
            throw new NullPointerException("Point is null");
        return Math.sqrt((x - point.x) * (x - point.x) + (y - point.y) * (y - point.y));
    }

    void print() {
        String pointToString = String.format("(%d, %d)", x, y);
        System.out.println(pointToString);
    }

    @Override
    public String toString() {
        return String.format("(%d, %d)", x, y);
    }
}
