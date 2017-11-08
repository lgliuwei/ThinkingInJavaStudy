package cn.codingblock.polymorphism;

public class SubClass extends SuperClass {
    public int field = 1;

    public int getField() {
        return field;
    }

    public int getSuperField() {
        return super.field;
    }
}
