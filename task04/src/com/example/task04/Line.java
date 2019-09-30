package com.example.task04;

public class Line {
    private final Point first;
    private final Point second;

    public Line() {
        first = new Point(0, 0);
        second = new Point(0, 0);
    }

    Line(Point first, Point second) {
        this.first = first;
        this.second = second;
    }

    boolean isCollinearLine(Point p) {
        if ((second.x - first.x) == 0) {
            return Math.min(first.y, second.y) <= p.y && Math.max(first.y, second.y) >= p.y;
        }
        if ((second.y - first.y) == 0) {
            return Math.min(first.x, second.x) <= p.x && Math.max(first.x, second.x) >= p.x;
        }
        if (Math.min(first.x, second.x) <= p.x && Math.max(first.x, second.x) >= p.x && Math.min(first.y, second.y) <= p.y && Math.max(first.y, second.y) >= p.y)
            return (p.x - first.x) / (second.x - first.x) == (p.y - first.y) / (second.y - first.y);
        else return false;
    }

    public Point getFirst() {
        return first;
    }

    public Point getSecond() {
        return second;
    }

    public String toString() {
        return "First point: " + first.toString() + "Second Point: " + second.toString();
    }
}
