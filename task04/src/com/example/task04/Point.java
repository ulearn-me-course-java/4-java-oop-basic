package com.example.task04;

/**
 * Класс точки на плоскости
 */
public class Point {
    final double x;
    final double y;
    public Point(double x, double y){
        this.x = x;
        this.y = y;
    }

    public Point flip(){
        return new Point(-y,-x);
    }
    public double distance(Point nextPoint){
        return Math.sqrt(Math.pow(nextPoint.x - this.x,2)+Math.pow(nextPoint.y - this.y,2));
    }
    @Override
    public String toString () {
        return String.format("(%s,%s)", this.x,this.y);
    }
}
