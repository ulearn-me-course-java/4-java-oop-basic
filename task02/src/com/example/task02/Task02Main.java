package com.example.task02;

public class Task02Main {
    public static void main(String[] args) {
        System.out.println(Integer.MAX_VALUE);
        System.out.println("\tARGS\t\t|\t VALUES");
        createAndPrint(3,41,17);
        createAndPrint(0,90,126);

        TimeSpan t1 = new TimeSpan(1,50,25);
        TimeSpan t2 = new TimeSpan(2,30,10);
        TimeSpan t3 = new TimeSpan(5,8,40);

        System.out.println("\n\tADD");
        addAndPrint(t1,t3);
        addAndPrint(t1,t2);

        System.out.println("\n\tSUBTRACT");
        subtractAndPrint(t2,t1);
        subtractAndPrint(t1,t3);
    }

    public static void createAndPrint(int h, int m, int s){
        System.out.print(String.format("%dh %dm %ds \t|\t", h, m, s));
        System.out.println(new TimeSpan(h, m, s));
    }

    public static void addAndPrint(TimeSpan t1, TimeSpan t2) {
        System.out.print(t1);
        System.out.print(" + ");
        System.out.print(t2);
        t1.add(t2);
        System.out.print(" = ");
        System.out.println(t1);
    }

    public static void subtractAndPrint(TimeSpan t1, TimeSpan t2) {
        System.out.print(t1);
        System.out.print(" - ");
        System.out.print(t2);
        t1.subtract(t2);
        System.out.print(" = ");
        System.out.println(t1);
    }
}
