package ru.artem.kantukov.threadPractice.task2;

public class ThreadPractice {
    public static void main(String[] args)  {
        Runnable anonymousRunnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Привет я Runnable");
            }
        };
        anonymousRunnable.run();
        Thread thread = new Thread(anonymousRunnable);
        thread.start();

        Runnable funcRunnable = () ->{
            for (int i = 0; i < 4; i++) {
                System.out.println("Привет я проснулся после 4 секунд");
                try {
                    Thread.sleep(3000L);

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        Thread thread1 = new Thread(funcRunnable);
        thread1.setDaemon(true);
        thread1.start();



    }
}
