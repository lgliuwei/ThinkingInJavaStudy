package cn.codingblock.file;

import cn.codingblock.utils.log.Logger;

import java.util.Arrays;
import java.util.Collection;

public class PPrint {
    public static String pFormat(Collection<?> c) {
        if (c.size() == 0) return "[]";
        StringBuilder result = new StringBuilder("[");

        for (Object element: c) {
            if (c.size() != 1){
                result.append("\n ");
            }
            result.append(element);
        }

        if (c.size() != 1) {
            result.append("\n ");
        }

        result.append("]");
        return result.toString();
    }

    public static void pprint(Collection<?> c) {
        Logger.println(pFormat(c));
    }

    public static void pprint(Object[] objects) {
        Logger.println(pFormat(Arrays.asList(objects)));
    }
}
