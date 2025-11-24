package com.example.task04;

public class Task04Main {
    public static void main(String[] args) {
        // Создаем точки для отрезка
        Point p1 = new Point(1, 1);
        Point p2 = new Point(3, 3);

        // Создаем отрезок
        Line line = new Line(p1, p2);
        System.out.println("Отрезок: " + line);

        // Тест 1: Точка лежит на прямой (и внутри отрезка)
        Point pOnLine = new Point(2, 2);
        System.out.println("Точка (2,2) коллинеарна? " + line.isCollinearLine(pOnLine)); // true

        // Тест 2: Точка лежит на прямой (но за пределами отрезка)
        Point pOnLineOutside = new Point(5, 5);
        System.out.println("Точка (5,5) коллинеарна? " + line.isCollinearLine(pOnLineOutside)); // true

        // Тест 3: Точка НЕ лежит на прямой
        Point pNotOnLine = new Point(2, 3);
        System.out.println("Точка (2,3) коллинеарна? " + line.isCollinearLine(pNotOnLine)); // false

        // Тест 4: Вертикальная линия (защита от деления на ноль)
        Line verticalLine = new Line(new Point(0, 0), new Point(0, 10));
        Point verticalPoint = new Point(0, 50);
        System.out.println("Вертикальная точка (0,50) коллинеарна? " + verticalLine.isCollinearLine(verticalPoint)); // true
    }
}