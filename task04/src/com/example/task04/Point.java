package com.example.task04;

public class Point
{
    private final int x;
    private final int y;

    public Point(int x, int y)
    {
        this.x = x;
        this.y = y;
    }

    public double getX() {return x;}

    public double getY() {return y;}

    public String toString()
    {
        return "(" + x + ", " + y + ")";
    }
}
