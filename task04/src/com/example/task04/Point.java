package com.example.task04;
public class Point {

    final int x;
    final int y;

    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }
    public double distance(Point point){

        double disX = x - point.x;
        double disY = y - point.y;

        return Math.sqrt(disX * disX + disY * disY);
    }
    public String toString(){

        return  String.format("(%d, %d)", this.x, this.y);
    }

    void print() {
        String pointToString = String.format("(%d, %d)", x, y);
        System.out.println(pointToString);
    }
}
