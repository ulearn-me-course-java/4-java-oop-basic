package com.example.task04;

public class Task04Main {
    public static void main(String[] args)
    {
        Point p1 = new Point(4, 4);
        Point p2 = new Point(1, 1); // лежит на прямой
        Point p3 = new Point(5, 5);
        Point p4 = new Point(1, 2); // не лежит на прямой
        Line line = new Line(p1, p3);
        boolean isColl = line.isCollinearLine(p2);
        boolean isColl2 = line.isCollinearLine(p4);
        System.out.println("Координаты точки 1: " + p1.toString());
        System.out.println("Координаты точки 2: " + p2.toString());
        System.out.println(line.toString());
        System.out.println(isColl);
        System.out.println(isColl2);
    }
}
