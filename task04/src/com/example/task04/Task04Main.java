package com.example.task04;

public class Task04Main {
    public static void main(String[] args) {
        Point first = new Point(10, 5);
        Point second = new Point(15, 10);
        Line line = new Line(first, second);

        System.out.println(line);
        System.out.println(line.isCollinearLine(new Point(0, 0)));
        System.out.println(line.isCollinearLine(new Point(12, 7)));
    }
}
