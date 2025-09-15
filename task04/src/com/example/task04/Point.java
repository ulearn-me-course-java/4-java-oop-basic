package com.example.task04;

/**
 * Класс точки на плоскости
 */
public class Point {
    final int x;
    final int y;

    void print() {
        String pointToString = toString();
        System.out.println(pointToString);
    }
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public double distance(Point point){
        double d = Math.sqrt(Math.pow(point.x - this.x,2) + Math.pow(point.y - this.y,2));


        return d;

        //d = √((x₂ - x₁)² + (y₂ - y₁)²)
    }
    public String toString(){
        return "(" + this.x + "," + this.y + ")";
    }
    public int getX(){
        return this.x;
    }
    public int getY(){
        return this.y;
    }
}
