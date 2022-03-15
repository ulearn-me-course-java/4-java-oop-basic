package com.example.task04;

class Point {
    private final int x;
    private final int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public double distance(Point point) {
        return Math.sqrt(Math.pow((x - point.x), 2) + Math.pow((y - point.y), 2));
    }

    public String toString() {
        return "(" + Integer.toString(x) + ", " + Integer.toString(y) + ")";
    }
}

class Line {
    private Point p1;
    private Point p2;

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
        return "start: " + p1.toString() + ", end: " + p2.toString();
    }

    public boolean isCollinearLine(Point p) {
        return (p.getY() - p1.getY())*(p2.getX() - p1.getX())-(p.getX() - p1.getX())*(p2.getY() - p1.getY()) == 0;
    }
}

public class Task04Main {
    public static void main(String[] args) {
        Point p1 = new Point(10, 20);
        Point p2 = new Point(20, 30);
        Line l1 = new Line(p1, p2);

        Point p3 = new Point(0, 10);
        System.out.println(l1.isCollinearLine(p3));

        System.out.println(l1.toString());
    }
}
