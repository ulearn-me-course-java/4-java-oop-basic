package com.example.task01;

/**
 * Класс точки на плоскости
 */
public class Point {
    int x;
    int y;
    public Point()
    {
        this.x = 0;
        this.y = 0;

    }
    public Point(int x,int y)
    {
        this.x = x;
        this.y = y;

    }
    public void flip()
    {
        int temp = this.x;
        this.x = -this.y;
        this.y = -temp;

    }
    public double distance(Point point)
    {
        double distance = Math.sqrt(Math.pow((point.x - this.x),2) + Math.pow((point.y - this.y),2));
        return distance;
    }
    public String toString()
    {
        String result = Integer.toString(this.x) + Integer.toString(this.y);
        return result;
    }
    void print() {
        String pointToString = String.format("(%d, %d)", x, y);
        System.out.println(pointToString);
    }
}
