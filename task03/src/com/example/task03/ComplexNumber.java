package com.example.task03;

public class ComplexNumber {

    private  double real;
    private double imaginary;

    public ComplexNumber() {
        this.real = 0;
        this.imaginary = 0;
    }
    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public double getReal() {
        return real;
    }
    public void setReal(double real) {
        this.real = real;

    }
    public double getImaginary() {
        return imaginary;
    }
    public void setImaginary(double imaginary) {
        this.imaginary = imaginary;

    }

    public ComplexNumber add(ComplexNumber cnum) {
        return new ComplexNumber(real+cnum.getReal(), imaginary+cnum.getImaginary());
    }
    public ComplexNumber mult(ComplexNumber cnum) {
        double realPart = this.real * cnum.real - this.imaginary * cnum.imaginary;
        double imagPart = this.real * cnum.imaginary + this.imaginary * cnum.real;
        return new ComplexNumber(realPart, imagPart);
    }
    @Override
    public String toString() {
        return this.real + " + " + this.imaginary +"i";
    }
}


//Создайте класс комплексного числа, описав все необходимые свойства. Подберите понятные имена и правильные типы данных
//Опишите в классе конструктор, позволяющий при создании инициализировать все его свойства.
//Добавьте в класс методы, позволяющие вычислить сумму и произведение комплексного числа с другим комплексным числом. Метод должен возвращать новый объект, не изменяя старое
//Используя построенный класс напишите код, где вы создадите два комплексных числа и посчитаете их сумму и произведение.