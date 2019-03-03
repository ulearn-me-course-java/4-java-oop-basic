package com.example.task03;

public class Complex {
    private final double real, image;

    public double getReal() {
        return real;
    }

    public double getImage() {
        return image;
    }

    Complex(double real, double imag) {
        this.real = real;
        this.image = imag;
    }

    @Override
    public String toString() {
        return image > 0 ? String.format("(%e + %ej)", real, image) : String.format("(%e - %ej)", real, Math.abs(image));
    }

    Complex add(Complex complex){
        return new Complex(real + complex.real, image + complex.image);
    }

    Complex multiply(Complex complex){
        return new Complex(real * complex.real - image * complex.image,
                real * complex.image + image * complex.real);
    }
}
