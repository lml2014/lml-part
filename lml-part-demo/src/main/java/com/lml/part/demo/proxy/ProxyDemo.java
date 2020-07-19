package com.lml.part.demo.proxy;

/**
 * @author shuishan
 * @date 2020/5/8
 */
public class ProxyDemo {

    public static int i = 0;

    public static void main(String[] args) {
        Runtime.getRuntime().addShutdownHook(new Thread(() -> System.out.println("end data:" + i)));

        OrderService orderService = new OrderServiceImpl();
        OrderProxy orderProxy = new OrderProxy(orderService);
        OrderService proxy = (OrderService) orderProxy.getProxy();
        System.out.println(proxy.getClass().getName());
        proxy.test1();
        proxy.test2();
        while (true) {
            i++;
        }
    }
}
