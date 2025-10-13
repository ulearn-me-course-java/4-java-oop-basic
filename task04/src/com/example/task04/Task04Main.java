package com.example.task04;

public class Task04Main {
    public static void main(String[] args) {
        Point p1 = new Point(2, 1);
        Point p2 = new Point(6, 3);
        Line line = new Line(p1, p2);
        System.out.println("Line: " + line);
        Point p = new Point(4, 2);
        System.out.println(line.isCollinearLine(p));
    }
}
