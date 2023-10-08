package com.example.task01;

/**
 * Класс точки на плоскости
 */
public class Point {
    int x;
    int y;
    public void flip(){
        int extraX = this.x;
        this.x = -this.y;
        this.y = -extraX;
    }
    public double distance(Point point){
        double distance = Math.sqrt(Math.pow((this.x - point.x), 2.0) + Math.pow((this.y - point.y), 2.0));
        return distance;
    }

    public String toString(){
        String pointx = Integer.toString(this.x);
        String pointy = Integer.toString(this.y);
        return pointx + ", " + pointy;
    }
    void print() {
        String pointToString = String.format("(%d, %d)", x, y);
        System.out.println(pointToString);
    }
}
