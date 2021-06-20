package com.example.task04;

public class Line {
    private Point firstPoint;
    private Point secondPoint;

    public Point getFirstPoint() {
        return this.firstPoint;
    }
    public Point getSecondPoint() {
        return this.secondPoint;
    }
    public Line(Point firstPoint, Point secondPoint) {
        this.firstPoint = firstPoint;
        this.secondPoint = secondPoint;
    }
    public String toString() {
        return (String.format("(%s, %s)", firstPoint.toString(), secondPoint.toString()));
    }
    public boolean isCollinearLine(Point point) {
        return firstPoint.distance(point) + secondPoint.distance(point) == this.secondPoint.distance(this.firstPoint);
    }

}
