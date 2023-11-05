package com.example.task01;

/**
 * Класс точки на плоскости
 */
public class Point {
    public Point(){}
    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }
    int x;
    int y;

    public void flip(){
        int temp = x;
        x = -y;
        y = -temp;
    }
    public double distance(Point point){
        return Math.sqrt(Math.pow(point.x - x, 2) + Math.pow(point.y - y, 2));
    }
    void print() {
        String pointToString = String.format("(%d, %d)", x, y);
        System.out.println(pointToString);
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
