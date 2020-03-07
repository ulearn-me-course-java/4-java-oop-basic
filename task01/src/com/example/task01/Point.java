package com.example.task01;

/**
 * Класс точки на плоскости
 */
public class Point {
    int x;
    int y;


    public Point(int x, int y) {

        this.x = x;
        this.y = y;
    }

    Point() {

    }

    void print() {
        String pointToString = String.format("(%d, %d)", x, y);
        System.out.println(pointToString);
    }
    void flip(){
        int a = this.x*(-1);
        this.x = this.y*(-1);
        this.y = a;
    }

    double distance(Point point){
        return Math.sqrt(Math.pow((point.x-this.x),2)+Math.pow((point.y-this.y),2));
    }

    public String toString(){
        return "("+this.x+" , "+y+")";
    }

}
