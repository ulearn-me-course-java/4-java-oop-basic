package com.example.task03;

public class ComplexNumber {

    private final double RealPart;
    private final double ImaginaryUnit;

    public double getRealPart(){
        return RealPart;
    }

    public double getImaginaryUnit(){
        return ImaginaryUnit;
    }

    public ComplexNumber(double realPart, double imaginaryUnit){
        RealPart = realPart;
        ImaginaryUnit = imaginaryUnit;
    }

    public ComplexNumber Summa(ComplexNumber value){
        return new ComplexNumber(RealPart + value.RealPart, ImaginaryUnit + value.ImaginaryUnit);
    }

    public ComplexNumber Multip(ComplexNumber value){
        return new ComplexNumber(RealPart * value.RealPart - ImaginaryUnit * value.ImaginaryUnit, RealPart * value.ImaginaryUnit + ImaginaryUnit * value.RealPart);
    }

    public String toString() {
        return String.format("%d real part, %d imaginary unit", RealPart, ImaginaryUnit);
    }

}
