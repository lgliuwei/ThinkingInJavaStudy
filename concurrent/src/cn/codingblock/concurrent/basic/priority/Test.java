package cn.codingblock.concurrent.basic.priority;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test {
    public static void main(String[] strs) {
        ExecutorService executorService = Executors.newCachedThreadPool();
//        int n = 3;

//        while (n-- > 0) {
            executorService.execute(new PriorityTask(Thread.MIN_PRIORITY));
            executorService.execute(new PriorityTask(Thread.MAX_PRIORITY));
            executorService.execute(new PriorityTask(Thread.NORM_PRIORITY));
//        }

        executorService.shutdown();


    }
}
