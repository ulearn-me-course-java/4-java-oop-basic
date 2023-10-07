package com.example.task03;

public class ComplexNum {
    /* z=x+iy x - вещественная; y - мнимая **/
    private double realPart;
    private double imaginaryPart;

    public ComplexNum(double real,double img){
        realPart=real;
        imaginaryPart=img;
    }

    public ComplexNum sumOfComplexNum(ComplexNum number){
        double realPartSum = realPart + number.realPart;
        double imgPartSum = imaginaryPart + number.imaginaryPart;

        return new ComplexNum(realPartSum,imgPartSum);
    }

    public ComplexNum multiplyOfComplexNum(ComplexNum number){
        double realPartMul = realPart * number.realPart - imaginaryPart * number.imaginaryPart;
        double imgPartMul = realPart * number.imaginaryPart + imaginaryPart * number.realPart;

        return new ComplexNum(realPartMul, imgPartMul);
    }

    public String output(){
        return "ComplexNum= "+realPart+ "+"+imaginaryPart;
    }


}
