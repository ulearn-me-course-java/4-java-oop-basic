package com.example.task04;

public class Point {
    final int x;
    final int y;

    public Point(int X, int Y){
        x=X;
        y=Y;
    }
    public String toString(){
        return "(" + x + ", " + y + ")";
    }
}
