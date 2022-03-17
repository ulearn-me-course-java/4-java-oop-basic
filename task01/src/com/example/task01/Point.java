package com.example.task01;

/**
 * Класс точки на плоскости
 */
public class Point {
    int x;
    int y;

    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }
    public void flip(){   // поменять знак каждой координаты и поменять их местами
        x *= -1;
        y *= -1;

        int temp = x;
        x = y;
        y = temp;
    }
    double distance(Point point){ // должен считать расстояние между двумя точками
        return Math.sqrt(Math.pow(point.x - x, 2) + Math.pow(point.y - y, 2));
    }

    public String toString(){ // в формате (x, y)
        return "(" + x + ", " + y + ")";
    }

    void print() {
        String pointToString = String.format("(%d, %d)", x, y);
        System.out.println(pointToString);
    }
}
