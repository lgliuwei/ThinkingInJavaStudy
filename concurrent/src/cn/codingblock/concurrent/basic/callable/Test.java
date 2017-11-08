package cn.codingblock.concurrent.basic.callable;

import cn.codingblock.utils.log.Logger;

import java.util.concurrent.*;

public class Test {
    public static void main(String[] strs) {
        ExecutorService executorService = Executors.newCachedThreadPool();
        Future<String> result = executorService.submit(new TaskWithResult(1));
        try {
//            while (true) {
//                if (result.isDone()) {
            Logger.println("主线程tag1");
            Logger.println("返回值：" + result.get());
            Logger.println("主线程tag2");

//                    break;
//                } else {
//                    Logger.println("未执行完毕");
//                    Thread.yield();
//                }
//            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

    }
}
