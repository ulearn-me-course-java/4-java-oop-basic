package com.example.task04;

public class Task04Main {
    public static void main(String[] args) {
        // Создание точек
        Point p1 = new Point(1, 2);
        Point p2 = new Point(3, 4);
        Point point3 = new Point(5, 6); // Эта точка должна быть коллинеарной

        // Создание отрезка
        Line line = new Line(p1, p2);

        // Вывод информации об отрезке
        System.out.println("Отрезок: " + line);
        System.out.println("Первая точка: " + line.getP1());
        System.out.println("Вторая точка: " + line.getP2());

        // Проверка, лежит ли точка на прямой
        if (line.isCollinearLine(point3)) {
            System.out.println("Точка " + point3 + " лежит на отрезке.");
        } else {
            System.out.println("Точка " + point3 + " не лежит на отрезке.");
        }
    }
}
