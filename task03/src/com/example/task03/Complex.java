package com.example.task03;

public class Complex {
    private double r;
    private double i;
    public double GetR() { return r; }
    public double GetI() { return i; }

    public Complex(double r, double i){
        this.r = r;
        this.i = i;
    }

    public Complex sum(Complex complex){
        return new Complex(this.r + complex.r, this.i + complex.i);
    }

    public Complex multiply(Complex complex){
        double r = this.r * complex.r - this.i * complex.i;
        double i = this.i * complex.r + this.r * complex.i;
        return new Complex(r, i);
    }

    public String toString() {
        if (i >= 0) {
            return String.format("Z = %f + %f * i", r, i);
        } else {
            return String.format("Z = %f - (%f) * i", r, i);
        }
    }
}
