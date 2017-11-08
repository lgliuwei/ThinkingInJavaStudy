package cn.codingblock.statics;

import cn.codingblock.utils.log.Logger;

public class TestClass2 {
    TestClass1 testClass1;
    {
        testClass1 = new TestClass1();
        Logger.println("{}");
    }
    public TestClass2() {
        Logger.println("TestClass2");
    }
}
