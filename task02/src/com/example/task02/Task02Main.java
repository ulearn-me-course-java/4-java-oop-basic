package com.example.task02;

public class Task02Main {
    public static void main(String[] args) throws Exception {
        TimeSpan timeSpan1 = new TimeSpan(10,59,59);
        timeSpan1.add(new TimeSpan(0,59,59));
        System.out.println(timeSpan1.toString());

        TimeSpan timeSpan2 = new TimeSpan(10,10,58);
        timeSpan2.subtract(new TimeSpan(10,10,58));
        System.out.println(timeSpan2.toString());

        TimeSpan timeSpan3 = new TimeSpan(0,0,1);
        timeSpan3.add(new TimeSpan(0,59,59));
        System.out.println(timeSpan3.toString());

        TimeSpan timeSpan4 = new TimeSpan(10,10,30);
        timeSpan4.subtract(new TimeSpan(1,1,50));
        System.out.println(timeSpan4.toString());

        TimeSpan timeSpan5 = new TimeSpan(10,0,30);
        timeSpan5.subtract(new TimeSpan(1,0,50));
        System.out.println(timeSpan5.toString());
    }
}
