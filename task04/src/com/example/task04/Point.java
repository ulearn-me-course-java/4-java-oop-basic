package com.example.task04;

/**
 * Класс точки на плоскости
 */
public class Point {
    final int x;
    final int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    double distance(Point point) {
        return Math.sqrt(Math.pow((x - point.x),2)+Math.pow((y - point.y),2));
    }

    public String toString(){
        String strX = String.valueOf(x);
        String strY = String.valueOf(y);
        return "("+strX+","+strY+")";
    }
}
