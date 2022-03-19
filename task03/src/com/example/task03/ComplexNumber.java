package com.example.task03;

public class ComplexNumber {
    private double realPart;
    private double imaginaryPart;
    private final int imaginaryOne = -1;

    public ComplexNumber(double realPart, double imaginaryPart){
        this.realPart = realPart;
        this.imaginaryPart = imaginaryPart;
    }
    public double getRealPart(){
        return realPart;
    }
    public double getImaginaryPart(){
        return imaginaryPart;
    }
    public ComplexNumber add(ComplexNumber num){
        ComplexNumber res =
                new ComplexNumber(realPart + num.getRealPart(),
                                imaginaryPart + num.getImaginaryPart());

        return res;
    }
    public ComplexNumber multiply(ComplexNumber num){
        double real = realPart * num.getRealPart() - imaginaryPart * num.getImaginaryPart();
        double imag = realPart * num.getImaginaryPart() + num.getRealPart() * imaginaryPart;
        ComplexNumber res = new ComplexNumber(real, imag);

        return res;
    }
    public String toString(){
        if(Double.toString(realPart).contains(".0")
            && Double.toString(imaginaryPart).contains(".0")) {
                int intRealP = (int)realPart;
                int intImagP = (int)imaginaryPart;
                if(imaginaryPart < 0) return intRealP + "" + intImagP + "i";
                else return  intRealP + "+" + intImagP + "i";
        }
        if(imaginaryPart < 0) return realPart + "" + imaginaryPart + "i";
        else return realPart + "+" + imaginaryPart + "i";
    }
}
