package ru.artem.kantukov.threadPractice.task1;

public record PrintForTimeImplRunnable(String massage, long time) implements Runnable {

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
