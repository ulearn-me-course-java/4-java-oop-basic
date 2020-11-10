package com.example.task04;

/**
 * Класс точки на плоскости
 */
public class Point
{
    final int x;
    final int y;

    Point()
    {
        x = 0;
        y = 0;
    }

    Point(int x, int y)
    {
        this.x = x;
        this.y = y;
    }

//    void print()
//    {
//        String pointToString = String.format("(%d, %d)", x, y);
//        System.out.println(pointToString);
//    }

//
//    double distance(Point point)
//    {
//        int dx = (int) Math.pow(point.x - x, 2);
//        int dy = (int) Math.pow(point.y - y, 2);
//        return Math.sqrt(dx + dy);
//    }

    public String toString()
    {
        return String.format("(%d, %d)", x, y);
    }
}