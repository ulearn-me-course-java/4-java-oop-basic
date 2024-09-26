package com.example.task03;

public class Task03Main {
    public static void main(String[] args)
    {
        ComplexNumber complex1 = new ComplexNumber(3, 8);
        ComplexNumber complex2 = new ComplexNumber(4, 6);

        ComplexNumber sum = complex1.ComplexAdd(complex2);
        System.out.println(sum.toString());
        ComplexNumber multi = complex1.ComplexMulti(complex2);
        System.out.println(multi.toString());
    }
}
