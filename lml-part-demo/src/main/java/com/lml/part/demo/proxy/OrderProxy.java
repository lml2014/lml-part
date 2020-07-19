package com.lml.part.demo.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * public final class $Proxy0
 * extends Proxy
 * implements OrderService {
 * private static Method m1;
 * private static Method m2;
 * private static Method m4;
 * private static Method m3;
 * private static Method m0;
 * <p>
 * public $Proxy0(InvocationHandler invocationHandler) {
 * super(invocationHandler);
 * }
 * }
 *
 * @author shuishan
 * @date 2020/5/8
 */
public class OrderProxy implements InvocationHandler {

    private Object target;

    public OrderProxy(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("=== proxy before ===");
        Object result = method.invoke(target, args);
        System.out.println("=== proxy end ===");
        return result;
    }

    public Object getProxy() {
        Class<?>[] classes = target.getClass().getInterfaces();

        Class<?>[] proxies = new Class[classes.length + 1];
        System.arraycopy(classes, 0, proxies, 0, classes.length);
        proxies[proxies.length - 1] = OrderAOP.class;

        return Proxy.newProxyInstance(Thread.currentThread().getContextClassLoader(), proxies, this);
    }
}
