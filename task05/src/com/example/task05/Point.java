package com.example.task05;
import static java.lang.Math.pow;

class Point {

    private final double x;
    private final double y;

    Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    Point(Point p){
        this.x = p.x;
        this.y = p.y;
    }

    double getX() {
        return x;
    }

    double getY() {
    return y;
    }

    double getLength(Point point) {
        return Math.sqrt(pow(point.x - x, 2) + pow(point.y - y, 2));
    }

}
