package com.example.task03;

public class ComplexNumber {
    private int realPart;
    private int imaginaryPart;

    ComplexNumber(int realPart, int imaginaryPart ){
        this.realPart = realPart;
        this.imaginaryPart = imaginaryPart;
    }

    public ComplexNumber amount(ComplexNumber term){
        return new ComplexNumber(this.realPart + term.realPart, this.imaginaryPart + term.imaginaryPart);
    }

    public ComplexNumber multiplication(ComplexNumber multiplier){
        int tempRealPart = this.realPart * multiplier.realPart - this.imaginaryPart * multiplier.imaginaryPart;
        int tempImaginaryPart = this.realPart * multiplier.imaginaryPart + this.imaginaryPart * multiplier.realPart;
        return new ComplexNumber(tempRealPart, tempImaginaryPart);
    }

    public void print(){
        System.out.println(String.format("(%d + %di)", realPart, imaginaryPart));
    }
}
