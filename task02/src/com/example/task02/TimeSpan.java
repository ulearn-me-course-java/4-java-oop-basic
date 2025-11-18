package com.example.task02;

public class TimeSpan {

    private int inHours;
    private int inMinutes;
    private int inSeconds;

    public TimeSpan(int hours, int minutes, int seconds) {
        if (hours < 0 || minutes < 0 || seconds < 0) {
            throw new IllegalArgumentException("Все компоненты временного интервала должны быть неотрицательными");
        }
        this.inHours = hours;
        this.inMinutes = minutes;
        this.inSeconds = seconds;
        transformTime(); // на случай, если минут/секунд ≥ 60
    }

    public int getHours() {
        return inHours;
    }

    public void setHours(int hours) {
        if (hours < 0) {
            throw new IllegalArgumentException("Часы не могут быть отрицательными");
        }
        this.inHours = hours;
        transformTime(); // на случай нормализации полей
    }

    public int getMinutes() {
        return inMinutes;
    }

    public void setMinutes(int minutes) {
        if (minutes < 0) {
            throw new IllegalArgumentException("Минуты не могут быть отрицательными");
        }
        this.inMinutes = minutes;
        transformTime();
    }

    public int getSeconds() {
        return inSeconds;
    }

    public void setSeconds(int seconds) {
        if (seconds < 0) {
            throw new IllegalArgumentException("Секунды не могут быть отрицательными");
        }
        this.inSeconds = seconds;
        transformTime();
    }

    private void transformTime() {
        // Обработка секунд
        if (inSeconds >= 60) {
            inMinutes += inSeconds / 60;
            inSeconds %= 60;
        } else if (inSeconds < 0) {
            int borrow = (-inSeconds + 59) / 60; // сколько минут занять
            inMinutes -= borrow;
            inSeconds += borrow * 60;
        }

        // Обработка минут
        if (inMinutes >= 60) {
            inHours += inMinutes / 60;
            inMinutes %= 60;
        } else if (inMinutes < 0) {
            int borrow = (-inMinutes + 59) / 60; // сколько часов занять
            inHours -= borrow;
            inMinutes += borrow * 60;
        }

        if (inHours < 0) {
            throw new IllegalStateException("Нельзя получить отрицательный временной интервал: результат вычитания недопустим");
        }

        // на случай переносов после заимствований
        if (inMinutes >= 60) {
            inHours += inMinutes / 60;
            inMinutes %= 60;
        }
        if (inSeconds >= 60) {
            inMinutes += inSeconds / 60;
            inSeconds %= 60;
        }
    }

    public void add(TimeSpan time) {
        this.inHours += time.inHours;
        this.inMinutes += time.inMinutes;
        this.inSeconds += time.inSeconds;
        transformTime();
    }

    public void subtract(TimeSpan time) {
        this.inHours -= time.inHours;
        this.inMinutes -= time.inMinutes;
        this.inSeconds -= time.inSeconds;
        transformTime();
    }

    public String toString() {
        return String.format("Временной интервал: %d ч %d мин %d сек", inHours, inMinutes, inSeconds);
    }
}
