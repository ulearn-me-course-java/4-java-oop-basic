package com.example.task04;

public class Task04Main {
    public static void main(String[] args) {
        Point p1 = new Point(5, 9);
        Point p2 = new Point(3, 7);
        Point p3 = new Point(4, 8);
        Point p4 = new Point(3, 8);
        Line line =new Line(p1,p2);
        System.out.println(line.getP1());
        System.out.println(line.toString());
        System.out.println(line.isCollinearLine(p3));
        System.out.println(line.isCollinearLine(p4));
    }
}
