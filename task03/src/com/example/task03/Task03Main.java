package com.example.task03;

public class Task03Main {
    public static void main(String[] args) {
        ComplexNumber complexNum1 = new ComplexNumber(1, 3);
        ComplexNumber complexNum2 = new ComplexNumber(1, -4);

        System.out.println(complexNum1);
        System.out.println(complexNum2);

        System.out.println(complexNum1.sumComplexNum(complexNum2));
        System.out.println(complexNum1.multiplyComplexNum(complexNum2));
    }
}
