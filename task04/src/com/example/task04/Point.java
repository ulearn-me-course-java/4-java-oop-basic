package com.example.task04;

public class Point {
    final  int x;
    final  int y;
    public Point (int x, int y)
    {
        this.x = x;
        this.y = y;
    }
    public int getX()
    {
        return x;
    }
    public int getY()
    {
        return y;
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
