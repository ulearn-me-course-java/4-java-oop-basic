package com.example.task04;

public class Task04Main {
    public static void main(String[] args) {
        Point point1 = new Point(0, 0);
        Point point2 = new Point(3, 3);
        Point point3 = new Point(1, 1);
        Point point4 = new Point(1, 2);

        Line line = new Line(point1, point2);

        System.out.println(line);
        System.out.println("Длина отрезка: " + line.length());
        System.out.println("Точка " + point3 + " лежит на прямой: " + line.isCollinearLine(point3));
        System.out.println("Точка " + point4 + " лежит на прямой: " + line.isCollinearLine(point4));

        Point point5 = new Point(2, 2);
        Point point6 = new Point(4, 3);
        System.out.println("Точка " + point5 + " лежит на прямой: " + line.isCollinearLine(point5));
        System.out.println("Точка " + point6 + " лежит на прямой: " + line.isCollinearLine(point6));
    }
}
