package com.example.task03;

public class Task03Main {
    public static void main(String[] args) {
        ComplexNumber complexNumber1 = new ComplexNumber(1, -1);
        ComplexNumber complexNumber2 = new ComplexNumber(3, 6);
        ComplexNumber complexNumber3 = complexNumber1.add(complexNumber2);
        ComplexNumber complexNumber4 = complexNumber1.multiply(complexNumber2);
        System.out.println(complexNumber3);
        System.out.println(complexNumber4);
    }
}
