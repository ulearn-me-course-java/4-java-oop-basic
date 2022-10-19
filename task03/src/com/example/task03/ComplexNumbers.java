package com.example.task03;

public class ComplexNumbers {
    private double real;
    private double image;

    ComplexNumbers (double real, double image) {
        this.real = real;
        this.image = image;
    }

    double getReal() {
        return real;
    }

    void setReal(double real) {
        this.real = real;
    }

    double getImage() {
        return image;
    }

    void setImage(double image) {
        this.image = image;
    }

    public ComplexNumbers Add (ComplexNumbers cn) {
        return new ComplexNumbers((this.real + cn.getReal()),
                                 (this.image + cn.getImage()));
    }

    public ComplexNumbers Mul (ComplexNumbers cn) {
        return new ComplexNumbers((this.real * cn.getReal() - this.image*cn.getImage()),
                                 (this.image * cn.getImage() + this.real * cn.getImage()));
    }

    public static void Print(ComplexNumbers cn){
        String str = String.format("%.2f real part, %.2f image part",cn.getReal(),cn.getImage());
        System.out.println(str);
    }



}
