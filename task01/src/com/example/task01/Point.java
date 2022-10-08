package com.example.task01;

public class Point {
    int x;
    int y;

    public Point(int x, int y)
    {
        this.x = x;
        this.y = y;
    }

    void flip()
    {
        int z = x < 0 ? x : -x;
        x = y < 0 ? y : -y;
        y = z;
    }

    double distance(Point point)
    {
        return Math.sqrt((x - point.x) * (x - point.x) + (y - point.y) * (y - point.y));
    }

    public String toString()
    {
        return  String.format("(%d, %d)", x, y);
    }

    void print() {
        System.out.println(toString());
    }
}
