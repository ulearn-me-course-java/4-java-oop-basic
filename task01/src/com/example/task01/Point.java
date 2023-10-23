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
        int flipX = x;
        x = -y;
        y = -flipX;
    }

    public double distance(Point point){
        int differenceX = this.x - point.x;
        int differenceY = this.y - point.y;
        return Math.sqrt(Math.pow(differenceX,2) + Math.pow(differenceY,2));
    }

    void print() {
        System.out.println(this.toString());
    }
    public String toString(){
        return String.format("(%d, %d)", x, y);
    }
}
