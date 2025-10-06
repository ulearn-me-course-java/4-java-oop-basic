package com.example.task01;

import java.text.MessageFormat;

/**
 * Класс точки на плоскости
 */
public class Point {
    private int x;
    private int y;

    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }

    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    public void flip(){
        int temp = x;
        x = -y;
        y = -temp;
    }

    public double distance(Point point){
        double Xd = Math.abs(point.x - x);
        double Yd = Math.abs(point.y - y);

        return Math.sqrt(Math.pow(Xd, 2) + Math.pow(Yd, 2));
    }

    public String toString(){
        return String.format("(%d,%d)",x,y);
    }



}
