package com.example.task04;

public class Line {
    private final Point start;
    private final Point end;
    public Line(Point start,Point end){
        this.start = start;
        this.end = end;
    }

    public Point getStart() {
        return this.start;
    }

    public Point getEnd() {
        return this.end;
    }

    public boolean isCollinearLine(Point point){
        double num1 = (point.x - start.x)/(end.x - start.x);
        double num2 = (point.y - start.y)/(end.y - start.y);
        return Math.abs(num2 - num1) < 0.01;
    }
    @Override
    public String toString () {
        return String.format("start:%s, end:%s)", this.start.toString(),this.end.toString());
    }
}
