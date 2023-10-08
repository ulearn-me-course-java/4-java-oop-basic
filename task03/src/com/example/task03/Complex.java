package com.example.task03;

public class Complex {

    private final float realPart;
    private final float imaginaryPart;

    public Complex(float realPart, float imaginaryPart) {
        this.realPart = realPart;
        this.imaginaryPart = imaginaryPart;
    }

    public Complex add(Complex comlex){
        Complex res = new Complex(this.realPart + comlex.realPart,
                this.imaginaryPart + comlex.imaginaryPart);

        return res;
    }

    public Complex multiply(Complex complex){
        Complex res = new Complex(this.realPart * complex.realPart - this.imaginaryPart * complex.imaginaryPart,
                this.realPart * complex.imaginaryPart + this.imaginaryPart * complex.realPart);

        return res;
    }

    public String toString(){
        return this.realPart +  " + " + this.imaginaryPart + "i";
    }

}
