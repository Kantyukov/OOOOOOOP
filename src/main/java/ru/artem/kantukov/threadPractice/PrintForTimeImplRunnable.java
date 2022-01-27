package ru.artem.kantukov.threadPractice;

import lombok.AllArgsConstructor;
import lombok.Data;


@AllArgsConstructor

public class PrintForTimeImplRunnable implements Runnable{

    private final String massage;
    private final long time;

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(time);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(massage + " ");
        }
    }
}
