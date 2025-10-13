package com.example.task02;

public class Task02Main {
    public static void main(String[] args) {
        TimeSpan span1 = new TimeSpan (1, 50, 7);
        TimeSpan span2 = new TimeSpan (0, 76, 100);
        TimeSpan span3 = new TimeSpan (0, 61, 95);
        TimeSpan span4 = new TimeSpan (0, 0, 1);

        System.out.println("Интервал 1: " + span1);
        System.out.println("Интервал 2: " + span2);
        System.out.println("Интервал 3: " + span3);
        System.out.println("Интервал 4: " + span4);

        span1.add(span2);
        System.out.println("После сложения 1 + 2: " + span1);

        span3.subtract(span4);
        System.out.println("После вычитания 3 - 4: " + span3);

        System.out.println("Часы: " + span1.getHours());
        System.out.println("Минуты: " + span1.getMin());
        System.out.println("Секунды: " + span1.getSec());

        span1.setMin(70);
        System.out.println("После сеттера: " + span1);
    }
}
