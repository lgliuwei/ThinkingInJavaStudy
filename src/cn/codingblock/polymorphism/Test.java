package cn.codingblock.polymorphism;

import cn.codingblock.utils.log.Logger;

public class Test {
    public static void main(String[] strs) {
        SuperClass subClass = new SubClass();
        Logger.println(subClass.field);
        Logger.println(subClass.getField());// 只有普通的方法调用是多态的（因为方法调用时后期绑定）
        // 在 sub 对象转型为 super 对象时，任何域访问操作都是编译器解析，因此不是多态的。
        SubClass subClass1 = new SubClass();
        Logger.println(subClass1.field);
        Logger.println(subClass1.getField());
        Logger.println(subClass1.getSuperField());
    }
}
