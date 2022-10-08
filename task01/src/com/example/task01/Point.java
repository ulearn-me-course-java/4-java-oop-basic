package com.example.task01;

/**
 * Класс точки на плоскости
 */
public class Point {
    int x;
    int y;
    Point(int xCoordinate, int yCoordinate) {
        x = xCoordinate;
        y = yCoordinate;
    }
    Point() {
    }

    void print() {
        String pointToString = String.format("(%d, %d)", x, y);
        System.out.println(pointToString);
    }
    public String toString(){
        return String.format("(%d, %d)", x, y);
    }
    void flip(){
        int temp = x;
        x = -y;
        y = -temp;
    }
    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
    double distance(Point p1){
        return Math.sqrt(Math.pow((this.getX() - p1.getX()), 2) + Math.pow((this.getY() - p1.getY()), 2));
    }
}
