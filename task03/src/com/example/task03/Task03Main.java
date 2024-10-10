package com.example.task03;

public class Task03Main {
    public static void main(String[] args) {
    ComplexNumber num1 = new ComplexNumber(10, -2.5);
    ComplexNumber num2 = new ComplexNumber(1, 2);
    ComplexNumber sum = ComplexNumber.add(num1, num2);
    ComplexNumber product = ComplexNumber.multiply(num1, num2);
    System.out.println(sum.toString());
    }
}
