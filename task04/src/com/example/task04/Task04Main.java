package com.example.task04;

public class Task04Main {
    public static void main(String[] args) {
        Point p1 = new Point(10, 10);
        Point p2 = new Point(20, 20);
        Line line = new Line(p1, p2);

        System.out.println(line);
        System.out.println(line.isCollinearLine(new Point(10, 10)));
        System.out.println(line.isCollinearLine(new Point(15, 32)));
    }
}
