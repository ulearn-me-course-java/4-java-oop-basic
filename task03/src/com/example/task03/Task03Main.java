package com.example.task03;

public class Task03Main {
    public static void main(String[] args) {
        ComplexNumber first = new ComplexNumber(7, 3);
        ComplexNumber second = new ComplexNumber(5, -8);
        ComplexNumber sum = first.sum(second);
        ComplexNumber mult = first.multiply(second);
        System.out.println ("Sum = " + sum.toString() );
        System.out.println("Mult = " + mult.toString());
    }
}
