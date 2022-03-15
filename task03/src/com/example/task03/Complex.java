package com.example.task03;

public class Complex {
    private double real;
    private double image;

    public Complex(double real, double image) {
        this.real = real;
        this.image = image;
    }
    public double getReal() {
        return real;
    }
    public void setReal(double realNumber) {
        real = realNumber;
    }

    public double getImage() {
        return image;
    }
    public void setImage(double imageNumber) {
        image = imageNumber;
    }
    public Complex add(Complex number) {
        double newReal = number.getReal();
        double newImage = number.getImage();
        double add1 = newReal + real;
        double add2 = newImage + image;
        Complex result = new Complex(add1, add2);
        return  result;
    }
    public Complex mult(Complex number) {
        double newReal = number.getReal();
        double newImage = number.getImage();
        double mult1 = real*newReal - image*newImage;
        double mult2 = real*newImage + image*newReal;
        Complex result = new Complex(mult1, mult2);
        return  result;
    }
}
