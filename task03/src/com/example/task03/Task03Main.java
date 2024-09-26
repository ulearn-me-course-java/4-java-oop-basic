package com.example.task03;

public class Task03Main {
    public static void main(String[] args) {
        ComplexNumber number1 = new ComplexNumber(3, 5);
        ComplexNumber number2 = new ComplexNumber(2, 7);

        ComplexNumber sum = number1.addComplexs(number2);
        ComplexNumber mult = number1.multiplyComplexs(number2);

        System.out.println(number1);
        System.out.println(number2);
        System.out.println(sum);
        System.out.println(mult);
    }
}
