package cn.codingblock.file;

import cn.codingblock.utils.log.Logger;

import java.io.File;
import java.io.FilenameFilter;
import java.util.regex.Pattern;

public class DirList {

    public static void main(String[] strs) {
        File path = new File("./src/");

        String[] fileList = path.list(new DirList().new DirFilter("*.java"));
//        String[] fileList = path.list();

        for (String fileName : fileList) {
            Logger.println("./" + fileName);
        }
    }

    class DirFilter implements FilenameFilter {

        private Pattern pattern;

        public DirFilter(String regex) {
            pattern = Pattern.compile(regex);
        }

        @Override
        public boolean accept(File dir, String name) {
            return pattern.matcher(name).matches();
        }
    }

}
