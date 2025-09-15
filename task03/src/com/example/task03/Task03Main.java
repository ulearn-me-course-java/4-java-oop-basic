package com.example.task03;

public class Task03Main {
    public static void main(String[] args) {

        ComplexNumber cnum1 = new ComplexNumber(123,123);
        ComplexNumber cnum2 = new ComplexNumber(1223,0.123);

        System.out.println(cnum1.add(cnum2).toString());
        System.out.println(cnum1.mult(cnum2).toString());
        System.out.println(cnum1.toString());

    }
}

//Создайте класс комплексного числа, описав все необходимые свойства. Подберите понятные имена и правильные типы данных
//Опишите в классе конструктор, позволяющий при создании инициализировать все его свойства.
//Добавьте в класс методы, позволяющие вычислить сумму и произведение комплексного числа с другим комплексным числом. Метод должен возвращать новый объект, не изменяя старое
//Используя построенный класс напишите код, где вы создадите два комплексных числа и посчитаете их сумму и произведение.