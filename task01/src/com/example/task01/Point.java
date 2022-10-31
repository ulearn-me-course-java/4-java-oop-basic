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

    public void flip(){
        int a = -x;
        x = -y;
        y = a;
    }

    @Override
    public String toString() {
        return String.format("(%d, %d)", x, y);
    }

    public double distance(Point p){
        return Math.sqrt(Math.pow(p.x - this.x, 2) + Math.pow(p.y - this.y, 2));
    }

    void print() {
        System.out.println(this.toString());
    }
}
