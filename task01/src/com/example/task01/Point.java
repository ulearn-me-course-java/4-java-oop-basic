package com.example.task01;

public class Point {
    public int x;
    public int y;

    public Point(){

    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public static Point createPiont(int x, int y) {
        return new Point(x,y);
    }
    public void flip() {
        int a = x;
        x = -y;
        y = -a;
    }

    public double distance(Point point) {

        return Math.sqrt(Math.pow((x - point.x), 2) + Math.pow((y - point.y), 2));
    }

    public String toString() {
        return "(" + Integer.toString(x) + " , " + Integer.toString(y) + ")";
    }

    public void print() {
        String pointToString = String.format("(%d, %d)", x, y);
        System.out.println(pointToString);
    }
}
