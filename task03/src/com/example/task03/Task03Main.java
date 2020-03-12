package com.example.task03;

public class Task03Main {
    public static void main(String[] args) {
        ComplexNumber complexNum1 = new ComplexNumber();
        complexNum1.real = 2;
        complexNum1.imaginary = -3;
        ComplexNumber complexNum2 = new ComplexNumber(-1, 1);
        ComplexNumber sumOfComplexNumbers = complexNum1.add(complexNum2);
        System.out.println(sumOfComplexNumbers);
        ComplexNumber multiplyOfComplexNumbers = complexNum1.multiply(complexNum2);
        System.out.println(multiplyOfComplexNumbers);
    }
}
