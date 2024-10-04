package com.example.task04;

public class Point {
    // Поля для хранения координат точки
    private final int x;
    private final int y;

    // Конструктор для инициализации координат
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Геттер для координаты x
    public int getX() {
        return x;
    }

    // Геттер для координаты y
    public int getY() {
        return y;
    }


    public String toString() {
        return String.format("(%d, %d)", x, y);
    }
}

