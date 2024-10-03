package com.example.task04;

public class Line
{
    Point p1;
    Point p2;

    public Line(Point p1, Point p2)
    {
        this.p1 = p1;
        this.p2 = p2;
    }

    public Point getP1() { return p1; }
    public Point getP2() { return p2; }

    public String toString()
    {
        return ("Точка 1: " + "x = " + p1.getX() + ", y = " + p1.getY() + "\n" +
                "Точка 2: " + "x = " + p2.getX() + ", y = " + p2.getY());
    }

    public boolean isCollinearLine(Point p)
    {
        double px = p.getX();
        double py = p.getY();
        double p1x = p1.getX();
        double p1y = p1.getY();
        double p2x = p2.getX();
        double p2y = p2.getY();
        double dxc = px - p1x;
        double dyc = py - p1y;

        double dxl = p2x - p1x;
        double dyl = p2y - p1y;

        double cross = dxc * dyl - dyc * dxl;
        return cross == 0;
    }
}
