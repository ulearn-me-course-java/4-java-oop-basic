package com.example.task04;

public final class Point {
    int x;
    int y;

    public Point(){
    }
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public String toString(){
        return "(" + Integer.toString(x) + "," + Integer.toString(y) + ")";
    }
    void print() {
        String pointToString = String.format("(%d, %d)", x, y);
        System.out.println(pointToString);
    }
}
