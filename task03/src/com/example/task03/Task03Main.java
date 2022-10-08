package com.example.task03;

public class Task03Main {
    public static void main(String[] args) {
        ComplexNumbers cn = new ComplexNumbers(4, 1);
        ComplexNumbers cn1 = new ComplexNumbers(8, -1);

        cn.Add(cn1);
        cn1.Mul(cn);

        ComplexNumbers.Print(cn1);
        ComplexNumbers.Print(cn);

        ComplexNumbers.Print(cn1.Mul(cn));
        ComplexNumbers.Print(cn.Add(cn1));
    }
}
