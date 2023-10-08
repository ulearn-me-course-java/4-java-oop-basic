package com.example.task04;

public class Task04Main {
    public static void main(String[] args) {

        Point a = new Point(1,1);
        Point b = new Point(4,4);
        Line line = new Line(a,b);
        System.out.println(line.isCollinearLine(new Point(-1, -1)));
    }
}
