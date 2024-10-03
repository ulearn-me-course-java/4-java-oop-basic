package com.example.task04;

/**
 * Класс точки на плоскости
 */
public class Point {
    private final int x;
    private final int y;

    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    public static Point MinX(Point p1, Point p2){
        if (p1.GetX() > p2.GetX()) return p2;
        else return p1;
    }

    public static Point MaxX(Point p1, Point p2){
        if (p1.GetX() > p2.GetX()) return p1;
        else return p2;
    }

    public double distance(Point point){
        return Math.sqrt(Math.pow(point.x - x, 2)  + Math.pow(point.y - y, 2));
    }

    public String toString(){
        return "(" + x + ", " + y + ")";
    }

    void print() {
        System.out.println(toString());
    }

    public int GetX(){return x;}
    public int GetY(){return y;}
}
