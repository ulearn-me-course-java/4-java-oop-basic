package com.example.task01;

/**
 * Класс точки на плоскости
 */
public class Point {
    private int x;
    private int y;

    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    // метод void flip(), который будет "вращать" точку относительно начала координат
    // на 180 градусов. Для этого нужно поменять знак каждой координаты и поменять их
    // местами. Например, точка (5, -7) переходит в (7, -5)
    public void flip(){
        int temp = x * -1;
        x = y * -1;
        y = temp;
    }

    // метод double distance(Point point), который будет принимать в качестве параметра
    // объект точки и должен считать расстояние между двумя точками
    // (той, для которой вызывается метод, и переданной в качестве аргумента)

    public double distance(Point point){
        return Math.sqrt(Math.pow(point.x - x, 2)  + Math.pow(point.y - y, 2));
    }

    // метод public String toString(), который должен возвращать
    // строковое представление точки, например в формате (x, y)

    public String toString(){
        return "(" + x + ", " + y + ")";
    }

    void print() {
        System.out.println(toString());
    }
}
