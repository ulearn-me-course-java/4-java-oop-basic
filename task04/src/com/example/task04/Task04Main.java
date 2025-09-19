package com.example.task04;

public class Task04Main {
    public static void main(String[] args) {
        Point p1 = new Point(1,1);
        Point p2 = new Point(5,1);
        Line  l1 = new Line(p1,p2);
        System.out.println(l1.isCollinearLine(new  Point(-5,1)));
    }
}
