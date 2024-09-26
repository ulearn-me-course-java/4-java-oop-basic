package com.example.task01;

/**
 * Класс точки на плоскости
 */
public class Point {
    int x;
    int y;

    public Point(int x1, int y1){
        this.x = x1;
        this.y = y1;
    }

    public void flip(){
        int temp = x;
        x = -y;
        y = -temp;
    }

    public double distance(Point point){
        double dX = x - point.x;
        double dY = y - point.y;
        return Math.sqrt(dX*dX + dY*dY);
    }

    public String toString(){
        return "("+ x + "," + y + ")";
    }

    void print() {
        String pointToString = String.format("(%d, %d)", x, y);
        System.out.println(pointToString);
    }
}
