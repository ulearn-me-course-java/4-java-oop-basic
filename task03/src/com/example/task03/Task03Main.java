package com.example.task03;

public class Task03Main {
    public static void main(String[] args)
    {
        ComplexNumber complexNumber1 = new ComplexNumber(4.5, 2.5);
        ComplexNumber complexNumber2 = new ComplexNumber(6, 3);
        ComplexNumber result = complexNumber1.add(complexNumber2);
        ComplexNumber result2 = complexNumber2.add(complexNumber1);
        ComplexNumber result4 = complexNumber1.multiply(complexNumber2);
        ComplexNumber result3 = complexNumber2.multiply(complexNumber1);
        System.out.println(result.toString());
        System.out.println(result2.toString());
        System.out.println(result3.toString());
        System.out.println(result4.toString());
    }
}
