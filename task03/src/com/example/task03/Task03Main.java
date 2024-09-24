package com.example.task03;

public class Task03Main {
    public static void main(String[] args) {
        ComplexNumber firstNumber = new ComplexNumber(5, 7);
        ComplexNumber secondNumber = new ComplexNumber(4, 8);
        ComplexNumber sum = firstNumber.sumOfComplexNumber(secondNumber);
        ComplexNumber mul = firstNumber.multiplyOfComplexNumber(secondNumber);
        ComplexNumber diff = firstNumber.diffOfComplexNumber(secondNumber);
        System.out.println(sum);
        System.out.println(mul);
        System.out.println(diff);
    }
}
