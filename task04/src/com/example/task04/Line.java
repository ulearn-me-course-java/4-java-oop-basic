package com.example.task04;

import java.awt.*;

class Point{
    private final int x;
    private final int y;

    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int getX() { return x; }
    public int getY() { return y; }

    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}

public class Line {

    private final Point p1;
    private final Point p2;

    public Line(Point p1, Point p2){
        this.p1 = p1;
        this.p2 = p2;
    }



    public Point getP1(){
        return p1;
    }

    public Point getP2(){
        return p2;
    }

    public String toString(){
        return String.format("Отрезок с началом в (%d, %d) и с концом в (%d, %d)",
                p1.getX(), p1.getY(), p2.getX(), p2.getY());
    }

    public boolean isCollinearLine(Point p){

        int x = p.getX();
        int y = p.getY();
        int area = (x - p1.getX()) * (p2.getY() - p1.getY()) - (y - p1.getY()) * (p2.getX() - p1.getX());
        return area == 0;
    }

}
