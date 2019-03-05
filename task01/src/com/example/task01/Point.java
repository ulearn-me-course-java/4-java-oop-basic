package com.example.task01;

import static java.lang.Math.pow;
/**
 * Класс точки на плоскости
 */
public class Point {
    int x;
    int y;

    Point(){
    }

    public Point(int i, int j){
        x = i;
        y = j;
    }

    void flip(){
        int temp = -x;
        x = -y;
        y = temp;
    }

    double distance(Point p){
        return Math.sqrt(pow(p.x - x, 2) + pow(p.y - y, 2));
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }

    void print() {
        String pointToString = String.format("(%d, %d)", x, y);
        System.out.println(pointToString);
    }
}
