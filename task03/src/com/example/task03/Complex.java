package com.example.task03;

public class Complex {
    private long x;
    private long y;

    Complex() {
        x = 0;
        y = 0;
    }

    Complex(long x, long y) {
        this.x = x;
        this.y = y;
    }

    Complex(Complex complex) {
        if(complex==null){
            throw new IllegalArgumentException();
        }
        this.x = complex.x;
        this.y = complex.y;
    }

    Complex add(Complex complex) {
        if(complex==null){
            throw new IllegalArgumentException();
        }
        return new Complex(x + complex.x, y + complex.y);
    }

    Complex sub(Complex complex) {
        if(complex==null){
            throw new IllegalArgumentException();
        }
        return new Complex(x - complex.x, y - complex.y);
    }

    Complex mul(Complex complex) {
        if(complex==null){
            throw new IllegalArgumentException();
        }
        return new Complex(x * complex.x - y * complex.y, y * complex.x + x * complex.y);
    }

    Complex mul(long a) {
        return new Complex(x * a, y * a);
    }

    Complex div(Complex complex) {
        if(complex==null){
            throw new IllegalArgumentException();
        }
        return new Complex((x * complex.x + y * complex.y) / (complex.x * complex.x + complex.y * complex.y), (y * complex.x - x * complex.y) / (complex.x * complex.x + complex.y * complex.y));
    }

    Complex div(long a) {
        return new Complex(x / a, y / a);
    }

    public String toString() {
        return y > 0 ? String.format("%d+%di", x, y) : String.format("%d%di", x, y);
    }

    long getX() {
        return x;
    }

    long getY() {
        return y;
    }

    public void setX(long x) {
        this.x = x;
    }

    public void setY(long y) {
        this.y = y;
    }
}
