package cn.codingblock.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * 容器的快速报错机制测试
 */
public class ConcurrentModificationExceptionTest {

    public static void main(String[] strs) {
        Collection<String> collection = new ArrayList<>();
        Iterator<String> iterator = collection.iterator();
        collection.add("1");

        try {
            iterator.next();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
