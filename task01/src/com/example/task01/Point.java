package com.example.task01;
import java.math.*;
/**
 * Класс точки на плоскости
 */
public class Point {
    int x; //координата х
    int y; //координата у

    /* Добавьте в класс конструктор, инициализирующий обе координаты.
    Конструктор говорит КАК создать объект? как создать точку? из двух координат.
    Конструктор - это самый обычный метод, который имеет такое же название, как и класс.*/

    public Point(int x, int y) {
        this.x = x; //у класс и конструктора одинковые переменные? пихаем ключевое млово this.
        this.y = y;
    }

    void print() {
        String pointToString = String.format("(%d, %d)", x, y);
        System.out.println(pointToString);
    }

    /*Добавьте метод void flip(),
    который будет "вращать" точку относительно начала координат на 180 градусов.*/

    //меняем координаты через левую переменную?

    public void flip(){
        int turn = x;
        x = - y;
        y = - turn;
    }

    /*Добавьте метод double distance(Point point),
    который будет принимать в качестве параметра объект точки
    и должен считать расстояние между двумя точками.

    просто математику тащи*/

    public double distance(Point point){
        double dist = Math.sqrt((Math.pow(point.x - this.x, 2))+(Math.pow(point.y - this.y, 2)));
        return dist;
    }

    /*Добавьте метод public String toString(), который должен возвращать
    строковое представление точки, например в формате (x, y)

    String.format из низа?
    */
    public String toString(){
        return String.format("(%d, %d)", x, y);
        /*Аналогично String.format(x + "," + y),
        но плюшка тащит для большего количества необходимых
        к перечислению переменных/тд   */
    }
}
