package com.example.task03;

public class Complex {
    double Re;
    double Im;

    public final double getRe() {
        return Re;
    }

    public final double getIm() {
        return Im;
    }

    public void setRe(double re) {
        Re = re;
    }

    public void setIm(double im) {
        Im = im;
    }

    Complex(double Re, double Im) {
        this.Re = Re;
        this.Im = Im;
    }

    Complex(){
        this(0,0);
    }

    final static Complex sum(final Complex num1, final Complex num2) {
        return new Complex(num1.Re+num2.Re, num1.Im + num2.Im);
    }

    final static Complex power(final Complex num1, final Complex num2) {
        return new Complex(num1.Re*num2.Re-num1.Im*num2.Im,num1.Re*num2.Im+num1.Im+num2.Re);
    }
    public final String toString(){
        return "("+this.Re+" , "+this.Im +")";
    }
}
