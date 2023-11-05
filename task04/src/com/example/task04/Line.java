package com.example.task04;

/**
 * Напишите класс Line, который будет представлять из себя отрезок между двумя точками.
 * Класс должен иметь конструктор public Line(Point p1, Point p2)
 * Все поля должны быть объявлены как private. Для доступа к точкам добавьте два метода public Point getP1() и public Point getP2()
 * Добавьте метод public String toString() для формирования строкового представления объекта отрезка
 * Добавьте метод public boolean isCollinearLine(Point p), который будет проверять лежит ли переданная точка на прямой, содержащей текущий отрезок
 */
public class Line {
    private Point first;
    private Point second;

    public Line(Point p1, Point p2) {
        first = p1;
        second = p2;
    }

    public Point getP1() {
        return first;
    }

    public Point getP2() {
        return second;
    }

    public String toString() {
        return String.format("first: %s, second: %s", first, second);
    }

    //first: (x1, y1), second: (x2, y2), point: (x, y)
    // (y1 - y2)x + (x2 - x1)y + (x1y2 - x2y1) = 0
    public boolean isCollinearLine(Point p) {
        return ((first.y - second.y)*p.x
                + (second.x - first.x)*p.y
                + (first.x * second.y - second.x * first.y)) < 0.01;

        //(x-x1)/(x2-x1)=(y-y1)/(y2-y1)
        //double num1 = (p.x - first.x)/(second.x - first.x);
        //double num2 = (p.y - first.y)/(second.y - first.y);
        //return Math.abs(num2 - num1) < 0.01;
    }
}
