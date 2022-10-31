package com.example.task03;

public class Task03Main {
    public static void main(String[] args) {
        ComplexNumber number1 = new ComplexNumber(1, 3);
        ComplexNumber number2 = new ComplexNumber(2, 4);
        ComplexNumber number3 = number1.add(number2);
        ComplexNumber number4 = number2.multiply(number1);
        System.out.println("add real: " + number3.real);
        System.out.println("add imaginary: " + number3.imaginary);
        System.out.println("multiply real: " + number4.real);
        System.out.println("multiply imaginary: " + number4.imaginary);
    }
}
