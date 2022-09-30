package com.example.task04;

public final class Point {
    private int x;
    private int y;

    public int getX(){

        return x;
    }

    public int getY(){

        return y;
    }

    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    public void flip(){
        int a = x;
        x = -y;
        y = -a;
    }

    public double distance(Point point){

        return Math.sqrt(Math.pow((x-point.x),2) + Math.pow((y-point.y),2));
    }

    public String toString(){

        return "(" + Integer.toString(x) + " , " + Integer.toString(y) + ")";
    }

    public void print() {
        String pointToString = String.format("(%d, %d)", x, y);
        System.out.println(pointToString);
    }
}
