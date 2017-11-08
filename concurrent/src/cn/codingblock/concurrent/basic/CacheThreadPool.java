package cn.codingblock.concurrent.basic;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CacheThreadPool {
    public static void main(String[] strs) {
//        ExecutorService executor = Executors.newCachedThreadPool();
//        ExecutorService executor = Executors.newFixedThreadPool(2);
        ExecutorService executor = Executors.newSingleThreadExecutor();
        int n = 3;
        while (n-- > 0) {
            executor.execute(new LiftOff());
        }
        executor.shutdown();
    }
}
