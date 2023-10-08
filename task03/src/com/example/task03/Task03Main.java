package com.example.task03;

public class Task03Main {
    public static void main(String[] args) {

        ComplexNumber complex1 = new ComplexNumber(4, 6);
        ComplexNumber complex2 = new ComplexNumber(8, 3);
        ComplexNumber summa = complex1.Summa(complex2);
        ComplexNumber multip = complex1.Multip(complex2);
        System.out.println(summa);
        System.out.println(multip);
    }
}