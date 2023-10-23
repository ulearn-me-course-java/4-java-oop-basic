package com.example.task03;

public class Task03Main {
    public static void main(String[] args) {
        ComplexNumber complexNumber1 = new ComplexNumber(1, Math.sqrt(5));
        ComplexNumber complexNumber2 = new ComplexNumber(2, Math.sqrt(3));
        System.out.println(complexNumber1.add(complexNumber2));
        System.out.println(complexNumber1.mul(complexNumber2));
    }
}
