package com.example.task01;


public class Point {
    int x;
    int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    void print() {
        String pointToString = String.format("(%d, %d)", x, y);
        System.out.println(pointToString);
    }

    /*Добавьте метод void flip(), который будет "вращать" точку относительно начала координат на 180 градусов.*/
    public void flip() {
        int turn = x;
        x = -y;
        y = -turn;
    }
    //Расстояние между точками
    public double distance(Point point) {
        double inter = Math.sqrt((Math.pow(point.x - this.x, 2)) + (Math.pow(point.y - this.y, 2)));
        return inter;
    }

    public String toString() {
        //return String.format("(%d, %d)", x, y);
        return String.format(x + "," + y);
    }
}
