package com.example.task01;

/**
 * Класс точки на плоскости
 */
public class Point {
    public int x;
    public int y;
    public Point(){}
    public Point(int x, int y)
    {
        this.x = x;
        this.y = y;
    }
    void flip(){
        int value = x;
        x = -y;
        y = -value;
    }
    double distance(Point point){
        return Math.sqrt(Math.pow(x - point.x, 2) + Math.pow(y - point.y, 2));
    }
    public String toString(){
        return String.format("(%d, %d)", x, y);
    }
    void print() {
        //String pointToString = String.format("(%d, %d)", x, y);
        System.out.println(toString());
    }
}
