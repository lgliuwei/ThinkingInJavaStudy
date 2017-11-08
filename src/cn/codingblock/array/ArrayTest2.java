package cn.codingblock.array;

import cn.codingblock.utils.log.Logger;

import java.lang.reflect.Array;
import java.util.Arrays;


public class ArrayTest2 {
    public static void main(String[] strs) {
        // 1、多维数组
        int[][] a = {
                {0, 0},
                {0, 0, 0},
                {0}
        };
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                Logger.print(a[i][j] + ", ");
            }
            Logger.println("");
        }

        // 2、System.arrayCopy
        int[] a1 = new int[5];
        int[] a2 = new int[10];
        Arrays.fill(a1, 1);
        Arrays.fill(a2, 2);
        Logger.println(Arrays.toString(a1));
        Logger.println(Arrays.toString(a2));
        System.arraycopy(a1, 1, a2, 2, a1.length - 1);
        Logger.println(Arrays.toString(a1));
        Logger.println(Arrays.toString(a2));
        Arrays.fill(a1, 3);
        Logger.println(Arrays.toString(a1));
        Logger.println(Arrays.toString(a2));

    }
}
