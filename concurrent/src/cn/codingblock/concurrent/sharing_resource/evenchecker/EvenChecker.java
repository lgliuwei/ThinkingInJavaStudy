package cn.codingblock.concurrent.sharing_resource.evenchecker;

import cn.codingblock.utils.log.Logger;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class EvenChecker implements Runnable {
    private IntGenerator intGenerator;
    private int id;

    public EvenChecker(IntGenerator intGenerator, int id) {
        this.intGenerator = intGenerator;
        this.id = id;
    }

    @Override
    public void run() {
        while (!intGenerator.isCanceled()) {
            int val = intGenerator.next();
            if (val % 2 != 0) {
                Logger.println(val + " is not a even !");
                intGenerator.cancel();
            }
        }
    }

    public static void test(IntGenerator intGenerator, int count) {
        ExecutorService executorService = Executors.newCachedThreadPool();
        while (count-- > 0) {
            executorService.execute(new EvenChecker(intGenerator, count));
        }
        executorService.shutdown();
    }

    public static void test(IntGenerator intGenerator) {
        test(intGenerator, 10);
    }
}
