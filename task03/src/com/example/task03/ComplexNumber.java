package com.example.task03;

public class ComplexNumber {
    private final double RealPart;
    private final double ImaginaryPart;

    public ComplexNumber(double realPart, double imaginaryPart) {
        RealPart = realPart;
        ImaginaryPart = imaginaryPart;
    }

    public ComplexNumber summarizeComplexNumbers(ComplexNumber number) {
        double realParts = RealPart + number.RealPart;
        double imaginaryParts = ImaginaryPart + number.ImaginaryPart;
        return new ComplexNumber(realParts, imaginaryParts);
    }

    public ComplexNumber multiplyComplexNumbers(ComplexNumber number) {
        double a = RealPart * number.RealPart - ImaginaryPart * number.ImaginaryPart;
        double b = RealPart * number.ImaginaryPart + ImaginaryPart * number.RealPart;
        return new ComplexNumber(a, b);
    }

    public String toString() {
        String complexOneUnit = "i";
        return (ImaginaryPart > 0) ? RealPart + "+" + ImaginaryPart + complexOneUnit : RealPart + "" + ImaginaryPart + complexOneUnit;
    }
}
