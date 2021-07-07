package com.example.task03;

public class Task03Main {
    public static void main(String[] args) {
        ComplexNumber z1 = new ComplexNumber(-2,4);
        ComplexNumber z2 = new ComplexNumber(9,-6);
        System.out.println((z1.add(z2)).tostring());
        System.out.println((z1.multiply(z2)).tostring());

    }
}
