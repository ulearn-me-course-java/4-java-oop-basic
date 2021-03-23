package com.example.task01;


public class Point {
    int x;
    int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point() {
    }


    void print() {
        String pointToString = String.format("(%d, %d)", x, y);
        System.out.println(pointToString);
    }

    void flip(){
        int tmp = x;
        x=-y;
        y=-tmp;
    }

    double distance(Point point){
        return Math.sqrt(Math.pow((x - point.x), 2) + Math.pow((y - point.y) , 2));
    }

    @Override
    public String toString(){
        return "(" + x + "," + y + ")";
    }
}
