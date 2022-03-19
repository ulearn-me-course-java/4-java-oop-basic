package com.example.task01;

/**
 * Класс точки на плоскости
 */
public class Point {
    int x;
    int y;

    public Point(){
        this(0, 0);
    }
    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    public void flip(){
        int temp = -x;
        x = -y;
        y = temp;
    }
    double distance(Point point){
        double xSide = Math.abs(x - point.x);
        double ySide = Math.abs(y - point.y);
        double result = Math.sqrt(Math.pow(xSide, 2) + Math.pow(ySide, 2));

        return result;
    }
    void print() {
        String pointToString = String.format("(%d, %d)", x, y);
        System.out.println(pointToString);
    }
    public String toString(){
        return "(" + x + ", " + y + ")";
    }
}
