package com.example.task01;

/**
 * Класс точки на плоскости
 */
public class Point {
    double x;
    double y;
    public Point(double x, double y)
    {
        this.x = x;
        this.y = y;
    }
    void print() {
        String pointToString = String.format("(%d, %d)", x, y);
        System.out.println(pointToString);
    }
    void flip(){
        double temp = this.x;
        this.x = -y;
        this.y = -temp;
    }
    double distance(Point point){
        return Math.sqrt(Math.pow((this.x - point.x), 2) + Math.pow((this.y - point.y), 2));
    }
    public String toString(){
        String x = Double.toString(this.x);
        String y = Double.toString(this.y);
        return x + "," + y;
    }
}
