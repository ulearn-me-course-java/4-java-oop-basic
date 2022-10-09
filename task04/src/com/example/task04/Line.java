package com.example.task04;

public class Line {
    private final Point pointOne;
    private final Point pointTwo;

    public Line(Point pointOne, Point pointTwo) {
        this.pointOne = pointOne;
        this.pointTwo = pointTwo;
    }

    public Point getPointOne() {
        return pointOne;
    }

    public Point getPointTwo() {
        return pointTwo;
    }

    public boolean isCollinearLine(Point p) {
        return (p.getX() - pointOne.getX()) / (pointTwo.getX() - pointOne.getX()) == (p.getY() - pointOne.getY()) / (pointTwo.getY() - pointOne.getY());
    }

    public String toString () {
        return String.format("%s %s",pointOne.toString(),pointTwo.toString());
    }
}
