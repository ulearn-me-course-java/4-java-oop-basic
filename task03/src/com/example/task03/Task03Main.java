package com.example.task03;

public class Task03Main {
    public static void main(String[] args) {
        ComplexNum complexNum1 = new ComplexNum(2, 3);
        ComplexNum complexNum2 = new ComplexNum(2, -4);

        System.out.println(complexNum1);
        System.out.println(complexNum2);

        System.out.println(complexNum1.sumComplexNum(complexNum2));
        System.out.println(complexNum1.multiplyComplexNum(complexNum2));
    }
}

