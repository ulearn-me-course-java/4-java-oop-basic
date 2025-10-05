package com.example.task03;

public class Task03Main {
    public static void main(String[] args) {
        ComplexNumber first = new ComplexNumber(4.5, 8.2);
        ComplexNumber second = new ComplexNumber(2, 6);
        ComplexNumber sum = first.sumComplexNumbers(second);
        ComplexNumber mul = first.multiplyComplexNumbers(second);
        System.out.println(sum.toString());
        System.out.println(mul.toString());
    }
}
