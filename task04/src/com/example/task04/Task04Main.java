package com.example.task04;

public class Task04Main {
    public static void main(String[] args) {
        Point point1 = new Point(5,7);
        Point point2 = new Point(9,10);
        Point point3 = new Point(6,8);
        Line line = new Line(point1,point2);
        System.out.println(line.isCollinearLine(point3));
        System.out.println(line.toString());
    }
}
