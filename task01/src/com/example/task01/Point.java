package com.example.task01;

import static java.lang.Math.sqrt;

/**
 * Класс точки на плоскости
 */
public class Point {
    int x;
    int y;

    Point(int x, int y)
    {
        this.x = x;
        this.y = y;
    }

    void print() {
        String pointToString = String.format("(%d, %d)", x, y);
        System.out.println(pointToString);
    }

    void flip()
    {
        int temp = x;
        x = y * -1;
        y = temp * -1;
    }

    double distance(Point point)
    {
        double dist = 0;

        dist = sqrt(Math.pow((double)x - (double)point.x, 2) + Math.pow((double)y - (double)point.y, 2));

        return dist;
    }

    public String toString()
    {
        String pointToString = String.format("(%d, %d)", x, y);

        return pointToString;
    }
}
