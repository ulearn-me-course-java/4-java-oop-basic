package com.example.task01;

import com.sun.javafx.binding.StringFormatter;

/**
 * Класс точки на плоскости
 */
public class Point {
    int x;
    int y;

    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }
    public Point(){}

    void print() {
        String pointToString = String.format("(%d, %d)", x, y);
        System.out.println(pointToString);
    }
    void flip(){
        int temp = x;

        x = -y;
        y = -temp;
    }
    double distance(Point point){
        int new_x = Math.abs(x - point.x);
        int new_y = Math.abs(y - point.y);

        return  Math.sqrt(new_x * new_x + new_y * new_y);
    }
    public String toString(){
        return String.format("(%d, %d)", x, y);
    }
}
