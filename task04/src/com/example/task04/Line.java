package com.example.task04;

public class Line {
    private Point p1;
    private Point p2;
    public Line(Point p1, Point p2){
        this.p1 = p1;
        this.p2 = p2;
    }
    public Point getP1() {
        return this.p1;
    }

    public Point getP2() {
        return p2;
    }
    public boolean isCollinearLine(Point p){
        return (p.getX() - getP1().getX()) * (getP2().getY() - getP1().getY())  == (p.getY() - getP1().getY()) * (getP2().getX() - getP1().getX());
    }
    @Override
    public String toString() {
        return String.format("Line coordinates = {%s},{%s}",getP1().toString(),getP2().toString());
    }

}
