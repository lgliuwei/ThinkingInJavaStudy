package cn.codingblock.collection;

import cn.codingblock.utils.log.Logger;

import java.util.HashSet;

public class SetTest {
    public static void main(String[] strs) {
        HashSet<Integer> hashSet1 = new HashSet<>();
        hashSet1.add(1);
        hashSet1.add(2);
        hashSet1.add(2);
        Logger.println(hashSet1);

        HashSet<Bean> hashSet2 = new HashSet<>();
        hashSet2.add(new Bean(1));
        hashSet2.add(new Bean(2));
        hashSet2.add(new Bean(2));
        Logger.println(hashSet2);
    }
}
