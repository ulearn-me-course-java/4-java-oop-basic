package com.example.task03;

public class Complex {
    double a;
    double b;
    public String GetComplex()
    {
        return Double.toString(a) + " + " + Double.toString(b) + "i";
    }
    public Complex(double a, double b){
        this.a = a;
        this.b = b;
    }
    public Complex Add(Complex comp){
        return new Complex(this.a + comp.a, this.b + comp.b);
    }
    public Complex Mul(Complex comp){
        return new Complex(this.a * comp.a - this.b * comp.b,this.b * comp.a + this.a * comp.b);
    }
}
