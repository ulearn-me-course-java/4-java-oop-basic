package com.example.task04;

public class Task04Main {
    public static void main(String[] args) {
        Line line = new Line(new Point(1, 2), new Point(10, 2));
        System.out.println(line.toStr());
        System.out.println(line.isCollinearLine(new Point(6, 2)));
        System.out.println(line.isCollinearLine(new Point(12, 2)));
        System.out.println(line.isCollinearLine(new Point(6, 10)));
    }
}
