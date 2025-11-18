package com.example.task03;

public class ComplexNumbers {

    private final double realPart;
    private final double imaginaryPart;

    public ComplexNumbers( double realPart, double imaginaryPart){
        this.realPart = realPart;
        this.imaginaryPart = imaginaryPart;
    }

    public ComplexNumbers add(ComplexNumbers comples){
        return new ComplexNumbers(
                this.realPart + comples.realPart,
                this.imaginaryPart +  comples.imaginaryPart);
    }

    public ComplexNumbers product(ComplexNumbers complex){
        double newReal = (this.realPart * complex.realPart) - (this.imaginaryPart * complex.imaginaryPart);
        double newImaginary = this.realPart * complex.imaginaryPart + this.imaginaryPart * complex.realPart;
        return new ComplexNumbers(newReal, newImaginary);
    }

    public String toString() {
        if (realPart == 0 && imaginaryPart == 0) {
            return "Комплексное число: 0";
        } else if (realPart == 0) {
            return String.format("Комплексное число: %.2fi", imaginaryPart);
        } else if (imaginaryPart == 0) {
            return String.format("Комплексное число: %.2f", realPart);
        } else if (imaginaryPart > 0) {
            return String.format("Комплексное число: %.2f + %.2fi", realPart, imaginaryPart);
        } else {
            return String.format("Комплексное число: %.2f - %.2fi", realPart, -imaginaryPart);
        }
    }
}
