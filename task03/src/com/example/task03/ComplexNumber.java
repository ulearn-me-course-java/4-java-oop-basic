package com.example.task03;

public class ComplexNumber {
    private double imaginaryPart, realPart;

    public double getImaginaryPart() {
        return imaginaryPart;
    }

    public double getRealPart() {
        return realPart;
    }

    public void setImaginaryPart(double imaginaryPart) {
        this.imaginaryPart = imaginaryPart;
    }

    public void setRealPart(double realPart) {
        this.realPart = realPart;
    }

    ComplexNumber(double realPart, double imaginaryPart)  {
        this.imaginaryPart = imaginaryPart;
        this.realPart = realPart;
    }

    ComplexNumber addition(ComplexNumber addendum) {
        double rPart = realPart + addendum.realPart;
        double iPart = imaginaryPart + addendum.imaginaryPart;
        return new ComplexNumber(rPart, iPart);
    }

    ComplexNumber subtraction(ComplexNumber quotient) {
        double rPart = realPart - quotient.realPart;
        double iPart = imaginaryPart - quotient.imaginaryPart;
        return new ComplexNumber(rPart, iPart);
    }

    ComplexNumber multiplication(ComplexNumber multiplier) {
        double rPart = realPart * multiplier.realPart - imaginaryPart * multiplier.imaginaryPart;
        double iPart = realPart * multiplier.imaginaryPart + imaginaryPart * multiplier.realPart;
        return new ComplexNumber(rPart, iPart);
    }

    ComplexNumber division(ComplexNumber divider) {
        double realDivident = realPart * divider.realPart + imaginaryPart * divider.imaginaryPart;
        double div = divider.realPart * divider.realPart + divider.imaginaryPart * divider.imaginaryPart;
        double rPart = realDivident / div;

        double imaginaryDivident = divider.realPart * realPart + realPart * divider.imaginaryPart;
        double iPart = imaginaryDivident / div;
        return new ComplexNumber(rPart, iPart);
    }

    public String toString()  {
        return imaginaryPart > 0 ? String.format("%1.1f + %1.1fi", realPart, imaginaryPart)
                : String.format("%1.1f - %1.1fi", realPart, Math.abs(imaginaryPart));
    }
}