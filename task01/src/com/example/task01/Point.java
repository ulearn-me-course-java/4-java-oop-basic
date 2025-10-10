
package com.example.task01;

import static java.lang.Math.*;

/**
 * Класс точки на плоскости
 */
public class Point {
    public int x;
    public int y;
    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    public Point(){}

    public void flip(){
        x *= -1;
        y *= -1;
        int temp = y;
        y = x;
        x = temp;
    }

    public double distance(Point point){
        double result = sqrt(abs(((double) this.x - point.x) * ((double) this.x - point.x) + ((double) this.y - point.y) * ((double) this.y - point.y)));
        return result;
    }

    public String toString(){
        return String.format("(%d, %d)", String.valueOf(x), String.valueOf(y));
    }
}
