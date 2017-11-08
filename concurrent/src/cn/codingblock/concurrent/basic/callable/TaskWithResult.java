package cn.codingblock.concurrent.basic.callable;

import cn.codingblock.utils.log.Logger;

import java.util.concurrent.Callable;

public class TaskWithResult implements Callable<String> {

    private int id;
    private int time = 5;

    public TaskWithResult(int id) {
        this.id = id;
    }

    @Override
    public String call() throws Exception {
        while (time-- > 0) {
            Logger.println("执行耗时任务剩余时间：" + time);
            Thread.sleep(1000);
        }
        return "#" + id;
    }
}
