package com.example.task03;

public class Task03Main {
    public static void main(String[] args) {
        ComplexNumber num1 = new ComplexNumber(5, 4);
        ComplexNumber num2 = new ComplexNumber(10, 6);
        ComplexNumber sum = num1.summarizeComplexNumbers(num2);
        ComplexNumber mul = num1.multiplyComplexNumbers(num2);
        System.out.println(sum);
        System.out.println(mul);
    }
}
