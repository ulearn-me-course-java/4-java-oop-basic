package com.example.task04;

public class Line {
    private Point p1;
    private Point p2;

    public Point getP1(){
        return p1;
    }

    public Point getP2(){
        return p2;
    }

    public Line(Point p1, Point p2){
        this.p1 = p1;
        this.p2 = p2;
    }

    public boolean isCollinearLine(Point p){
        int x1 = p1.getX();
        int y1 = p1.getY();

        int x2 = p2.getX();
        int y2 = p2.getY();

        int x = p.getX();
        int y = p.getY();

        double PP1 = p.distance(p1);
        double PP2 = p.distance(p2);
        double P1P2 = p1.distance(p2);

        if(P1P2 == PP1 + PP2){
            return true;
        }

        return false;
    }

    public String toString(){
        return String.format("Point1(%d,%d), Point2(%d,%d)", p1.getX(), p1.getY(), p2.getX(), p2.getY());
    }
}
