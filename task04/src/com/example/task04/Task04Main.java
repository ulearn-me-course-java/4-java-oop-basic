package com.example.task04;

public class Task04Main {
    public static void main(String[] args) {
        Point start = new Point(0,0);
        Point end = new Point(3,3);
        Point center = new Point(1.5,1.5);
        Line line = new Line(start,end);
        System.out.println(line.isCollinearLine(center));
    }
}
