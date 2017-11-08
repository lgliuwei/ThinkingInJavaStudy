package cn.codingblock.concurrent.basic.daemon;

import cn.codingblock.utils.log.Logger;

public class Test {
    public static void main(String[] strs) {
        Thread thread = new Thread(new DaemonTask());
        thread.setDaemon(true);// 需要在调用start前设置为后台线程
        thread.start();
        try {
            Logger.println("5s后非后台（这里是主线程）执行完毕，整个程序也随之完毕");
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
