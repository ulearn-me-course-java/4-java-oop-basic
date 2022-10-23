package com.example.task03;

public class Task03Main {
    public static void main(String[] args) {
        ComplexNumber cn1 = new ComplexNumber(1.5, 3);
        ComplexNumber cn2 = new ComplexNumber(5, 4);
        System.out.println(cn1.Add(cn2).toString());
        System.out.println(cn1.Mul(cn2).toString());

    }
}
