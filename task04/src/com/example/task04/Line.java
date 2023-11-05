package com.example.task04;

public class Line {

    private Point p1;
    public Point getP1(){
        return p1;
    }
    private Point p2;

    public Point getP2(){
        return p2;
    }

    public Line(Point p1, Point p2){
        this.p1 = p1;
        this.p2 = p2;
    }

    public String toString(){
        return String.format("p1 = %d , p2 = %d", this.p1.toString(), this.p2.toString());
    }

    public boolean isCollinearLine(Point p){
        if(((p.x - p1.x) * (p2.y - p1.y) - (p.y - p1.y) * (p2.x - p1.x) == 0) && //коллинеарны (равно нулю их векторное произведение)
                ((p.x >= p1.x && p.x <= p2.x) || (p.x <= p1.x && p.x >= p2.x)) && // иначе точка будет находиться на прямой левее или правее отрезка
                ((p.y >= p1.y && p.y <= p2.y) || (p.y <= p1.y && p.y >= p2.y)))  { // иначе точка будет находиться на прямой выше или ниже отрезка
            return true;
        }
        return false;
    }
}
//коллинеарны (равно нулю их векторное произведение)