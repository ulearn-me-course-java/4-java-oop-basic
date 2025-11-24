package com.example.task02;

public class Task02Main {
    public static void main(String[] args) {
        System.out.println("--- Тест конструктора и нормализации ---");
        // Тест: 0 часов, 100 минут, 0 секунд -> должно стать 1 ч 40 мин 0 сек
        TimeSpan t1 = new TimeSpan(0, 100, 0);
        System.out.println("Создали (0, 100, 0): " + t1);

        System.out.println("\n--- Тест метода add ---");
        // Добавляем к t1 (1:40:00) еще 1 час 30 минут
        TimeSpan t2 = new TimeSpan(1, 30, 0);
        t1.add(t2);
        System.out.println("После добавления (1 ч 30 мин): " + t1);
        // Ожидаем: 3 ч 10 мин 0 сек

        System.out.println("\n--- Тест метода subtract ---");
        // Вычитаем 2 часа 15 минут 10 секунд
        TimeSpan t3 = new TimeSpan(2, 15, 10);
        t1.subtract(t3);
        System.out.println("После вычитания (2 ч 15 мин 10 сек): " + t1);

        System.out.println("\n--- Тест сеттеров ---");
        // Устанавливаем 125 секунд
        t1.setSeconds(125);
        System.out.println("Установили 125 секунд: " + t1);
    }
}