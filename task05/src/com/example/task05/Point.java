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

    public double getX()
    {
        return this.x;
    }

    public double getY()
    {
        return this.y;
    }

    public double getLength(Point point)
    {
        double x0 = Math.pow(point.x - x, 2);
        double y0 = Math.pow(point.y - y, 2);

        return Math.sqrt(x0 + y0);
    }

}
