package com.example.task04;

public class Line {

    private Point firstPoint;
    private Point secondPoint;

    public Point getStartPoint() {
        return firstPoint;
    }

    public Point getEndPoint() {
        return secondPoint;
    }

    public Line(Point p1, Point p2){
        firstPoint = p1;
        secondPoint = p2;
    }

    public String toString(){
        return firstPoint.toString() + ";" + secondPoint.toString();
    }

    public boolean isCollinearLine(Point p){
        double len1 = firstPoint.distance(p) + secondPoint.distance(p);
        double len2 = firstPoint.distance(secondPoint);
        return len1 - len2 < 1e-9;
    }
}
