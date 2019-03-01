package com.example.task04;

/**
 * Класс точки на плоскости
 */
public class Point {
    final int x;
    final int y;

    public Point(int X, int Y){
        x = X;
        y = Y;
    }

    public String toString(){ return "(" + this.x + ", " + this.y + ")"; }
}