package com.example.task05;
    public class Point {
        private final double x;
        private final double y;

        public Point(double x, double y) {
            this.x = x;
            this.y = y;
        }

        public Point copy()
        {
            return new Point(this.x, this.y);
        }
        public double getX(){
            return this.x;
        }
        public double getY(){
            return this.y;
        }
        void print() {
            String pointToString = String.format("(%d, %d)", this.x, this.y);
            System.out.println(pointToString);
        }

        double getLength(Point point) {
            return Math.sqrt(Math.pow((this.x - point.x), 2.0) + Math.pow((this.y - point.y), 2.0));
        }

        public String toString() {
            String x = Double.toString(getX());
            String y = Double.toString(getY());
            return x + "," + y;
        }
}
