package com.example.task01;

/**
 * Класс точки на плоскости
 */
public class Point {
    int x;
    int y;
    public Point(int x,int y){
        this.x = x;
        this.y = y;
    }

    void print() {
        String pointToString = String.format("(%d, %d)", x, y);
        System.out.println(pointToString);
    }
    void flip(){
        int num = -x;
        x = -y;
        y = num;
    }
    double distance(Point nextPoint){
        return Math.sqrt(Math.pow(nextPoint.x - this.x,2)+Math.pow(nextPoint.y - this.y,2));
    }
    @Override
    public String toString () {
        return String.format("(%s,%s)", this.x,this.y);
    }
}
