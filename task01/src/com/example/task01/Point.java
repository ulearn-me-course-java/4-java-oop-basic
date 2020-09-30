package com.example.task01;

/**
 * Класс точки на плоскости
 */
public class Point {
    int x;
    int y;

    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    public Point(){
        x = 0;
        y = 0;
    }

    public void flip(){
        int tmp = x;
        x = -y;
        y = -tmp;
    }

    public double distance(Point point){
        return Math.sqrt(Math.pow(x- point.x,2)+Math.pow(y- point.y,2));
    }

    @Override
    public String toString() {
        return "("+x+","+y+")";
    }

    void print() {
        String pointToString = String.format("(%d, %d)", x, y);
        System.out.println(pointToString);
    }
}
