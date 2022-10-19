package com.example.task04;

/**
 * Класс точки на плоскости
 */
public class Point {
    final int x;
    final int y;

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }


    public String toString(){
        return String.format("(%d,%d)",getX(),getY());
    }
}
