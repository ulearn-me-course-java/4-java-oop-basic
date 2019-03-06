package com.example.task04;

public class Task04Main {
    public static void main(String[] args) {
        Line line = new Line(new Point(5, 5), new Point(-5, -5));
        Point p1 = new Point(9, 12);
        Point p2 = new Point(4, 4);
        Point p3 = new Point(-7, -2);
        System.out.println("Точка " + p1 + " принадлежит отрезку " + line + " ? - " + line.isCollinearLine(p1));
        System.out.println("Точка " + p2 + " принадлежит отрезку " + line + " ? - " + line.isCollinearLine(p2));
        System.out.println("Точка " + p3 + " принадлежит отрезку " + line + " ? - " + line.isCollinearLine(p3));

        Line line2 = new Line(new Point(-5, -4), new Point(2, -4));
        Point p4 = new Point(0, -4);
        System.out.println("Точка " + p4 + " принадлежит отрезку " + line2 + " ? - " + line2.isCollinearLine(p4));
    }
}
