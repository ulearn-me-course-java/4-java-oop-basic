package com.example.task01;

/**
 * Класс точки на плоскости
 */
public class Point {
    int x;
    int y;

    void print() {
        String pointToString = String.format("(%d, %d)", x, y);
        System.out.println(pointToString);
    }

    public void flip(){
        int t = x;
        x = y - (y + y);
        y = t - (t + t);
    }

    public double distance(Point point){
        int firstCathetus = Math.abs(this.x - point.x);
        int secondCathetus = Math.abs(this.y - point.y);
        return Math.sqrt(Math.pow(firstCathetus, 2) + Math.pow(secondCathetus, 2));
    }

    public String toString(){
        return String.format("(%d : %d)", x, y);
    }

    public Point() { }

    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }
}
