package com.example.task04;
public class Point {
    int x;
    int y;
    public Point() {
        x = 0;
        y = 0;
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
        return Math.pow(Math.pow(Math.abs(x - point.x),2) + Math.pow(Math.abs(y - point.y),2), 0.5);
    }

    public String toString(){
        return  "("+x+","+y+")";
    }
    void print() {
        String pointToString = String.format("(%d, %d)", x, y);
        System.out.println(pointToString);
    }

    public float getAngularCoefficient(Point point){
        return (float)(point.y - y)/(point.x - x);
    }
}
