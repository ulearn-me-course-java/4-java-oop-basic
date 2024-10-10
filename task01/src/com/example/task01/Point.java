package com.example.task01;

public class Point {
    int x;
    int y;

    Point (){};
    Point(int x, int y ) {
        this.x = x;
        this.y = y;
    }
    public String toString() {
        return String.format("(%d, %d)", x, y);
    }
    void flip(){
        int temp = x;
        x = -y;
        y = -temp;
    }
    double distance(Point point){
     int x2 = point.x;
     int y2 = point.y;
     return  Math.pow( Math.pow(x-x2, 2) + Math.pow(y - y2, 2), 0.5);
    }
}
