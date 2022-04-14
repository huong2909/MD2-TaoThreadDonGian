package com.company;

public class Main {

    public static void main(String[] args) {
        NumberGenerator numberGenerator1 = new NumberGenerator("Thread1");
        Thread thread1 = new Thread(numberGenerator1);
        NumberGenerator numberGenerator2 = new NumberGenerator("Thread2");
        Thread thread2 = new Thread(numberGenerator2);
        System.out.println("Truoc");
        thread1.start();
        thread2.start();

        thread1.setPriority(1);
        thread2.setPriority(10);
        System.out.println("Sau");
        try {
            thread1.start();
            thread2.start();
        } catch (Exception e) {
            e.getMessage();
        }
    }
}
