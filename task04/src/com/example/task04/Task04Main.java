package com.example.task04;

public class Task04Main {
    public static void main(String[] args) {
        Point p1 = new Point(0, 0);
        Point p2 = new Point(4, 4);
        Line line = new Line(p1, p2);

        System.out.println("Созданный отрезок: " + line);

        Point p3 = new Point(2, 2);
        System.out.println("Точка " + p3 + " лежит на прямой: " + line.isCollinearLine(p3));

        Point p4 = new Point(3, 5);
        System.out.println("Точка " + p4 + " лежит на прямой: " + line.isCollinearLine(p4));
    }
}
