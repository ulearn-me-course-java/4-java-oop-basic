package com.example.task04;

public class Task04Main {
    public static void main(String[] args) {
        Line line = new Line(new Point(2, 3), new Point(-6, -9));
        Point p1 = new Point(10, 15);
        Point p2 = new Point(1, 1);
        Point p3 = new Point(-4, -6);
        System.out.println("Точка " + p1 + " принадлежит отрезку " + line + "?\n - " + line.isCollinearLine(p1));
        System.out.println("Точка " + p2 + " принадлежит отрезку " + line + "?\n - " + line.isCollinearLine(p2));
        System.out.println("Точка " + p3 + " принадлежит отрезку " + line + "?\n - " + line.isCollinearLine(p3));
    }
}
