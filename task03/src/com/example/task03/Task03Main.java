package com.example.task03;

public class Task03Main {
    public static void main(String[] args) {
        ComplexNumber first = new ComplexNumber(5.5, 0);
        ComplexNumber second = new ComplexNumber(-3, 2);
        ComplexNumber sum = first.add(second);
        ComplexNumber mul = first.multiply(second);
        System.out.println("Первое число");
        first.print();
        System.out.println("Второе число");
        second.print();
        System.out.println("Сумма");
        sum.print();
        System.out.println("Произведение");
        mul.print();
    }
}
