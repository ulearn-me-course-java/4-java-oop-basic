package com.example.task04;

public class Line {
    private Point start;
    private Point end;

    public Line(Point p1, Point p2) {
        this.start = p1;
        this.end = p2;

    }

    public Point getStart() {
        return start;
    }

    public Point getEnd() {
        return end;
    }


    public boolean isCollinearLine(Point p) {
        if ((p.x - this.start.x) / (this.end.x - this.start.x) == (p.y - this.start.y) / (this.end.x - this.start.y))
            return true;
        return false;
    }

    public String toString() {
        return String.format("(%d, %d) (%d, %d)", this.start.x, this.start.y, this.end.x, this.end.y);
    }
}

