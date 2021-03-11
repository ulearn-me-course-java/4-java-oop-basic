package com.example.task01;

/**
 * Класс точки на плоскости
 */
public class Point {
    int x;
    int y;

    public Point(){
    }

    public Point(int newX, int newY){
        x = newX;
        y = newY;
    }
    void flip(){
        int newX = y * -1;
        y = x * -1;
        x = newX;
    }

    double distance(Point point){
        return  Math.sqrt( Math.pow((point.x - x),2) + Math.pow((point.y - y),2));
    }

    void print() {
        String pointToString = String.format("(%d, %d)", x, y);
        System.out.println(pointToString);
    }

    public String toString(){
        return "("+x+","+y+")";
    }
}
