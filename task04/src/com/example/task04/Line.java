package com.example.task04;

public class Line {
    private final Point Start;
    private final Point End;

    public Line(Point start, Point end) {
        Start = start;
        End = end;
    }

    public Point getP1() {
        return Start;
    }

    public Point getP2() {
        return End;
    }

    public boolean isCollinearLine(Point p) {
        return (End.x - Start.x) * (p.y - Start.y) - (p.x - Start.x) * (End.y - Start.y) == 0;
    }

    @Override
    public String toString() {
        return String.format("(%d, %d), (%d, %d)", Start.x, Start.y, End.x, End.y);
    }
}
