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

    public Point(){

    }

    public void flip(){
        int temp = x;
        x = -y;
        y = -temp;
    }

    public double distance(Point point){
        return Math.sqrt(Math.pow(this.x - point.x, 2) + Math.pow(this.y - point.y, 2));
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        str.append('(').append(x).append(", ").append(y).append(')');
        return str.toString();
    }

    void print() {
        String pointToString = String.format("(%d, %d)", x, y);
        System.out.println(pointToString);
    }
}
