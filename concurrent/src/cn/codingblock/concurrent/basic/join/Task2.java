package cn.codingblock.concurrent.basic.join;

import cn.codingblock.utils.log.Logger;

public class Task2 extends Thread {
    int n = 5;
    Task1 task;

    public Task2(Task1 task) {
        this.task = task;
        start();
    }

    @Override
    public void run() {
        super.run();
        try {
            task.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        while (n-- > 0) {
            Logger.println("Task2剩余执行时间:" + n);
        }
    }
}
