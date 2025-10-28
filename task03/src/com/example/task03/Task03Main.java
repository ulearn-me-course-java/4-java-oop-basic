package com.example.task03;

public class Task03Main {
    public static void main(String[] args) {
        ComplexNumber complexNum1 = new ComplexNumber(2, 3);
        ComplexNumber complexNum2 = new ComplexNumber(2, -4);

        System.out.println(complexNum1);
        System.out.println(complexNum2);

        System.out.println(complexNum1.sumComplexNumber(complexNum2));
        System.out.println(complexNum1.multiplyComplexNumber(complexNum2));
    }
}
