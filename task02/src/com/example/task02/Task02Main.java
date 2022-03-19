package com.example.task02;

public class Task02Main {
    public static void main(String[] args) {
        TimeSpan t = new TimeSpan(2, 20, 30);
        TimeSpan t1 = new TimeSpan(2, 20, 30);
        t.subtract(t1);
        System.out.println(t.toString());

        TimeSpan t2 = new TimeSpan(2, 240, 30);
        t.add(t2);
        System.out.println(t2.toString());

        TimeSpan t3 = new TimeSpan();
        t3.setMinutes(240);
        System.out.println(t3.toString());

        t3.setHours(-10);
        System.out.println(t3.toString());

        t3.add(t1);
        System.out.println(t3.toString());

        t3.subtract(t1);
        System.out.println(t3.toString());
    }
}
