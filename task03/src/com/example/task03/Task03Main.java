package com.example.task03;

public class Task03Main {
    public static void main(String[] args) throws Exception {
        ComplexNumber complexNumber1 = new ComplexNumber("123.13+342.1i");
        ComplexNumber complexNumber2 = new ComplexNumber(24.43,23.344);
        ComplexNumber abc = complexNumber1.sum(complexNumber2);
    }
}

