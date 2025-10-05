package com.example.task01;

/**
 * Класс точки на плоскости
 */
public class Point {
    int x;
    int y;

    void flip(){
        x *= (-1);
        y *= (-1);
        //по заданию нужно ещё их поменять местами, но этого не нужно ибо точка уже развёрнута на 180
        // но без этого не засчитывается тест
        int swap = x;
        x = y;
        y = swap;
    }
    double distance(Point point){
        return Math.sqrt(Math.pow(Math.abs(x - point.x), 2) + Math.pow(Math.abs(y - point.y), 2));
    }

    void print() {
        String pointToString = String.format("(%d, %d)", x, y);
        System.out.println(pointToString);
    }
    public String toString() {
        String pointToString = String.format("(%d, %d)", x, y);
        return pointToString;
    }

    public Point(){
        this.x = 0;
        this.y = 0;
    }
    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }
}
