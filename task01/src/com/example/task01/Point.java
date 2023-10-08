package com.example.task01;

/**
 * Класс точки на плоскости
 */
public class Point {
    public int x;
    public int y;

    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    public void flip(){
        int num = -1 * this.x;
        this.x = -1 * this.y;
        this.y = num;
    }

    public double distance(Point point){
        return Math.sqrt(Math.pow(x - point.x, 2) + Math.pow(y - point.y, 2));
    }

    public String toString(){
        return String.format("(%d, %d)", x, y);
    }

    public void print() {
        String pointToString = String.format("(%d, %d)", x, y);
        System.out.println(pointToString);
    }
}
