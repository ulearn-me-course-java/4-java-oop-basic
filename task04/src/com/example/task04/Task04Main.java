package com.example.task04;

public class Task04Main {
    public static void main(String[] args) {

    }
}

class Line{
    private Point firstPoint;
    private Point secondPoint;

    public Line(Point p1, Point p2){
        firstPoint = p1;
        secondPoint = p2;
    }

    public Point getP1(){
        return firstPoint;
    }

    public Point getP2(){
        return secondPoint;
    }

    public boolean isCollinearLine(Point p){
            int x1 = firstPoint.getX();
            int y1 = firstPoint.getY();
            int x2 = secondPoint.getX();
            int y2 = secondPoint.getY();
            int x3 = p.getX();
            int y3 = p.getY();

            // Формула площади треугольника через координаты
            // Если площадь = 0, точки лежат на одной прямой
            int area = (x2 - x1) * (y3 - y1) - (x3 - x1) * (y2 - y1);

            return area == 0;

    }

    public String toString(){
        return String.format("Первая точка: %s вторая точка %s", firstPoint.toString(), secondPoint.toString());
    }
}

class Point{
    private final int x;
    private final int y;

    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    public String toString(){
        return String.format("%d, %d", x, y);
    }

    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }

}
