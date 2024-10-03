package com.example.task03;

public class ComplexNunber {
    public double matrialPaertOfNumber;
    public double imaginaryPartOfNumber;

    public ComplexNunber(double matrialPaertOfNumber, double imaginaryPartOfNumber){
        this.imaginaryPartOfNumber = imaginaryPartOfNumber;
        this.matrialPaertOfNumber = matrialPaertOfNumber;
    }

    public  ComplexNunber multiplication(ComplexNunber number){
        return new ComplexNunber(matrialPaertOfNumber * number.matrialPaertOfNumber - imaginaryPartOfNumber * number.imaginaryPartOfNumber, matrialPaertOfNumber * number.imaginaryPartOfNumber + imaginaryPartOfNumber * number.matrialPaertOfNumber);
    }

    public ComplexNunber sum(ComplexNunber number){
        return new ComplexNunber(matrialPaertOfNumber + number.matrialPaertOfNumber, imaginaryPartOfNumber + number.imaginaryPartOfNumber);
    }

}
