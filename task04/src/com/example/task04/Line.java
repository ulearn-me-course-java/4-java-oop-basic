package com.example.task04;

/**
 * Класс отрезка между двумя точками на плоскости
 */
public class Line {
    private Point p1;
    private Point p2;
    
    public Line(Point p1, Point p2) {
        if (p1 == null || p2 == null){
            throw new NullPointerException();
        }
        this.setP1(p1);
        this.setP2(p2);
    }

    public Point getP1() {
        return this.p1;
    }

    public Point getP2() {
        return this.p2;
    }

    public void setP1(Point p) {
        if (p == null){
            throw new NullPointerException();
        }
        this.p1 = p;
    }

    public void setP2(Point p) {
        if (p == null){
            throw new NullPointerException();
        }
        this.p2 = p;
    }

    /**
     * Возвращает строковое представление отрезка в формате [p1; p2],
     * где p1 = (x1,y1), p2 = (x2,y2)
     *
     * @return
     */
    public String toString() {
        return "[" + this.getP1().toString() + "; " + this.getP2().toString() + "]";
    }

    /**
     * Проверяет лежит ли переданная точка на прямой, содержащей текущий отрезок.
     * Для этого в уравнение прямой, составленное по двум точкам (концам текущего отрезка),
     * подставляются координаты переданной точки.
     * x-x1/x2-x1 = y-y1/y2-y1,
     * где p=(x,y) - переданная точка
     *
     * @param p
     * @return
     */
    public boolean isCollinearLine(Point p) {
        return (((p.x - this.getP1().x) / (this.getP2().x - this.getP1().x)) == ((p.y - this.getP1().y) / (this.getP2().y - this.getP1().y)));
    }
}
