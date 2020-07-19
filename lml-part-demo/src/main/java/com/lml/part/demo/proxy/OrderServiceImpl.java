package com.lml.part.demo.proxy;

/**
 * @author shuishan
 * @date 2020/5/8
 */
public class OrderServiceImpl implements OrderService {

    @Override
    public void test1() {
        System.out.println("--- run test1 ---");
    }

    @Override
    public void test2() {
        System.out.println("--- run test2 ---");
    }
}
