package com.example.task03;

public class Complex {
    private double Re;
    private double Im;

    Complex() {
    }

    Complex(double Re, double Im) {
        this.Re = Re;
        this.Im = Im;
    }

    public Complex plus(Complex number1) {
        Complex number2 = this;
        double re = number2.Re + number1.Re;
        double im = number2.Im + number1.Im;
        return new Complex(re, im);
    }

    public Complex mult(Complex number1) {
        Complex number2 = this;
        double re = number2.Re * number1.Re - number2.Im * number1.Im;
        double im = number2.Re * number1.Im + number2.Im * number1.Re;
        return new Complex(re, im);
    }

    public String toString() {
        if (Im == 0) return Re + "";
        if (Re == 0) return Im + "i";
        if (Im < 0) return Re + " - " + (-Im) + "i";
        return Re + " + " + Im + "i";
    }
}