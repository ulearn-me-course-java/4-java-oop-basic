package com.example.task03;

public class ComplexNumber
{
    // свойства
    int re; // действительная часть
    int im; // мнимая часть

    // конструктор, позволяющий при создании инициализировать все его свойства.
    public ComplexNumber(int re, int im)
    {
        this.re = re;
        this.im = im;
    }

    public String toString()
    {
        if (re == 0)
            return String.format("%di", im);
        if (im == 0)
            return String.format("%d", re);
        return im > 0 ? String.format("%d + %di", re, im) : String.format("%d - %di", re, im * -1);
    }

    // методы, позволяющие вычислить сумму и произведение комплексного числа с другим
    public ComplexNumber add(ComplexNumber complexNumber)
    {
        return new ComplexNumber(re + complexNumber.re, im + complexNumber.im);
    }

    public ComplexNumber mul(ComplexNumber complexNumber)
    {
        return new ComplexNumber(re * complexNumber.re - im * complexNumber.im,
                re * complexNumber.im + im * complexNumber.re);
    }
}
