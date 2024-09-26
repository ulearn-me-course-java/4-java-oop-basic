package com.example.task01;

/**
 * Класс точки на плоскости
 */
public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void flip(){
        int intermediate = x;
        this.x = -y;
        this.y = -intermediate;
    }

    public double distance(Point point){
        double xDif = Math.abs(this.x - point.x);
        double yDif = Math.abs(this.y - point.y);

        return Math.sqrt((xDif * xDif) + (yDif * yDif));
    }

    public String toString() {
        return String.format("(%d, %d)", x, y);
    }

    void print() {
        String pointToString = String.format("(%d, %d)", x, y);
        System.out.println(pointToString);
    }
}
