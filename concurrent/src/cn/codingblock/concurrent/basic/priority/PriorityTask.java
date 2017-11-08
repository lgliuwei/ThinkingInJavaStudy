package cn.codingblock.concurrent.basic.priority;

import cn.codingblock.utils.log.Logger;

public class PriorityTask implements Runnable {

    private int priorityId;
    private int time = 5;

    public PriorityTask(int priorityId) {
        this.priorityId = priorityId;
    }

    @Override
    public void run() {
        Thread.currentThread().setPriority(priorityId);
//        while (time-- > 0) {

            for (int i = 0; i < 10000000; i++) {
                double d = (Math.PI + Math.E) / (double) i;
                if (i % 1000 == 0)
                    Thread.yield();
            }

            Logger.println("#time="+ time + " : " + Thread.currentThread() + "priorityId=" + priorityId);
//            Thread.yield();
//        }
    }
}
