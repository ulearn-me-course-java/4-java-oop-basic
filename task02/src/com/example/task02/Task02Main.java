package com.example.task02;

public class Task02Main {
    public static void main(String[] args) {
        TimeSpan time1 = new TimeSpan(1, 150, 70); // 1 час, 150 минут, 70 секунд
        System.out.println("TimeSpan 1: " + time1); // Должно быть 03:01:10

        TimeSpan time2 = new TimeSpan(0, 30, 30); // 30 минут, 30 секунд
        System.out.println("TimeSpan 2: " + time2); // 00:30:30

        time1.add(time2);
        System.out.println("После добавления: " + time1); // Должно быть 03:31:40

        time1.subtract(new TimeSpan(1, 0, 0)); // Вычитаем 1 час
        System.out.println("После вычитания: " + time1); // Должно быть 02:31:40
    }
}
