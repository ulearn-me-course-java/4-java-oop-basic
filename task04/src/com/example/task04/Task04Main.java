package com.example.task04;

public class Task04Main {
    public static void main(String[] args) {

        Point p1 = new Point(1,1);
        Point p2 = new Point(4,5);
        Line section = new Line(p1,p2);

        Point startingPoint = section.getP1();
        Point enddingPoint = section.getP2();

        System.out.println("Начало отрезка - " + startingPoint);
        System.out.println("Конец отрезка - " + enddingPoint);

        System.out.println(section);

        Point p3 = new Point(2,3);
        System.out.println("Точка" + p3 + " на прямой: " + section.isCollinearLine(p3));

    }
}
