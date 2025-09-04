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

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void flip(){
        int  temp = x;
        x = -y;
        y = -temp;
    }

    public double distance(Point p){
        return Math.sqrt(Math.pow(p.x-x, 2) + Math.pow(p.y-y, 2));
    }

    public String toString(){
        return "("+x+","+y+")";
    }

}
