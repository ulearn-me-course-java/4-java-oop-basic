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

    void print() {
        String pointToString = String.format("(%d, %d)", x, y);
        System.out.println(pointToString);
    }

    void flip(){
        int auxiliaryVariable = x;
        x = -y;
        y = -auxiliaryVariable;
    }

    double distance(Point point){
        double distanceByX = this.x - point.x;
        double distanceByY = this.y - point.y;
        return Math.sqrt(distanceByX*distanceByX + distanceByY*distanceByY);
    }

    public String toString(){
        return "("+x+", "+y+")";
    }
}
