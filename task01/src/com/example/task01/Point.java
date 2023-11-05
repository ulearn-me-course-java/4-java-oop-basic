package com.example.task01;

/**
 * Класс точки на плоскости
 */
public class Point{

    int x;
    int y;

    public Point(int X, int Y){
        x = X;
        y = Y;
    }

    public void flip(){
        int temp = x;
        x = (-1) * y;
        y = (-1) * temp;
    }

    public double distance(Point point){
        return Math.sqrt(Math.pow(point.x - this.x, 2) + Math.pow(point.y - this.y, 2));
    }

    @Deprecated
    void print() {
        String pointToString = String.format("(%d, %d)", x, y);
        System.out.println(pointToString);
    }

    public String toString() {
        return String.format("(%d, %d)", x, y);
    }
}
