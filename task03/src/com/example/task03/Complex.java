package com.example.task03;

public class Complex {

    double a, b;

    public Complex(double a, double b){
        this.a = a;
        this.b = b;
    }

    public Complex(){
        this(0,0);
    }


    public Complex add(Complex complex){
        return new Complex(a+complex.a, b+complex.b);
    }

    public Complex sub(Complex complex){
        return new Complex(a-complex.a, b-complex.b);
    }

    public Complex mult(Complex complex){
        return new Complex(a*complex.a+complex.b*b*-1, a*complex.b+b*complex.a);
    }

    public String toString() {
        return b<0 ? a+""+b+"i":a+"+"+b+"i";
    }
}
