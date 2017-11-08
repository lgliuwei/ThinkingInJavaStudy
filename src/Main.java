import cn.codingblock.finalize.Tank;
import cn.codingblock.utils.log.Logger;

public class Main {
    public static void main(String[] strs) {
        //第三章 操作符
        // 移位操作符
//        int i = 10;
//        i >>= 1;
//        Logger.println("二进制：" + Integer.toBinaryString(i));
//
//        staticMethod(new Main());

        Tank tank = new Tank();
        tank.setEmpty(false);
        Tank tank1 = new Tank();
        System.gc();

    }

    public static void staticMethod(Main main) {
        main.printInfo();
    }

    public void printInfo(){
        System.out.println("我是一个非静态方法");
    }
}
