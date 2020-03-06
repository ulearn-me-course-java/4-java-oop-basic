package com.example.task01;

/**
 * Класс точки на плоскости
 */
public class Point {
    int x;
    int y;

    public Point(int X, int Y){
        x=X;
        y=Y;
    }

     void flip(){
        int valueX=x;
        int valueY=y;
        x=-valueY;
        y=-valueX;
    }

    double distance(Point point){
        return Math.sqrt(Math.pow(point.x-x,2)+Math.pow(point.y-y,2));
    }

    public String toString(){
        return "(" + x + ", " + y + ")";
    }
    void print() {
        String pointToString = String.format("(%d, %d)", x, y);
        System.out.println(pointToString);
    }
}
