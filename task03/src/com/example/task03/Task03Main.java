package com.example.task03;

public class Task03Main {
    public static void main(String[] args) {
        ComplexNumber num1 = new ComplexNumber(1, 2);
        ComplexNumber num2 = new ComplexNumber(2, 3);
        ComplexNumber sumComplexNumber = num1.sum(num2);
        ComplexNumber multiComplexNumber = num1.multiply(num2);
        System.out.println("First number: " + num1);
        System.out.println("Second number: " + num2);
        System.out.println("Sum: " + sumComplexNumber);
        System.out.println("Multi: " + multiComplexNumber);

    }
}
