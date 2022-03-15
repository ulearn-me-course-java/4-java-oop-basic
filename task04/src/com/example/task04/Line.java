package com.example.task04;

public class Line {

    private Point P1;
    private Point P2;

    public Line(Point P1, Point P2){
        this.P1 = P1;
        this.P2 = P2;
    }

    public Point getP1() {
        return P1;
    }

    public Point getP2() {
        return P2;
    }

    public boolean isCollinearLine(Point p){
        return Math.abs((P1.getX() - p.getX()) / (P1.getY() - p.getY())
                - (P2.getX() - p.getX()) / (P2.getY() - p.getY())) < 0.001;
    }

    @Override
    public String toString() {
        return "Line{" + "P1=" + P1 + "P2=" + P2 + '}';
    }

}

