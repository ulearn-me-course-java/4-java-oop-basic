package com.example.task01;

/**

 Класс точки на плоскости*/
public class Point
{
    int x;
    int y;
    public Point (int xCord, int yCord)
    {
        x = xCord;
        y = yCord;
    }
    void flip()
    {
        int temp = x;
        x = y * -1;
        y = temp * -1;
    }
    double distance(Point point) {
        return Math.sqrt(Math.pow(point.x - x, 2) + Math.pow(point.y - y, 2));
    }
    public String toString() {
        return ("(" + x + ", " + y + ")");
    }
}