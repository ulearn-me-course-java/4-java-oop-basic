package com.example.task01;
import java.lang.Math;

/**
 * Класс точки на плоскости
 */
public class Point {
    private int x;
    private int y;

    public Point (int x, int y){
        this.x = x;
        this.y = y;
    }
    public void flip () {
        int holder = this.x;
        this.x = - this.y;
        this.y = - holder;
    }
    public double distance (Point point) {
        return Math.sqrt(Math.pow(this.x - point.x, 2) + Math.pow(this.y - point.y, 2));
    }

    public String toString () {
        return String.format("(%s, %s)",this.x,this.y);
    }
}
