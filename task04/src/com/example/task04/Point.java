package com.example.task04;

public class Point
{
    public final int x;
    public final int y;

    public Point(int x, int y)
    {
        this.x = x;
        this.y = y;
    }
    public double distance(Point point) // должен считать расстояние между двумя точками
    {
        return Math.sqrt(Math.pow(point.x - x, 2) + Math.pow(point.y - y, 2));
    }
    public String toString()
    {
        return String.format("(%d, %d)", x, y);
    }
}
