package com.example.task03;

/**
 * Создайте класс комплексного числа, описав все необходимые свойства.
 * Подберите понятные имена и правильные типы данных.
 * Опишите в классе конструктор, позволяющий при создании инициализировать все его свойства.
 * Добавьте в класс методы, позволяющие вычислить сумму и произведение комплексного числа с другим комплексным числом.
 * Метод должен возвращать новый объект, не изменяя старое
 * Используя построенный класс напишите код, где вы создадите два комплексных числа и посчитаете их сумму и произведение.
 */
public class ComplexNum {
    private double Re; //действительная
    private double Im; //мнимая

    public ComplexNum(double re, double im) {
        Re = re;
        Im = im;
    }

    public double getRe() {
        return Re;
    }

    public double getIm() {
        return Im;
    }

    static ComplexNum sum(ComplexNum a, ComplexNum b) {
        return new ComplexNum(a.Re + b.Re, a.Im + b.Im);
    }

    //z1=a+bi и z2=c+di => (ac-bd)+i(ad+cb)
    static ComplexNum multiplication(ComplexNum a, ComplexNum b) {
        return new ComplexNum(a.Re * b.Re - a.Im * b.Im, a.Re * b.Im + b.Re * a.Im);
    }

    public String toString() {
        return String.format("%s + %si", Re, Im);
    }

}
