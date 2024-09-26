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
        this.x = 0;
        this.y = 0;
    }

    public void flip(){
        int tmp = x;
        x = -y;
        y = -tmp;
    }

    public double distance(Point point){
        return Math.sqrt( (point.x - x)*(point.x - x) + (point.y - y)*(point.y - y) );
    }

    void print() {
        String pointToString = String.format("(%d, %d)", x, y);
        System.out.println(pointToString);
    }

    public String toString(){
        return String.format("(%d, %d)", x, y);
    }
}
