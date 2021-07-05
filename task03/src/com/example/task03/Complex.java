package com.example.task03;

public class Complex {
    private double real;
    private double ig;

    public Complex(double real, double ig){
        this.real = real;
        this.ig = ig;
    }

    public double getReal(){
        return real;
    }

    public double getIg(){
        return ig;
    }

    public Complex plus(Complex a){
        return new Complex(this.real+a.real, this.ig + a.ig);
    }

    public Complex multiply(Complex a){
        return new Complex(this.real*a.real - this.ig*a.ig, this.real*a.ig+this.ig*a.real);
    }
    String tostring() {
        return real + " + (" + ig + ")i";
    }
}
