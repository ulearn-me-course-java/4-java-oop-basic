package com.example.task04;

public class Line {
    private Point Start;
    private Point End;
    public Line(Point p1, Point p2){
        Start = p1;
        End = p2;
    }
    public Point getP1() {
        return Start;
    }

    public Point getP2() {
        return End;
    }

    public String toString(){
        return String.format("%s - %s", Start, End);
    }

    public boolean isCollinearLine(Point p) {
        int x1 = Start.getX();
        int y1 = Start.getY();
        int x2 = End.getX();
        int y2 = End.getY();
        int x = p.getX();
        int y = p.getY();
        return (x - x1) * (y2 - y1) == (x2 - x1) * (y - y1);
    }
}
