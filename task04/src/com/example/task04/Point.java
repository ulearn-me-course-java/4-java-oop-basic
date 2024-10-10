package com.example.task04;

public class Point
{
    final int x;
    final int y;

    public Point(int x, int y)
    {
        this.x = x;
        this.y = y;
    }

    public double distance(Point point)
    {
        return Math.sqrt(Math.pow(this.x - point.x, 2) + Math.pow(this.y - point.y, 2));
    }

    public String toString()
    {
        StringBuilder str = new StringBuilder();
        str.append('(').append(x).append(", ").append(y).append(')');
        return str.toString();
    }

    void print()
    {
        String pointToString = String.format("(%x, %y)", x, y);
        System.out.println(pointToString);
    }
}