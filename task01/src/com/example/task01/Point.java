package com.example.task01;

/**
 * Класс точки на плоскости
 */
public class Point {
    int x;
    int y;

    public Point(){

    }

    public Point(int _x, int _y){
        x = _x;
        y = _y;
    }

    public void flip(){
        int temp = -x;
        x = -y;
        y = temp;
    }

    public double distance(Point point){
        double x0 = Math.pow(point.x - x, 2);
        double y0 = Math.pow(point.y - y, 2);

        return Math.sqrt(x0 + y0);
    }

    public String toString(){
        return String.format("(%d, %d)", x, y);
    }

    void print() {
        String pointToString = String.format("(%d, %d)", x, y);
        System.out.println(pointToString);
    }
}
