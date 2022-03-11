package com.example.task01;

/**
 * Класс точки на плоскости
 */
public class Point {
    int x;
    int y;

    void print() {
        String pointToString = String.format("(%d, %d)", x, y);
        System.out.println(pointToString);
    }
    void flip()
    {
        this.x += 3;
        this.y += 3;
    }
    double distance(Point p2)
    {
        double result = (p2.x - this.x) + (p2.y - this.y);
        return result;
    }
    public String toString()
    {
        return "(" + this.x +", " + this.y + ")";
    }
}
