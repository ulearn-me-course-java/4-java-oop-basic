package com.example.task04;

/**
 * Класс точки на плоскости
 * Класс Point можете взять из одной из предыдущих задач.
 * Для класса Point нужно запретить изменение состояния объекта после создания,
 * т.е. сделать все поля final, а инициализацию полей сделать в конструкторе.
 */
public class Point {
    final double x;
    final double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    //Добавьте метод, который будет "вращать" точку относительно начала координат на 180 градусов
    // Для этого нужно поменять знак каждой координаты и поменять их местами
    // Например точка (5, -7) переходит в (7, -5)
    public Point flip() {
        return new Point(-y, -x);
    }

    //Добавьте метод, который будет принимать в качестве параметра объект точки
    // и должен считать расстояние между двумя точками
    // (той, для которой вызывается метод, и переданной в качестве аргумента)
    double distance(Point point) {
        //d = √((хА – хВ)^2 + (уА – уВ)^2)
        return Math.sqrt(Math.pow(this.x - point.x, 2) + Math.pow(this.y - point.y, 2));
    }

    //Добавьте метод, который должен возвращать строковое представление точки
    // например в формате (x, y)
    public String toString(){
        return String.format("(%s, %s)", x, y);
    }

    void print() {
        String pointToString = String.format("(%d, %d)", x, y);
        System.out.println(pointToString);
    }
}
