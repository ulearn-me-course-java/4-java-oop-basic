package com.example.task03;

public class Task03Main {
    public static void main(String[] args) {
        ComplexNumber complexNumber1 = new ComplexNumber(5, 6);
        ComplexNumber complexNumber2 = new ComplexNumber(-10, -8);
        ComplexNumber sumComplexNumber = complexNumber1.add(complexNumber2);
        ComplexNumber multiComplexNumber = complexNumber1.multiply(complexNumber2);
        System.out.println("First number: " + complexNumber1);
        System.out.println("Second number: " + complexNumber2);
        System.out.println("Sum: " + sumComplexNumber); // Sum: Z = -5,00 + (-2,00) * i
        System.out.println("Multi: " + multiComplexNumber); // Multi: Z = -2,00 + (-100,00) * i
    }
}
