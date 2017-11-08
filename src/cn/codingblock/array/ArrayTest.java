package cn.codingblock.array;

import cn.codingblock.utils.log.Logger;

public class ArrayTest {
    public static void main(String[] strs) {
        printArray1(1,2,3);
        printArray2(new Object[] {1,2,3});
    }

    public static void printArray1(Object... objects) {
        for (Object object:objects
             ) {
            Logger.println(object);
        }
    }

    public static void printArray2(Object[] objects) {
        for (Object object:objects
                ) {
            Logger.println(object);
        }
    }
}
