package com.example.task01;

/**
 * Класс точки на плоскости
 */
public class Point {
    int x;
    int y;

    Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    Point(){
        this(0,0);
    }

    void flip(){
        this.x+=y;
        this.y = this.x-this.y;
        this.x -= this.y;
        this.x*=-1;
        this.y*=-1;
    }

    double distance(Point p){
        return Math.sqrt(Math.pow(this.x-p.x,2)+Math.pow(this.y-p.y,2));
    }

    public String toString(){
        return "("+Integer.toString(this.x)+","+Integer.toString(this.y)+")";
    }

    void print() {
        String pointToString = String.format("(%d, %d)", x, y);
        System.out.println(pointToString);
    }
}
