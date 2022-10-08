package com.example.task01;
/**
 * Класс точки на плоскости
 */
public class Point {
    int x;
    int y;

    public Point(int x,int y){
        this.x = x;
        this.y = y;
    }
    void print() {
        String pointToString = String.format("(%d, %d)", x, y);
        System.out.println(pointToString);
    }
    void flip(){
        int c = -x;
        x = -y;
        y = c;
    }
    double distance(Point point){
        return Math.pow(Math.pow(Math.abs(this.y - point.y),2) + Math.pow(Math.abs(this.x - point.x),2),0.5);
    }
    public String toString(){
        return String.format("(%s1, %s2)", this.x, this.y);
    }
}
