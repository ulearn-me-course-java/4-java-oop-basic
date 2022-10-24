package com.example.task03;
//Создайте класс комплексного числа, описав все необходимые свойства.
//Подберите понятные имена и правильные типы данных
//Опишите в классе конструктор, позволяющий при создании инициализировать все его свойства.
//Добавьте в класс методы, позволяющие вычислить сумму и
//произведение комплексного числа с другим комплексным числом.
//Метод должен возвращать новый объект, не изменяя старое
//Используя построенный класс напишите код, где вы создадите два комплексных числа
//и посчитаете их сумму и произведение.

public class ComplexNumber {
    private double re;
    private double im;

    ComplexNumber(double re, double im){
        this.re = re;
        this.im = im;
    }

    public ComplexNumber() {
        re = 0;
        im = 0;
    }

    public String toString(){
        return "Complex " + re + (im < 0.0 ? " +" : " + ") + im + "i";
    }

    ComplexNumber mul(ComplexNumber z){
        ComplexNumber res = new ComplexNumber();
        double t = this.re * z.re - this.im * z.im;
        res.im = this.re * z.im + this.im * z.re;
        res.re = t;
        return res;
    }

     ComplexNumber sum(ComplexNumber z){
         ComplexNumber res = new ComplexNumber();
         res.re = this.re + z.re;
         res.im = this.im + z.im;
         return res;
     }

}
