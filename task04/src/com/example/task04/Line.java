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
    @Override
    public String toString () {
        return String.format("start:%s, end:%s)", this.start.toString(),this.end.toString());
    }
}
