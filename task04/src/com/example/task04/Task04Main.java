package com.example.task04;

public class Task04Main {
    public static void main(String[] args) {
        Point a = new Point(1, 2);
        Point b = new Point(2, 2);
        Point c = new Point(3, 2);
        Line line = new Line(a, b);
        System.out.println(line.toString());
        System.out.println(line.isCollinearLine(c));
    }
}
