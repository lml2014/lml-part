package com.lml.part.dubbo.spi;

import java.util.Iterator;
import java.util.ServiceLoader;

/**
 * @author shuishan
 * @date 2020/3/15
 */
public class SpiDemo {

    public static void main(String[] args) {
        ServiceLoader<Robot> serviceLoader = ServiceLoader.load(Robot.class);
        System.out.println("java spi. ");
        Iterator<Robot> iterator = serviceLoader.iterator();
        while (iterator.hasNext()) {
            Robot robot = iterator.next();
            robot.sayHello();
        }
    }
}
