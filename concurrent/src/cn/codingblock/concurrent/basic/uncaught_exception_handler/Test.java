package cn.codingblock.concurrent.basic.uncaught_exception_handler;

import cn.codingblock.utils.log.Logger;

public class Test {
    public static void main(String[] strs) {
//        try {
//            Thread thread = new Thread(new ExceptionThread());
//            thread.start();
//        } catch (Exception e) {
//            Logger.println("捕获异常：" + e.toString());
//        }

        Thread thread = new Thread(new ExceptionThread());
        thread.setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() {
            @Override
            public void uncaughtException(Thread t, Throwable e) {
                Logger.println("在线程 " + t + " 中捕获异常：" + e.toString());
            }
        });
        thread.start();
    }
}
