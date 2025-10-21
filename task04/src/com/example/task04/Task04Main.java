package com.example.task04;

public class Task04Main {
    public static void main(String[] args) {
        Point p1 = new Point(0 ,0);
        Point p2 = new Point(0, 5);

        Line line = new Line(p1, p2);

        Point p3 = new Point(1, 4);

        System.out.println(line);
        System.out.print(line.isCollinearLine(p3));
    }
}
