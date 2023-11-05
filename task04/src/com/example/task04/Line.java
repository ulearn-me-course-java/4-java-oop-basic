package com.example.task04;

public class Line {

    private final Point FirstPoint;
    private final Point SecondPoint;

    public Line(Point p1, Point p2)
    {
        this.FirstPoint = p1;
        this.SecondPoint = p2;
    }

    public String toString()
    {
        return new String(this.FirstPoint.toString() + " , " + this.SecondPoint.toString());
    }

    public Point getP1()
    {
        return FirstPoint;
    }

    public Point getP2()
    {
        return SecondPoint;
    }

    public boolean isCollinearLine(Point p)
    {
        return (this.FirstPoint.distance(this.SecondPoint) == (p.distance(this.FirstPoint) + p.distance(this.SecondPoint)));

    }

}
