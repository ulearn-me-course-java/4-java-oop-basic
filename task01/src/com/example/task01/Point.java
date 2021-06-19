package com.example.task01;

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

    public void flip(){
        int temp = x;
        x = y * -1;
        y = temp * -1;
    }

    public double distance(Point point){
        return Math.sqrt(Math.pow(x - point.x, 2) + Math.pow(y - point.y, 2));
    }

    @Override
    public String toString(){
        return String.format("(%d, %d)", x, y);
    }

    void print() {
        String pointToString = this.toString();
        System.out.println(pointToString);
    }
}
