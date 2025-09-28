package com.example.task03;

import java.text.MessageFormat;

public class Task03Main {
    public static void main(String[] args) {
        ComplexNum num1 = new ComplexNum(5, -3.6);
        ComplexNum num2 = new ComplexNum(1, 2);

        System.out.println("Сумма комплексных чисел: " + num1.add(num2));
        System.out.println("Произведение комплексных чисел: " + num1.mult(num2));
    }
}
