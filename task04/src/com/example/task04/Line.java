package com.example.task04;

public class Line
{
    private Point p1;
    private Point p2;

    public Line(Point p1, Point p2)
    {
        this.p1 = p1;
        this.p2 = p2;
    }

    public Point getP1()
    {
        return p1;
    }

    public Point getP2()
    {
        return p2;
    }

    public String toString()
    {
        StringBuilder str = new StringBuilder();
        str.append("p1=").append(p1.toString()).append(" p2=").append(p2.toString());
        return str.toString();
    }

    public boolean isCollinearLine(Point p)
    {
        return ((p.x - p1.x) * (p2.y - p1.y) - (p2.x - p1.x) * (p.y - p1.y) == 0);
    }

}