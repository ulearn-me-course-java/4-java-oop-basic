package com.example.task03;

public class Task03Main {
    public static void main(String[] args) {
        
    }
}
class ComplexNumber {

    private double real;
    private double imaginary;

    public ComplexNumber(double r, double m) {
        this.real = r;
        this.imaginary = m;
    }

    public ComplexNumber() {
    }

    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }

    public ComplexNumber sumWith(ComplexNumber second) {
        return new ComplexNumber(this.real + second.real, this.imaginary + second.imaginary);
    }

    public ComplexNumber diffWith(ComplexNumber second) {
        return new ComplexNumber(this.real - second.real, this.imaginary - second.imaginary);
    }

    public ComplexNumber compWith(ComplexNumber second) {
        return new ComplexNumber(this.real * second.real - this.imaginary * second.imaginary, this.real * second.imaginary + this.imaginary * second.real);
    }

    public ComplexNumber divWith(ComplexNumber second) {
        double new_a = (this.real * second.real + this.imaginary * second.imaginary) / (Math.pow(second.real, 2) + Math.pow(second.imaginary, 2));
        double new_b = (this.imaginary * second.real - this.real * second.imaginary) / (Math.pow(second.real, 2) + Math.pow(second.imaginary, 2));
        return new ComplexNumber(new_a, new_b);
    }

    @Override
    public String toString() {
        return real + (imaginary > 0 ? " + " : " - ") + (imaginary > 0 ? imaginary : -1 * imaginary) + "i";

    }
}
