package com.example.task03;

public class ComplexNumber {
//Комплексное число — это выражение вида a + bi, где a, b — действительные числа

    private double validPart; //действительная часть а
    private double imaginaryPart; //мнимая часть b

    public ComplexNumber (double validPart, double imaginaryPart){
        this.validPart = validPart;
        this.imaginaryPart = imaginaryPart;
        //ВОТ ЭТО КОНСТРУКТОР
    }

    /* Добавьте в класс методы, позволяющие вычислить сумму и произведение
    комплексного числа с другим комплексным числом.
    Метод должен возвращать новый объект, не изменяя старое

    z1+z2=(a1+а2i)+(b1+b2i)
    z1⋅z2=(x1+y1i)⋅(x2+y2i) */

    ComplexNumber add (ComplexNumber num){
        return new ComplexNumber(validPart + num.validPart, imaginaryPart + num.imaginaryPart);
    }
    ComplexNumber mult (ComplexNumber num){
        return new ComplexNumber (validPart + imaginaryPart, num.validPart + num.imaginaryPart);
    }

    String tostring() {
        return validPart +" + ("+imaginaryPart+")i";
    }

}
