package com.example.task01;

/**
 * Класс точки на плоскости
 */
public class Point {
    private int x;
    private int y;

    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    private int getX(){
        return x;
    }
    private int getY(){
        return y;
    }

    void print() {
        String pointToString = String.format("(%d, %d)", x, y);
        System.out.println(pointToString);
    }

    void flip(){
        int z = y;
        y = x * -1;
        x = z * -1;
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
