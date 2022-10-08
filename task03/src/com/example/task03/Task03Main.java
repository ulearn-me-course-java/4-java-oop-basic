package com.example.task03;

public class Task03Main {
    public static void main(String[] args) {
        ComplexNumber c1 = new ComplexNumber(10, 45);
        ComplexNumber c2 = new ComplexNumber(6, 112);

        System.out.print("ComplexNumber 1: ");
        c1.print();
        System.out.print("ComplexNumber 2: ");
        c2.print();
        c2.add(c1).print();
        c2.mul(c1).print();
    }
}
