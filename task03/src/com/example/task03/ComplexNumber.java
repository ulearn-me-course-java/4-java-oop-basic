package com.example.task03;

public class ComplexNumber {
    private double realPart;
    private double imaginePart;

    public ComplexNumber(double realPart, double imaginePart){
        this.realPart = realPart;
        this.imaginePart = imaginePart;
    }

    public void setRealPart(double realPart) {
        this.realPart = realPart;
    }

    public void setImaginePart(double imaginePart) {
        this.imaginePart = imaginePart;
    }

    public double getRealPart() {
        return realPart;
    }

    public double getImaginePart() {
        return imaginePart;
    }

    public ComplexNumber add(ComplexNumber num){
        double realResult = realPart + num.realPart;
        double imagineResult = imaginePart + num.imaginePart;
        return new ComplexNumber(realResult, imagineResult);
    }

    public ComplexNumber multiply(ComplexNumber num){
        double realResult = (realPart * num.realPart) - (imaginePart * num.imaginePart);
        double imagineResult = (imaginePart * num.realPart) + (num.imaginePart * realPart);
        return new ComplexNumber(realResult, imagineResult);
    }

    public String toString(){
        if(imaginePart == 0){
            return String.format("%.2f", realPart);
        } else if (imaginePart > 0) {
            return String.format("%.2f + %.2fi", realPart, imaginePart);
        }
        return String.format("%.2f - %.2fi", realPart, -imaginePart);
    }
}
