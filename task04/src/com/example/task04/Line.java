package com.example.task04;

public class Line {
    private Point pointOne;
    private Point pointTwo;

    public Line(Point pOne, Point pTwo){
        pointOne = pOne;
        pointTwo = pTwo;
    }

    public  Point getPointOne(){
        return pointOne;
    }

    public Point getPointTwo(){
        return pointTwo;
    }

    public boolean CollenearLine(Point p){
        return (p.getX() - pointOne.getX()) * (pointTwo.getY() - pointOne.getY()) - (pointTwo.getX() - pointOne.getX()) * (p.getY() - pointOne.getY()) == 0;
    }

    @Override
    public String toString() {
        return "(" + pointOne.getX() + "|" + pointOne.getY() +
                ')' + "(" + pointTwo.getX() + "|" + pointTwo.getY() +
                ')';
    }
}
