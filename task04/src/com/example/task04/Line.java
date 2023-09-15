package com.example.task04;

import java.util.Arrays;

public class Line {
    private final Point p1;
    private final Point p2;


    public Line(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public Point getP1() {
        return p1;
    }

    public Point getP2() {
        return p2;
    }

    public String toString() {
        return "P1:" + p1.toString() + " P2:" + p2.toString();
    }

    public boolean isCollinearLine(Point p) {
        double[] distances = new double[]{p.distance(p1), p.distance(p2), p1.distance(p2)};
        distances = Arrays.stream(distances).sorted().toArray();
        return distances[0] + distances[1] - distances[2] < 1e-8;
    }
}
