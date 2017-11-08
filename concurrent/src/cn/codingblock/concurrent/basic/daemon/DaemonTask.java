package cn.codingblock.concurrent.basic.daemon;

import cn.codingblock.utils.log.Logger;

public class DaemonTask implements Runnable {
    @Override
    public void run() {
        while (true) {
            Logger.println("我是后台线程，正在运行...");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
