package ru.netology;

public class MyThread extends Thread {
    private static final int TIME_TO_SLEEP = 2_000;

    public MyThread(ThreadGroup group, String name) {
        super(group, name);
    }

    @Override
    public void run() {
        while (true) {
            if (isInterrupted()) {
                System.out.printf("%s завершен\n", getName());
                return;
            }
            System.out.println("Я поток " + getName() + ". Всем привет!");
            try {
                Thread.sleep(TIME_TO_SLEEP);
            } catch (InterruptedException e) {
                System.out.println("Поток " + getName() + " завершен во время сна");
                return;
            }
        }
    }
}
