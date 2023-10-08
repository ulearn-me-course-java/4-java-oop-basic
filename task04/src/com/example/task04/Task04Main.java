package com.example.task04;

public class Task04Main {
    public static void main(String[] args) {
        Line line = new Line(new Point(1, 2), new Point(3, 4));
        boolean flag = line.isCollinearLine(new Point(1, 2));
        System.out.println(flag);
        System.out.println(line.toString());
    }
}
