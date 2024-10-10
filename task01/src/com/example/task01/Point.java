package com.example.task01;

/**
 * Класс точки на плоскости
 */
public class Point {
    int x;
    int y;
    public Point (int x, int y)
    {
       this.x = x;
       this.y = y;
    }

    void flip ()
    {
        x = -x;
        y = -y;
        int val = x;
        x = y;
        y = val;
    }
    double distance(Point point)
    {
        double x2 = Math.pow(x - point.x, 2);
        double y2 = Math.pow(y - point.y, 2);
        return Math.sqrt(x2+y2);
    }
    public String toString()
    {
       return String.format("(%d, %d)", x, y);

    }

}
