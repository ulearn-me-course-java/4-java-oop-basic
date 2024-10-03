package com.example.task03;

public class Task03Main {
    public static void main(String[] args) {
        ComplexNumber a = new ComplexNumber(2, 1);
        ComplexNumber b = new ComplexNumber(3, 2);

        System.out.println(ComplexNumber.Sum(a,b).ToString()); // 5 + 3i
        System.out.println(ComplexNumber.Mul(a,b).ToString()); // 4 + i

    }
}
