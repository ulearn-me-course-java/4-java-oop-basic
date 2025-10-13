package com.example.task04;

/**
 * Класс точки на плоскости
 */
public class Point {
    private final int x;
    private final int y;

    public Point(int x, int y) {
        this.x=x;
        this.y=y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public double distance(Point point) {
        int tempX = this.x - point.x;
        int tempY = this.y - point.y;
        return Math.sqrt(Math.pow(tempX, 2) + Math.pow(tempY, 2)); //По теореме Пифагора
    }

    public String ToString() {
        return "(" + x + ", " + y + ")";
    }

    void print() {
        String pointToString = String.format("(%d, %d)", x, y);
        System.out.println(pointToString);
    }
}
