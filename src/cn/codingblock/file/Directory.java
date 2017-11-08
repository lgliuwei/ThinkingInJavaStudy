package cn.codingblock.file;

import cn.codingblock.utils.log.Logger;

import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.regex.Pattern;

public final class Directory {
    public static File[] local(File dir, final String regex) {
        return dir.listFiles(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                return Pattern.compile(regex).matcher(new File(name).getName()).matches();
            }
        });
    }

    public static File[] local(String path, String regex) {
        return local(new File(path), regex);
    }

    public static TreeInfo walk(File start, String regex) {
        return recurseDirs(start, regex);
    }

    public static TreeInfo walk(File start) {
        return recurseDirs(start, ".*");
    }

    public static TreeInfo walk(String start) {
        return recurseDirs(new File(start), ".*");
    }

    static TreeInfo recurseDirs(File startDir, String regex) {
        TreeInfo result = new TreeInfo();
        for (File item:startDir.listFiles()) {
            if (item.isDirectory()) {
                result.dirs.add(item);
                result.addAll(recurseDirs(item, regex));
            } else if (item.getName().matches(regex)){
                result.files.add(item);
            }
        }

        return result;
    }

    public static class TreeInfo implements Iterable<File> {

        public List<File> files = new ArrayList<>();
        public List<File> dirs = new ArrayList<>();

        @Override
        public Iterator<File> iterator() {
            return files.iterator();
        }

        void addAll(TreeInfo other) {
            files.addAll(other.files);
            dirs.addAll(other.dirs);
        }

        @Override
        public void forEach(Consumer<? super File> action) {

        }

        @Override
        public Spliterator<File> spliterator() {
            return null;
        }

        @Override
        public String toString() {
            return "dirs:" + PPrint.pFormat(dirs)
                    + "\n\nfiles:" + PPrint.pFormat(files);
        }
    }

    public static void main(String[] strs) {
        Logger.println(walk("."));
    }
}
