package com.example.task01;

public class Point {

    int x;
    int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public void flip() {
        int temp = x;
        x = -y;
        y = -temp;
    }
    public double distance(Point point) {

        double thisX = x - point.x;
        double thisY = y - point.y;

        return Math.sqrt(thisX * thisX + thisY * thisY);
    }

    public String toString() {

        return String.format("( %d, %d )", x, y);
    }
    void print() {
        String pointToString = String.format("( %d, %d )", x, y);
        System.out.println(pointToString);
    }
}
