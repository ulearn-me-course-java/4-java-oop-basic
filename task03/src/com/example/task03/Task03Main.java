package com.example.task03;

public class Task03Main {
    public static void main(String[] args) {
        ComplexNum n1 = new ComplexNum(1, -2);
        ComplexNum n2 = new ComplexNum(3, 4);
        ComplexNum n3 = n1.SumNum(n2);
        n3.WriteNum();
        n3 = n1.MultiNum(n2);
        n3.WriteNum();
    }
}
