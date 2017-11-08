package cn.codingblock.reference.weakhashmap;

import java.util.WeakHashMap;

public class Test {
    public static void main(String[] strs) {
        int size = 100;
        Key[] a = new Key[100];
        WeakHashMap<Key, Value> weakHashMap = new WeakHashMap<>();

        for (int i = 0; i < size; i++) {
            Key key = new Key(i+"");
            Value value = new Value(i + "");
            if (i % 3 == 0) {
                a[i] = key;
            }
            weakHashMap.put(key, value);
        }

        System.gc();

        System.out.println(weakHashMap);
    }
}
