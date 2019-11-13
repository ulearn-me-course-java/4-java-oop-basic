package com.example.task03;

public class Complex {
    private double Re;
    private double Im;

    Complex(double Re, double Im) {
        this.Re = Re;
        this.Im = Im;
    }

    Complex() {
        this(0, 0);
    }

    Complex add(Complex num2) {
        if (num2 == null) {
            throw new IllegalArgumentException();
        }
        return new Complex(Re + num2.Re, Im + num2.Im);
    }

    Complex mul(Complex num) {
        if (num == null) {
            throw new IllegalArgumentException();
        }
        return new Complex(Re * num.Re - Im * num.Im, Re * num.Im + Im * num.Re);
    }

    public final String toString() {
        if (Im < 0) {
            return Re + " - " + (-Im) + "i";
        }
        return Re + " + " + Im + "i";
    }
}
