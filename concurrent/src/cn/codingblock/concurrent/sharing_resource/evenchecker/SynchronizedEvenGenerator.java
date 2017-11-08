package cn.codingblock.concurrent.sharing_resource.evenchecker;

public class SynchronizedEvenGenerator extends IntGenerator {
    private int currentEvenValue = 0;

    @Override
    synchronized public int next() {
        ++currentEvenValue;
        ++currentEvenValue;
        return currentEvenValue;
    }


}
