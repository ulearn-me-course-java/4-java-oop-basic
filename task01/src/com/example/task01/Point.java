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

    void flip() {
        int k = -x;
        x = -y;
        y = k;
    }

    double distance(Point point) {
        return Math.sqrt(Math.pow((x - point.x),2)+Math.pow((y - point.y),2));
    }

    public String toString(){
        String strX = String.valueOf(x);
        String strY = String.valueOf(y);
        return "("+strX+","+strY+")";
    }
    void print() {
        String pointToString = String.format("(%d, %d)", x, y);
        System.out.println(pointToString);
    }
}
