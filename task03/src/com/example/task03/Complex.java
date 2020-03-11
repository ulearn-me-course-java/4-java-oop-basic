package com.example.task03;

public class Complex
{
    int Re;
    int Im;

    public Complex(int re,int im)
    {
        Re = re;
        Im = im;
    }
    public static Complex Plus(Complex digit1,Complex digit2)
    {
        Complex result = new Complex(digit1.Re + digit2.Re, digit1.Im + digit2.Im);
        return result;
    }

    public static Complex Multiply(Complex digit1,Complex digit2)
    {
        int re = (digit1.Re * digit2.Re) - (digit1.Im * digit2.Im);
        int im = (digit1.Im * digit2.Re) + (digit1.Re * digit2.Im);
        Complex result = new Complex(re,im);
        return result;
    }
}
