package com.example.task03;

public class Task03Main {
    public static void main(String[] args) {
        ComplexNumber a = new ComplexNumber(2, 2);
        ComplexNumber b = new ComplexNumber(1, 1);
        System.out.println(a.getMainPart() + "+" + a.getComplexPart() + "i");
        System.out.println(b.getMainPart() + "+" + b.getComplexPart() + "i");
        System.out.println("Summing numbers - " + a.add(b));
        System.out.println("Multiply numbers - " + a.mul(b));
    }
}
