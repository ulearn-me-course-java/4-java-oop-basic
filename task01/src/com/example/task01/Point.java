package com.example.task01;

/**
 * Класс точки на плоскости
 */
public class Point {
    int x;
    int y;

    public Point(int X, int Y){
        x = X;
        y = Y;
    }

    void flip(){
        int tmpx = x;
        x = -y;
        y = -tmpx;
    }

    double distance(Point point){
        double dx = (point.x - this.x) * (point.x - this.x);
        double dy = (point.y - this.y)*(point.y - this.y);

        return Math.sqrt(dx+dy);
    }

    public String toString(){ return "(" + this.x + ", " + this.y + ")"; }
}
