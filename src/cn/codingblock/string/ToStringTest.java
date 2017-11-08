package cn.codingblock.string;

import cn.codingblock.utils.log.Logger;

public class ToStringTest {

    @Override
    public String toString() {
        return "ToStringTest:";// + this; // 在 toString 方法里面调用 this 关键字会产生递归调用自身，最终导致 StackOverflowError
    }

    public static void main(String[] strs) {
        ToStringTest toStringTest = new ToStringTest();
        Logger.println(toStringTest);
    }
}
