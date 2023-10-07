package com.example.task01;

/**
 * Класс точки на плоскости
 */
public class Point {
    int x, y;
    public Point(int x, int y){
        this.x= x;
        this.y = y;
    }

    public  Point(){
    }

    public void flip(){
        int temp = this.x;
        this.x = -this.y;
        this.y = -temp;
    }

    public double distance(Point dot){
        return (Math.sqrt((Math.pow(dot.x - this.x, 2)) + (Math.pow(dot.y - this.y, 2))));
    }

    public String toString(){
        return "(" + this.x + ", " + this.y + ")";
    }

    void print() {
        String pointToString = String.format("(%d, %d)", x, y);
        System.out.println(pointToString);
    }
}
