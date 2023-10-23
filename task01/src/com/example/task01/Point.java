package com.example.task01;

/**
 * Класс точки на плоскости
 */
public class Point {
    private int x;
    private int y;

    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    public void flip() {
        int temp = x;
        this.x = -this.y;
        this.y = -temp;
    }

    public double distance(Point point) {
        double xDistance = Math.pow(this.x - point.x, 2);
        double yDistance = Math.pow(this.y - point.y, 2);
        return Math.sqrt(xDistance + yDistance);
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
