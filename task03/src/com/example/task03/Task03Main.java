package com.example.task03;

public class Task03Main {
    public static void main(String[] args) {

        ComplexNumber complex1 = new ComplexNumber(3, 4);
        ComplexNumber complex2 = new ComplexNumber(1, 2);

        ComplexNumber summComplex = complex1.add(complex2);
        ComplexNumber difComplex = complex1.subtract(complex2);

        System.out.println(complex1.toString() + " + " + complex2.toString() + " = " + summComplex.toString());
        System.out.println(complex1.toString() + " - " + complex2.toString() + " = " + difComplex.toString());
    }
}
