package com.example.task02;

public class Task02Main {
    public static void main(String[] args) {
        TimeSpan time1 = new TimeSpan(1,100,130);
        System.out.println("Время 1 до ");
        System.out.println(time1);
        time1.setSeconds(3000);
        System.out.println("Время 1 после");
        System.out.println(time1);

        time1.setSeconds(-1);

    }
}
