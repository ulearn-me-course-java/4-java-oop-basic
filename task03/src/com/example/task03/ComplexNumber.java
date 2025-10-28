package com.example.task03;

public class ComplexNumber {
    private final double realPart;
    private final double imgPart;

    public ComplexNumber(double realPart, double imgPart){
        this.realPart = realPart;
        this.imgPart = imgPart;
    }

    public double getRealPart(){
        return realPart;
    }

    public double getImgPart(){
        return imgPart;
    }

    public ComplexNumber sumComplexNumber(ComplexNumber complexNumber){
        double newRealPart = realPart + complexNumber.realPart;
        double newImaginaryPart = imgPart + complexNumber.imgPart;
        return new ComplexNumber(newRealPart, newImaginaryPart);
    }

    public ComplexNumber multiplyComplexNumber(ComplexNumber complexNumber){
        double newRealPart = realPart * complexNumber.realPart - imgPart * complexNumber.imgPart;
        double newImaginaryPart = realPart * complexNumber.imgPart + complexNumber.realPart * imgPart;
        return new ComplexNumber(newRealPart, newImaginaryPart);
    }

    public String toString(){
        if (imgPart < 0){
            return realPart + " - " + Math.abs(imgPart) + "i";
        }
        return realPart + " + " + imgPart + "i";
    }
}
