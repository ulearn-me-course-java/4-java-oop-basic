package com.example.task04;

public class Task04Main {
    public static void main(String[] args) {
        Point p = new Point(1, 1);
        Point s = new Point(0, 0);
        Point e = new Point(2, 2);
        Line line = new Line(s,e);
        System.out.println(line.toString());
        System.out.println(line.isCollinearLine(p));
    }
}
