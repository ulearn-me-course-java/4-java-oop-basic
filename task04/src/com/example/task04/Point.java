package com.example.task04;

public class Point {
    final double x;
    final double y;

    Point(int x, int y ) {
        this.x = x;
        this.y = y;
    }
    public String toString() {
        return String.format("(%.1f, %.1f)", x, y);
    }

    double distance(Point point){
     double x2 = point.x;
     double y2 = point.y;
     return  Math.pow( Math.pow(x-x2, 2) + Math.pow(y - y2, 2), 0.5);
    }
}
