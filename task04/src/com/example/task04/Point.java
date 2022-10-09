package com.example.task04;

public class Point {
    private int x;
    private int y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    void print() {
        System.out.println(toString());
    }

    void flip() {
        int temp = -(this.x);
        this.x = -(this.y);
        this.y = temp;
    }

    double distance (Point point) {
        return Math.sqrt(Math.pow((this.x - point.x),2) + Math.pow((this.y - point.y),2));
    }

    public String toString () {
        return String.format("(%d,%d)",this.x,this.y);
    }
}
