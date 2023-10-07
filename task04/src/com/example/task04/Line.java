package com.example.task04;

import java.lang.Math;

public class Line {
    private Point p1;
    private Point p2;
    private double tangent;

    public Line(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
        this.getTheTangent();
    }

    public Point getP1() {
        return p1;
    }

    public Point getP2() {
        return p2;
    }

    public String toString() {
        return String.format("(%s, %s), (%s, %s)", this.p1.x, this.p1.y, this.p2.x, this.p2.y);
    }

    public boolean isCollinearLine(Point p) {
        Line newLine = new Line(this.p1, p);
        newLine.getTheTangent();
        return this.tangent == newLine.tangent;
    }

    private void getTheTangent() {
        this.tangent = (double)Math.abs(p2.x - p1.x) / Math.abs(p2.y - p1.y);
    }
}
