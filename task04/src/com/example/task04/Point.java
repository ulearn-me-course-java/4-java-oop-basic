package com.example.task04;

public class Point {
    final int x;
    final int y;

    Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    double distance(Point point){
        int diffX = Math.abs(point.x - x);
        int diffY = Math.abs(point.y - y);
        return Math.sqrt(diffX * diffX + diffY * diffY);
    }

    public String toString(){
        return x + " " + y;
    }

    void print() {
        String pointToString = String.format("(%d, %d)", x, y);
        System.out.println(pointToString);
    }
}
