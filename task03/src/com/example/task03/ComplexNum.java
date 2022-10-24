package com.example.task03;

public class ComplexNum {
    private double realPart;
    private  double imaginaryPart;
    public ComplexNum(double realPart, double imaginaryPart){
        this.realPart = realPart;
        this.imaginaryPart = imaginaryPart;
    }
    public ComplexNum sum(ComplexNum num){
        ComplexNum result = new ComplexNum(realPart = this.realPart + num.realPart, imaginaryPart = this.imaginaryPart + num.imaginaryPart);
        return result;
    }
    public ComplexNum multiply(ComplexNum num){
        ComplexNum result = new ComplexNum(realPart = this.realPart * num.realPart, imaginaryPart = this.imaginaryPart * num.imaginaryPart);
        return result;
    }
    public String toString(){
        return (this.realPart + " + " + this.imaginaryPart + "i");
    }
}
