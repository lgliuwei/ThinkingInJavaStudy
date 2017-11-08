package cn.codingblock.concurrent.basic.join;

import cn.codingblock.utils.log.Logger;

public class Task1 extends Thread {
    int n = 5;

    public Task1() {
        start();
    }

    public void run() {
        while (n-- > 0) {
            Logger.println("Task1剩余执行时间:" + n);
        }
    }
}
