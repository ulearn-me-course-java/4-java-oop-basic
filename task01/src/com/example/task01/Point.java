package com.example.task01;

/**
 * Класс точки на плоскости
 */
public class Point {
    private int x;
    private int y;

    public void flip(){
        int intermediate = x;
        this.x = -y;
        this.y = -intermediate;
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Point() {
    }

    public double distance(Point point){
        double xDif = Math.abs(this.x - point.getX());
        double yDif = Math.abs(this.y - point.getY());

        return Math.sqrt((xDif * xDif) + (yDif * yDif));
    }

    @Override
    public String toString() {
        return String.format("(%d, %d)", x, y);
    }

    void print() {
        String pointToString = String.format("(%d, %d)", x, y);
        System.out.println(pointToString);
    }
}
