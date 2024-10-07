package com.example.task03;

public class ComplexNumber {
    private final double realPart;
    private final double complexPart;

    public ComplexNumber(double realPart, double complexPart){
        this.realPart = realPart;
        this.complexPart = complexPart;
    }
    public ComplexNumber sumNumbers(ComplexNumber number){
        double realParts = realPart + number.realPart;
        double complexParts = complexPart + number.complexPart;
        return new ComplexNumber(realParts, complexParts);
    }
    public ComplexNumber multiplyNumbers(ComplexNumber number){
        double realParts = realPart * number.realPart - complexPart * number.complexPart;
        double complexParts = realPart * number.complexPart + complexPart * number.realPart;
        return new ComplexNumber(realParts, complexParts);
    }

    @Override
    public String toString() {
        if (complexPart >= 0) {
            return String.format("%.2f + %.2fi", realPart, complexPart);
        } else {
            return String.format("%.2f - %.2fi", realPart, -complexPart);
        }
    }
}
