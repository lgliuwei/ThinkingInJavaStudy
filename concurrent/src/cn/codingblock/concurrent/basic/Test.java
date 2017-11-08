package cn.codingblock.concurrent.basic;

import cn.codingblock.utils.log.Logger;

public class Test {
    public static void main(String[] strs) {
        // 调用方式一：直接调用,直接调用run方法达不到多线程的目的，就类似普通的方法，还是同步执行。
        LiftOff liftOff = new LiftOff();
//        liftOff.run();

        // 调用方式二：将工作任务提交给Thread
        Thread thread = new Thread(liftOff);
        thread.run();
        int n = 5;
        while (n-- > 0) {
//            new Thread(new LiftOff()).start();
            Logger.println(Thread.currentThread());
        }
//        Logger.println("over");
    }
}
