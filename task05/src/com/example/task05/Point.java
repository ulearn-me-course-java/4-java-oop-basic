package com.example.task05;

/**
 * Точка в двумерном пространстве
 */
public class Point {

    /**
     * Конструктор, инициализирующий координаты точки
     *
     * @param x координата по оси абсцисс
     * @param y координата по оси ординат
     */
    private double x;
    private double y;
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Возвращает координату точки по оси абсцисс
     *
     * @return координату точки по оси X
     */
    public double getX() {
        // TODO: реализовать
        return this.x;
    }

    /**
     * Возвращает координату точки по оси ординат
     *
     * @return координату точки по оси Y
     */
    public double getY() {
        // TODO: реализовать
        return this.y;
    }

    /**
     * Подсчитывает расстояние от текущей точки до точки, переданной в качестве параметра
     *
     * @param point вторая точка отрезка
     * @return расстояние от текущей точки до переданной
     */
    public double getLength(Point point) {
        // TODO: реализовать
       double distance;
        double x;
        double y;

        if(this.x > point.x)
        {
            x = this.x - point.x;
        }
        else
        {
            x = point.x - this.x;
        }
        if(this.y > point.y)
        {
            y = this.y - point.y;
        }
        else
        {
            y = point.y - this.y;
        }
        distance = Math.sqrt((Math.pow(x, 2) + Math.pow(y, 2)));
        return distance;
    }

}
