package com.example.task03;

public class Task03Main {
    public static void main(String[] args) {
        ComplexNumber num1 = new ComplexNumber(2, -3f);
        ComplexNumber num2 = new ComplexNumber(2, 10);
        ComplexNumber sum = ComplexNumber.Add(num1, num2);
        ComplexNumber mul = ComplexNumber.Multiplue(num1, num2);

        System.out.println(ComplexNumber.ToString(sum));
    }
}
