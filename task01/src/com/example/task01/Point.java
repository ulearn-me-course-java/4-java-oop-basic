package com.example.task01;

/**
 * Класс точки на плоскости
 */
public class Point {
    int x;
    int y;

    Point(){}
    Point(int x, int y){
        this.x = x;
        this.y = y;
    }
    void flip(){
        int tmp = x;
        x = -y;
        y = -tmp;
    }
    double distance(Point point){
        return Math.sqrt((x - point.x)*(x - point.x) + (y - point.y)*(y - point.y));
    }
    public String toString(){
        return String.format("(%d, %d)", x, y);
}
    void print() {
        String pointToString = String.format("(%d, %d)", x, y);
        System.out.println(pointToString);
    }
}
