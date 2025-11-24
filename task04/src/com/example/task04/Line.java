package com.example.task04;

public class Line {
    private final Point p1;
    private final Point p2;

    public Line(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public Point getP1() {
        return p1;
    }

    public Point getP2() {
        return p2;
    }

    @Override
    public String toString() {
        return String.format("Line from %s to %s", p1, p2);
    }

    /**
     * Проверяет, лежит ли точка p на прямой, содержащей этот отрезок.
     * Используется уравнение прямой через две точки (без деления, чтобы избежать ошибок с 0).
     */
    public boolean isCollinearLine(Point p) {
        // Координаты точек отрезка
        int x1 = p1.getX();
        int y1 = p1.getY();
        int x2 = p2.getX();
        int y2 = p2.getY();

        // Координаты проверяемой точки
        int x = p.getX();
        int y = p.getY();

        // Вычисляем разницы (проекции векторов)
        long dxSegment = x2 - x1;
        long dySegment = y2 - y1;
        long dxPoint = x - x1;
        long dyPoint = y - y1;

        // Проверяем через перекрестное умножение:
        // (x2 - x1) * (y - y1) == (y2 - y1) * (x - x1)
        // Используем long, чтобы избежать переполнения при умножении больших чисел
        return dxSegment * dyPoint == dySegment * dxPoint;
    }
}