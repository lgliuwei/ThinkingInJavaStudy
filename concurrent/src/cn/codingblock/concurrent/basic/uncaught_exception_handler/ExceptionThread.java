package cn.codingblock.concurrent.basic.uncaught_exception_handler;

public class ExceptionThread implements Runnable {
    @Override
    public void run() {
        throw new RuntimeException();
    }
}
