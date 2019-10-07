package com.example.task04;

/**
 * Класс точки на плоскости
 */
public class Point {
    final int x;
    final int y;

    Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    Point(){
        this(0,0);
    }

    final double distance(final Point p){
        return Math.sqrt(Math.pow(this.x-p.x,2)+Math.pow(this.y-p.y,2));
    }

    public final String toString(){
        return "("+Integer.toString(this.x)+","+Integer.toString(this.y)+")";
    }

    void print() {
        String pointToString = String.format("(%d, %d)", x, y);
        System.out.println(pointToString);
    }
}
