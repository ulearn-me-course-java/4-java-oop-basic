package com.example.task05;

/**
 * Точка в двумерном пространстве
 */
public class Point {

  private double x;
  private double y ;
    public Point(double x, double y) {
        this.x=x;
        this.y=y;
    }


    public double getX() {
       return x;
    }

    /**
     * Возвращает координату точки по оси ординат
     *
     * @return координату точки по оси Y
     */
    public double getY() {
       return y;
    }

    /**
     * Подсчитывает расстояние от текущей точки до точки, переданной в качестве параметра
     *
     * @param point вторая точка отрезка
     * @return расстояние от текущей точки до переданной
     */
    public double getLength(Point point) {
       return Math.sqrt(Math.pow((this.x - point.x), 2) + Math.pow((this.y - point.y), 2));
    }

}
