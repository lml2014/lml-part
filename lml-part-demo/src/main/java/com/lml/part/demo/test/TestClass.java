package com.lml.part.demo.test;

/**
 * @author shuishan
 * @date 2020/7/19
 */
public class TestClass {

    private int m;

    private Test test;

    public int inc() {
        return m + 1;
    }

    public long add() {
        long name = 123L;
        name = name + m;
        return name;
    }

    public void testMethod() {
        test.show();
        int code = test.hashCode();
        System.out.println(code);
    }

    public static void main(String[] args) {
        int a = 120;
        int b = 220;
        int c = a + b;
        TestClass testClass = new TestClass();
        testClass.inc();
    }
}
