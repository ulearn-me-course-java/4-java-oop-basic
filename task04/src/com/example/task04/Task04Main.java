package com.example.task04;

public class Task04Main {
    public static void main(String[] args) {
        Point p1 = new Point(3,2);
        Point p2 = new Point(5,10);
        Point p = new Point(4,6);

        Line line = new Line(p1, p2);

        System.out.println(line);
        System.out.println(line.isCollinearLine(p));
    }
}
