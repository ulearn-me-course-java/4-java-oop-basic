package com.example.task04;

public class Task04Main {
    public static void main(String[] args) {
        Line line = new Line(new Point(10, 10), new Point(10, 5));
        System.out.println(line.toString());
        System.out.println(line.isCollinearLine(new Point(10, 2)));
        System.out.println(line.isCollinearLine(new Point(10, 7)));
        System.out.println(line.isCollinearLine(new Point(5, 10)));
    }
}
