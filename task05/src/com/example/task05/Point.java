package com.example.task05;

/**
 * Точка в двумерном пространстве
 */
public class Point {

    public class Point {
        private final double X;
        private final double Y;

        public Point(double x, double y){

        X =x;
        Y =y;
    }
    public double getX() {

        return X;
    }

    /**
     * Возвращает координату точки по оси ординат
     *
     * @return координату точки по оси Y
     */
    public double getY() {
        // TODO: реализовать

        return Y;
    }

    /**
     * Подсчитывает расстояние от текущей точки до точки, переданной в качестве параметра
     *
     * @param point вторая точка отрезка
     * @return расстояние от текущей точки до переданной
     */
    public double getLength(Point point) {
        // TODO: реализовать

        double a = Math.pow(X - point.X, 2);
        double b = Math.pow(Y - point.Y, 2);

        return Math.sqrt(a + b);
    }

}
