package com.example.task03;

public class ComplexNumber {
    private int realPart;
    private int imaginaryPart;
    
    public ComplexNumber(int realPart, int imaginaryPart) {
        this.realPart = realPart;
        this.imaginaryPart = imaginaryPart;
    }
    
    public int getRealPart() {
        return realPart;
    }
    
    public void setRealPart(int realPart) {
        this.realPart = realPart;
    }
    
    public int getImaginaryPart() {
        return imaginaryPart;
    }
    
    public void setImaginaryPart(int imaginaryPart) {
        this.imaginaryPart = imaginaryPart;
    }
    
    public ComplexNumber add(ComplexNumber complexNumber) {
        return new ComplexNumber(realPart + complexNumber.getRealPart(), imaginaryPart + complexNumber.getImaginaryPart());
    }
    
    public ComplexNumber multiply(ComplexNumber complexNumber) {
        return new ComplexNumber(realPart * complexNumber.getRealPart() - imaginaryPart * complexNumber.getImaginaryPart(),
            imaginaryPart * complexNumber.getRealPart() + realPart * complexNumber.getImaginaryPart());
    }
    
    @Override
    public String toString() {
        return realPart + " " + (imaginaryPart < 0 ? "-" : "+") + " " + imaginaryPart + "i";
    }
}
