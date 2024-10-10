package com.example.task03;

public class ComplexNumber
{
    private double real;
    private double image;
    public ComplexNumber(double real, double image)
    {
        this.real = real;
        this.image = image;
    }

    public double getReal()
    {
        return real;
    }

    public void setReal(double real)
    {
        this.real = real;
    }

    public double getImage()
    {
        return image;
    }

    public void setImage(double image)
    {
        this.image = image;
    }

    public ComplexNumber add(ComplexNumber complexNum)
    {
        double newReal = this.real + complexNum.getReal();
        double newImage = this.image + complexNum.getImage();

        return new ComplexNumber(newReal, newImage);
    }

    public ComplexNumber multiply(ComplexNumber complexNum)
    {
        double newReal = real * complexNum.getReal() - image * complexNum.getImage();
        double newImage = real * complexNum.getImage() + image * complexNum.getReal();

        return new ComplexNumber(newReal, newImage);
    }

    public String toString()
    {
        return real + " + " + image + "i";
    }
}