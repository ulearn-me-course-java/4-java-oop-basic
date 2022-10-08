package com.example.task03;

public class ComplexNumber {
    double real;
    double image;

    public ComplexNumber (double real, double image) {
        this.real = real;
        this.image = image;
    }

    public double getReal() {
        return real;
    }
    public void setReal(double real) {
        this.real = real;
    }

    public double getImage() {
        return image;
    }
    public void setImage(double image) {
        this.image = image;
    }

    ComplexNumber add (ComplexNumber a) {
        double real2 = a.getReal();
        double image2 = a.getImage();
        double newReal = real + real2;
        double newImage = image + image2;
        ComplexNumber result = new ComplexNumber(newReal,newImage);
        return result;
    }
    ComplexNumber mul (ComplexNumber a) {
        double real2 = a.getReal();
        double image2 = a.getImage();
        double newReal = real * real2 - image*image2;
        double newImage = real * image2  + image*real2;
        ComplexNumber result = new ComplexNumber(newReal,newImage);
        return result;
    }

    void print() {
        if(image > 0){
            System.out.println(real + " + " + image + "i");
        }
        else if(image < 0){
            System.out.println(real + "" + image + "i");
        }
        else{
            System.out.println(real);
        }

    }
}
