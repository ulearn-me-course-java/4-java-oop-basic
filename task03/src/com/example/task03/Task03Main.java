package com.example.task03;

public class Task03Main {
    public static void main(String[] args) {
        ComplexNumber firstComplexNum = new ComplexNumber(16, 4);
        ComplexNumber secondComplexNum = new ComplexNumber(72, 28);

        ComplexNumber sum = firstComplexNum.add(secondComplexNum);
        ComplexNumber multiply = firstComplexNum.multiply(secondComplexNum);

        System.out.println(sum.toStringInTrigonometryForm());
    }
}
