package com.example.task02;

public class Task02Main {
    public static void main(String[] args) {
        TimeSpan t1 = new TimeSpan(3,27,12);
        TimeSpan t2 = new TimeSpan(1,15,34);

        t1.add(t2);
        System.out.println(t1.toString());

        TimeSpan t3 = new TimeSpan(0,100,0);
        System.out.println(t3.toString());
    }
}
