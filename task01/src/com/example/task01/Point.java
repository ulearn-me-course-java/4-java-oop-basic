package com.example.task01;

/**
 * Класс точки на плоскости
 */
public class Point {
    int x;
    int y;

    void print() {
        String pointToString = toString();
        System.out.println(pointToString);
    }
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public void flip(){
        int temp = x;
        this.x = -this.y;
        this.y = -temp;
    }
    public double distance(Point point){
        double d = Math.sqrt(Math.pow(point.x - this.x,2) + Math.pow(point.y - this.y,2));


        return d;

        //d = √((x₂ - x₁)² + (y₂ - y₁)²)
    }
    public String toString(){
        return "(" + this.x + "," + this.y + ")";
    }
}
