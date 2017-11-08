package cn.codingblock.concurrent.sharing_resource.evenchecker;

public class Test {
    public static void main(String[] strs) {
        EvenChecker.test(new EvenGenerator());
    }
}
