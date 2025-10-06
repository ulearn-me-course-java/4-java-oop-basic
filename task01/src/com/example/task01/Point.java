package com.example.task01;

public class Point
{
    int x;
    int y;

    public Point()
    {
        x = 0;
        y = 0;
    }

    void flip()
    {
        int temp = x;
        x = -y;
        y = -temp;
    }

    double distance(Point point)
    {
        double distX = Math.pow(x-point.x,2);
        double distY = Math.pow(y-point.y,2);
        return Math.sqrt(distY + distX); //d=√(Xb-Xa)^2+(Yb-Ya)^2)
    }

    public String toString()
    {
        return String.format("%d %d",x, y);
    }

    void print()
    {
        String pointToString = String.format("(%d, %d)", x, y);
        System.out.println(pointToString);
    }
}