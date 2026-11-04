package com.example.task04;

public class Task04Main {
    public static void main(String[] args) {

        Point firstPoint = new Point(2, 3);
        Point secondPoint = new Point(6, 5);

        Line line = new Line(firstPoint, secondPoint);

        Point thirdPoint = new Point(4, 4);
        Point fourthPoint = new Point(5, 8);

        System.out.println("Отрезок: " + line);

        System.out.println("Первая точка: " + line.getP1());
        System.out.println("Вторая точка: " + line.getP2());

        System.out.println("Точка " + thirdPoint + " лежит на прямой: "
                + line.isCollinearLine(thirdPoint));

        System.out.println("Точка " + fourthPoint + " лежит на прямой: "
                + line.isCollinearLine(fourthPoint));
    }
}