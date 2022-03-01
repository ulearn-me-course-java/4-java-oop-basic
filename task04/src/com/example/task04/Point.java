package com.example.task04;

/**
 * Класс точки на плоскости
 */
public class Point {
    private final int x;
    private final int y;
    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    public Point flip(){
        int num = -x;
        return new Point(-y,num);
    }
    public double distance(Point nextPoint){
        return Math.sqrt(Math.pow(nextPoint.x - this.x,2)+Math.pow(nextPoint.y - this.y,2));
    }
    @Override
    public String toString () {
        return String.format("(%s,%s)", this.x,this.y);
    }
}
