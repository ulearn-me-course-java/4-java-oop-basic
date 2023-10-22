package com.example.task03;

public class ComplexNumber {
    //Поля класса
    private final double Real;
    private final double Imaginary;

    public double getReal() {
        return Real;
    }

    public double getImaginary() {
        return Imaginary;
    }
    //Конструктор класса
    public ComplexNumber(double re, double im) {
        this.Real = re;
        this.Imaginary = im;
    }
    //метод для сложения двух комплексных чисел. Он создает новое комплексное число,
    //в котором действительная и мнимая части являются суммой соответствующих
    // частей текущего объекта и объекта, переданного в качестве аргумента.
    public ComplexNumber Add(ComplexNumber term) {
        return new ComplexNumber(this.Real + term.Real, this.Imaginary + term.Imaginary);
    }
    // метод для умножения двух комплексных чисел. Он создает новое комплексное число,
    // в котором действительная и мнимая части вычисляются согласно формуле для произведения комплексных чисел.
    public ComplexNumber Multiply(ComplexNumber term) {
        return new ComplexNumber(this.Real * term.Real - this.Imaginary * term.Imaginary,
                this.Real * term.Imaginary + this.Imaginary * term.Real);
    }

    public String toString() {
        return String.format("%s real, %s imaginary", this.Real, this.Imaginary);
    }
}