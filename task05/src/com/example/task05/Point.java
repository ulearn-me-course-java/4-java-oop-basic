package com.example.task05;

public class Point
{
    private double x;
    private double y;

    public Point(double x, double y)
    {
        this.x = x;
        this.y = y;
    }

    public double getX() {return x;}

    public double getY() {return y;}

    public double getLength(Point point)
    {
        return Math.sqrt(Math.pow(point.getX() - x, 2) + Math.pow(point.getY() - y, 2));
    }
}
