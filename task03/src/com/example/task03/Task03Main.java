package com.example.task03;

public class Task03Main {
    public static void main(String[] args) {
        ComplexNumber first = new ComplexNumber(1, -5);
        ComplexNumber second = new ComplexNumber(2, 4);

        ComplexNumber addition = first.add(second);
        ComplexNumber multiplication = first.multiply(second);

        System.out.println("Сумма = " + addition.toString());
        System.out.println("Произведение = " + multiplication.toString());
    }
}
