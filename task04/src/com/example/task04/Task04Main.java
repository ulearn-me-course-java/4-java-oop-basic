package com.example.task04;

public class Task04Main {
    public static void main(String[] args) {
        Line l = new Line(new Point(0,0),new Point(3,3));
        String str = l.toString();
        System.out.println(str);

        Point p = new Point(-2,-2);
        System.out.println(l.isCollinearLine(p));
    }
}
