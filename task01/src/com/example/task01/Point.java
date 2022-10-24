package com.example.task01;
public class Point {
    int x;
    int y;

    public Point(int xcoord, int ycoord){
        x = xcoord;
        y = ycoord;
    }

    public Point() {

    }

    public void flip(){
        int temp = x;
        x = -y;
        y = -temp;
    }
    double distance(Point point){
        return Math.sqrt(Math.pow((this.getX() - point.getX()), 2) + Math.pow((this.getY() - point.getY()), 2));

    }
    public double getX(){
        return x;
    }
    public double getY(){
        return y;
    }
    public String toString(){
        return String.format("(%d, %d)", x, y);
    }

    void print() {
        String pointToString = String.format("(%d, %d)", x, y);
        System.out.println(pointToString);
    }
}
