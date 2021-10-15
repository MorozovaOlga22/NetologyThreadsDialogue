package ru.netology;

public class Main {
    private static final int TIME_TO_SLEEP = 15_000;

    public static void main(String[] args) throws InterruptedException {
        final ThreadGroup threadGroup = new ThreadGroup("Main group");

        System.out.println("Создаю потоки...");
        new MyThread(threadGroup, "1").start();
        new MyThread(threadGroup, "2").start();
        new MyThread(threadGroup, "3").start();
        new MyThread(threadGroup, "4").start();

        Thread.sleep(TIME_TO_SLEEP);

        System.out.println("Завершаю все потоки.");
        threadGroup.interrupt();
    }
}
