package cn.codingblock.concurrent.sharing_resource.evenchecker;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockEvenGenerator extends IntGenerator {
    private int currentEvenValue = 0;
    Lock lock = new ReentrantLock();
    @Override
    public int next() {
        lock.lock();
        try {
            ++currentEvenValue;
            ++currentEvenValue;
            return currentEvenValue;
        } finally {
            lock.unlock();
        }
    }
    public static void main(String[] strs) {
        EvenChecker.test(new LockEvenGenerator());
    }
}
