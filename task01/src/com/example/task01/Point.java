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
        int firstKatet = Math.abs(this.x - point.x);
        int secondKatet = Math.abs(this.y - point.y);
        return Math.sqrt(Math.pow(firstKatet, 2) + Math.pow(secondKatet, 2));
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
