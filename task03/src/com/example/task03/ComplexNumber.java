package com.example.task03;

public class ComplexNumber {

    float Real;
    float Imaginary;

    public ComplexNumber(float real, float imaginary)
    {
        this.Real = real;
        this.Imaginary = imaginary;
    }

    ComplexNumber add(ComplexNumber num)
    {
        return (new ComplexNumber(this.Real + num.Real, this.Imaginary + num.Imaginary));
    }


    ComplexNumber multiply(ComplexNumber num)
    {
        ComplexNumber result = new ComplexNumber(this.Real * num.Real - this.Imaginary * num.Imaginary,
                this.Real * num.Imaginary + num.Real * this.Imaginary);

        return result;
    }

    public String toString()
    {
        return new String(this.Real + " + " + this.Imaginary + " * i");
    }


}
