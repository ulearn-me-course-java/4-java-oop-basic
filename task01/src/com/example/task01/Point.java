package com.example.task01;

/**
 * Класс точки на плоскости
 */
public class Point {
    int x;
    int y;

    public Point(int x, int y)
    {
        this.x = x;
        this.y = y;
    }

    void flip()
    {
        int temp = x;
        x = -y;
        y = -temp;
    }

    double distance(Point point)
    {
        return Math.sqrt(Math.pow(point.x - x, 2) + Math.pow(point.y - y, 2));
    }

    public String toString()
    {
        return "(" + x + ", " + y + ")";
    }

}