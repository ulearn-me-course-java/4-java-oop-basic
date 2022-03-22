package com.example.task04;

public class Task04Main {
    public static void main(String[] args) {
        Point first = new Point(0.5, 1);
        Point second = new Point(2.5, 2.8);
        Line line = new Line(first, second);

        Point p = new Point(1.203, 1.633);

        System.out.println(line.isCollinearLine(p));
    }
}
