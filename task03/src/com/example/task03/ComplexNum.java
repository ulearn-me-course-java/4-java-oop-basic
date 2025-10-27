package com.example.task03;

public class ComplexNum {
    private final double realPart;
    private final double imgPart;

    public ComplexNum(double realPart, double imgPart){
        this.realPart = realPart;
        this.imgPart = imgPart;
    }

    public double getRealPart(){
        return realPart;
    }

    public double getImgPart(){
        return imgPart;
    }

    public ComplexNum sumComplexNum(ComplexNum complexNum){
        double newRealPart = realPart + complexNum.realPart;
        double newImaginaryPart = imgPart + complexNum.imgPart;
        return new ComplexNum(newRealPart, newImaginaryPart);
    }

    public ComplexNum multiplyComplexNum(ComplexNum complexNum){
        double newRealPart = realPart * complexNum.realPart - imgPart * complexNum.imgPart;
        double newImaginaryPart = realPart * complexNum.imgPart + complexNum.realPart * imgPart;
        return new ComplexNum(newRealPart, newImaginaryPart);
    }

    public String toString(){
        if (imgPart < 0){
            return realPart + " - " + Math.abs(imgPart) + "i";
        }
        return realPart + " + " + imgPart + "i";
    }
}


