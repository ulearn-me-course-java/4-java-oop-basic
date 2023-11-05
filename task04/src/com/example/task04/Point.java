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

    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }

    double distance(Point point){
        double a = Math.pow((x - point.x), 2);
        double b = Math.pow((y - point.y), 2);
        return Math.sqrt(a + b);
    }

    @Override
    public String toString() {
        return "(" + x +
                ", " + y +
                ')';
    }
}
