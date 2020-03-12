package com.example.task04;

public class Task04Main {
    public static void main(String[] args) {
        Point p1 = new Point(0, 0);
        Point p2 = new Point(3, 3);
        Line line = new Line(p1, p2);
        System.out.println(line.toString());
        System.out.println(line.isCollinearLine(new Point(2, 2))); //true
        System.out.println(line.isCollinearLine(new Point(2, 1))); //false
    }
}
