package com.example.task03;

public class Task03Main
{
    public static void main(String[] args)
    {
        ComplexN z1 = new ComplexN(1, 2);
        ComplexN z2 = new ComplexN(-5, 3);
        System.out.println(z1); //1+2i
        System.out.println(z2); //-5+3i
        System.out.println(z1.add(z2)); //-4+5i
        System.out.println(z1.multiply(z1)); //-3+4i
    }
}