package com.example.task03;

public class Task03Main {
    public static void main(String[] args) {
        ComplexNumber number1 = new ComplexNumber(1.0, 2.0);
        ComplexNumber number2 = new ComplexNumber(3.0, 4.0);
        ComplexNumber number3 = number1.Add(number2);
        ComplexNumber number4 = number1.Multiply(number2);
        System.out.println("Add R: " + number3.Real);
        System.out.println("Add I: " + number3.Imaginary);
        System.out.println("Mlt R: " + number4.Real);
        System.out.println("Mlt I: " + number4.Imaginary);
    }
}
