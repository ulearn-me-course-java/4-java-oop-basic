package com.example.task04;

public class Line {

    private Point p1;
    private Point p2;
    public Line(Point x, Point y) {
        this.p1 = x;
        this.p2 = y;
    }
    @Override
    public String toString() {
        return "Line{" + "p1=" + p1 + ", p2=" + p2 + '}';
    }
    public Point getP1() {
        return p1;
    }
    public Point getP2() {
        return p2;
    }
    public boolean isCollinearLine(Point p){
        //(x - x₁)/(x₂ - x₁) = (y - y₁)/(y₂ - y₁)

            return Math.abs((p.getX() - p1.getX()) * (p2.getY() - p1.getY()) - (p.getY() - p1.getY()) * (p2.getX() - p1.getX())) < 1e-10;
    }




}
