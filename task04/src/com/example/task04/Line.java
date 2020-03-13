package com.example.task04;

public class Line {
    private Point start;
    private Point end;

    public Line(Point start, Point point2) {
        this.start = start;
        this.end = point2;
    }

    public Point getStart() {
        return start;
    }

    public Point getEnd() {
        return end;
    }

    public String toString() {
        return String.format("(%d;%d):(%d;%d)", start.x, start.y, end.x, end.y);
    }

    public boolean isCollinearLine(Point point) {
        return (point.x - start.x) / (end.x - start.x)
                == (point.y - start.y) / (end.y - start.y);
    }
}