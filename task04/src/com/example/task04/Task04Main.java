package com.example.task04;

public class Task04Main {
    public static void main(String[] args) {
        Point scnd = new Point(3,3);
        Point frst = new Point(0,0);
        Point trd = new Point(1,1);
        Line line = new Line(frst,scnd);
        System.out.println(line.isCollinearLine(trd));
        System.out.println(line);
    }
}
