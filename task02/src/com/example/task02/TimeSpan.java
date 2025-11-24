package com.example.task02;

/**
 * Класс для хранения временного интервала
 */
public class TimeSpan {
    private int hours;
    private int minutes;
    private int seconds;

    // Конструктор
    public TimeSpan(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
        normalize(); // Сразу приводим к нормальному виду
    }

    // --- Геттеры и Сеттеры ---
    // В сеттерах обязательно вызываем normalize(), так как пользователь
    // может установить, например, 100 минут.

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
        // Часы могут быть любыми, нормализация не требуется (если не ограничиваем дни)
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
        normalize();
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
        normalize();
    }

    // --- Логика ---

    /**
     * Метод сложения интервалов.
     * Меняем текущее состояние объекта.
     */
    void add(TimeSpan time) {
        this.hours += time.hours;
        this.minutes += time.minutes;
        this.seconds += time.seconds;
        normalize();
    }

    /**
     * Метод вычитания интервалов.
     */
    void subtract(TimeSpan time) {
        this.hours -= time.hours;
        this.minutes -= time.minutes;
        this.seconds -= time.seconds;
        normalize();
    }

    /**
     * Приватный метод для приведения времени к корректному формату.
     * Обрабатывает и переполнение (секунд > 60), и отрицательные значения (при вычитании).
     */
    private void normalize() {
        // 1. Обработка переполнения (например, 65 секунд -> 1 мин 5 сек)
        if (seconds >= 60) {
            minutes += seconds / 60;
            seconds = seconds % 60;
        }
        if (minutes >= 60) {
            hours += minutes / 60;
            minutes = minutes % 60;
        }

        // 2. Обработка отрицательных значений (заем)
        // Если секунд < 0, занимаем у минут
        while (seconds < 0) {
            minutes--;
            seconds += 60;
        }
        // Если минут < 0, занимаем у часов
        while (minutes < 0) {
            hours--;
            minutes += 60;
        }

        // Если часы ушли в минус, можно либо обнулить, либо оставить как есть (отрицательный интервал)
        // В данном решении оставим 0, если интервал стал полностью отрицательным
        if (hours < 0) {
            hours = 0;
            minutes = 0;
            seconds = 0;
        }
    }

    @Override
    public String toString() {
        return String.format("%d ч %d мин %d сек", hours, minutes, seconds);
    }
}