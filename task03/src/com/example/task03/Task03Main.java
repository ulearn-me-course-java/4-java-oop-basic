package com.example.task03;

public class Task03Main
{
    public static void main(String[] args)
    {
        ComplexNumber first = new ComplexNumber(5, -12);
        ComplexNumber second = new ComplexNumber(2, 7);

        ComplexNumber sum = first.add(second);
        ComplexNumber mul = first.mul(second);

        System.out.println(sum.toString());
        System.out.println(mul.toString());
    }
}
