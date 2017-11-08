package cn.codingblock.concurrent.basic;

import cn.codingblock.utils.log.Logger;

/**
 *3 6
 * 9
 */
public class LiftOff implements Runnable {
    private int time = 10;
    private static int count = 0;
    private final int id = count++;
    private String status() {
        return "#" + id + " : "+ time;
    }
    @Override
    public void run() {
        while (time-- > 0) {
            Logger.println(status() + " : " + Thread.currentThread());

            Thread.yield();// Java线程机制的一部分，可以将cpu从一个线程转移到另一个线程
        }
    }
}
