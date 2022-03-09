package com.example.task01;



/**
 * Класс точки на плоскости
 */
public class Point {
    int x;
    int y;

    public Point(int X,int Y){
        x = X;
        y = Y;
    }

    public void flip(){
        int temp = y*-1;
        y = x*-1;
        x = temp;
    }

    public double distance(Point point){
        return Math.sqrt(Math.pow(point.x-x,2)+Math.pow(point.y-y,2));
    }

    public String toString(){
        String strX = String.valueOf(x);
        String strY = String.valueOf(y);
        return "(" + strX +","+ strY + ")";
    }

    void print() {
        String pointToString = String.format("(%d, %d)", x, y);
        System.out.println(pointToString);
    }
}
