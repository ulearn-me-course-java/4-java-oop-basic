package com.example.task04;

public class Line {
    private Point point1;
    private Point point2;

    public String toString(){
        return point1.toString() + "---" + point2.toString();
    }


    /*
    Площадь = 1/2{ (x1*y2 + x2*y3 + x3*y1) — ( x2*y1 + x3*y2 + x1*y3) }
    Если полученный результат равен 0 — точки коллинеарны (лежат на одной прямой)
    Если полученный результат неравен 0 — точки неколлинеарны
     */
    public boolean isCollinearLine(Point p){
        int leftBracket = (point1.getX() * point2.getY()) +
                (point2.getX() * p.getY())+
                (p.getX() * point1.getY());

        int rightBracket = (point2.getX() * point1.getY())+
                (p.getX() * point2.getY())+
                (point1.getX() * p.getY());
        int area = (leftBracket - rightBracket) / 2;
        return area == 0;
    }

    public Point getP1() {
        return point1;
    }

    public Point getP2() {
        return point2;
    }

    public Line(Point point1, Point point2){
        this.point1 = point1;
        this.point2 = point2;
    }
}
