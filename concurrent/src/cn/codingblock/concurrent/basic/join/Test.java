package cn.codingblock.concurrent.basic.join;

public class Test {
    public static void main(String[] strs) {
        Task1 task1 = new Task1();
        Task2 task2 = new Task2(task1);
    }
}
