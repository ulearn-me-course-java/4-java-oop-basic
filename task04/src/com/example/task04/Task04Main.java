package com.example.task04;

public class Task04Main {
    public static void main(String[] args) {
        Line line = new Line(new Point(0,0), new Point(5,5));
        System.out.println(line.toString());
        System.out.println((line.getFirstPoint().toString()));
        System.out.println((line.getSecondPoint().toString()));
        Point point1 = new Point(2, 2);
        Point point2 = new Point(2, 1);
        System.out.println(line.isCollinearLine(point1));
        System.out.println(line.isCollinearLine(point2));
    }
}
