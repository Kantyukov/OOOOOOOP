package ru.artem.kantukov.threadPractice;

public class Practice {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Старт программы с Thread");
        Thread printForTimeWithThread = new PrintForTimeWithThread("Я буду программировать", 5000L);
        printForTimeWithThread.start();
        System.out.println(printForTimeWithThread);
        printForTimeWithThread.join();
        System.out.println("Конец программы с Thread");
        System.out.println("Старт программы с Runnable");

        PrintForTimeImplRunnable printForTimeImplRunnable = new PrintForTimeImplRunnable("Я еще учусь программировать", 5000L);
        Thread thread = new Thread(printForTimeImplRunnable);
        thread.start();
        System.out.println(thread);
        thread.join();
        System.out.println("Конец программы с Runnable");

    }
}
