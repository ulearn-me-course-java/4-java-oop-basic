package com.example.task02;

import java.sql.Time;

public class Task02Main {
    public static void main(String[] args)
    {
        TimeSpan newTime = new TimeSpan(110, 125, 150);
        TimeSpan newTime2 = new TimeSpan(3, 5, 20);
        TimeSpan newTime3 = new TimeSpan(5, 5, 10);
        TimeSpan errorTime4 = new TimeSpan(1000, 50, 6);
        String stringTime = newTime.toString();
        System.out.println(stringTime);
        newTime.add(newTime2);
        String stringTime2 = newTime.toString();
        System.out.println(stringTime2);
        newTime.subtract(newTime3);
        String stringTime3 = newTime.toString();
        System.out.println(stringTime3);
        // Если вычитаемое время больше, то программа будет выкидывать ошибку IllegalArgumentException "Incorrect".
        // newTime.subtract(errorTime4);
    }
}
